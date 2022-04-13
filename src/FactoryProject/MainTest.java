
package FactoryProject;

import java.util.ArrayList;

/**
 * @author Hoanh Nguyen, Leslie Ortega, Phoenix Ngan, Steven Dao
 * @version 1.0
 * Due Date: May 5th, 2021, 2:00pm
 *
 * Purpose: Demonstrate the Factory Design pattern by creating a
 *          variety of Terra objects.
 *
 * Target Output: A simulation of terra-forming via user input and
 *          invoking the relevant classes.
 */
public class MainTest {
	private static Planet myPlanet;

	/**
	 * Tests the methods/constructors of the TerraObject classes.
	 *
	 * @param args the command line arguments for the application
	 */
	public static void main(String[] args) {

		Menu0();

	}// end main

	/**
	 * Displays the first menu which asks for the name of the planet.
	 */
	private static void Menu0() {
		System.out.println("Welcome to the TerraForming Program");

		try {
			String planetName = CheckInput.getName();
			Menu1(planetName);

		} catch (NameException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Displays the second menu which asks for the size of the planet.
	 *
	 * @throws IllegalArgumentException the exception which displays the input error message
	 */
	private static void Menu1(String planetName) throws IllegalArgumentException {
		System.out.println("\nWhat size planet do you want?");
		System.out.println("1) small,");
		System.out.println("2) medium,");
		System.out.println("3) large,");
		System.out.println("4) extra large");
		System.out.print(" >> ");

		boolean isValid = false;
		// execute the input loop while the input is not valid
		do {
			try {

				int input = CheckInput.getIntRange(1, 4);
				isValid = true;

				if (input == 1) {
					myPlanet = new Planet(planetName, 1);
					Menu2();
				} else if (input == 2) {
					myPlanet = new Planet(planetName, 2);
					Menu2();
				} else if (input == 3) {
					myPlanet = new Planet(planetName, 3);
					Menu2();
				} else {
					myPlanet = new Planet(planetName, 4);
					Menu2();
				}

			} catch (IllegalArgumentException error) {
				System.out.print("The input must be an integer within the range; please try again: ");
			}
		} while (!isValid);

	}// end menu 1

	/**
	 * Displays the third menu which asks for the distribution of categories.
	 *
	 * @throws IllegalArgumentException the exception which displays the input error message
	 */
	private static void Menu2() throws IllegalArgumentException {

		System.out.println("\nHow do you want to distribute the categories (use percentage):");
		while (myPlanet.getPercentage() >= 0) {
			if (myPlanet.getPercentage() != 0) {
				System.out.println("Percentage remaining: " + myPlanet.getPercentage() + "%");
				System.out.print("Enter water percentage: ");
				myPlanet.setWater(CheckInput.getPercentageAsInt(myPlanet.getPercentage()));
			}
			if (myPlanet.getPercentage() != 0) {
				System.out.println("Percentage remaining: " + myPlanet.getPercentage() + "%");
				System.out.print("Enter plant percentage: ");
				myPlanet.setPlant(CheckInput.getPercentageAsInt(myPlanet.getPercentage()));
			}
			if (myPlanet.getPercentage() != 0) {
				System.out.println("Percentage remaining: " + myPlanet.getPercentage()+ "%");
				System.out.print("Enter mineral percentage: ");
				myPlanet.setMineral(CheckInput.getPercentageAsInt(myPlanet.getPercentage()));
			}
			if (myPlanet.getPercentage() != 0) {
				System.out.println("Percentage remaining: " + myPlanet.getPercentage()+ "%");
				System.out.print("Enter animal percentage: ");
				myPlanet.setAnimal(CheckInput.getPercentageAsInt(myPlanet.getPercentage()));
			} else {
				break;
			}
		}
		System.out.println("\nYou chose the following:");
		System.out.println(myPlanet);
		System.out.println("Enter \"yes\" to continue with these choices and \"no\" to return to the menu.");
		System.out.print(" >> ");

		boolean isValid = false;
		// execute the input loop while the input is not "yes" or "no"
		do {
			try {

				// this call will trigger an IllegalArgumentException if the input is not "yes" or "no"
				boolean userChoseYes = CheckInput.checkYesNo();
				// if we've reached this far, the exception wasn't triggered; update the flag
				isValid = true;

				if (userChoseYes) {
					Menu3();
				} else {
					myPlanet.resetPer();
					Menu2();
				}

			} catch (IllegalArgumentException error) {
				System.out.print("The input must be either \"yes\" or \"no\"; please try again: ");
			}

		} while (!isValid);
	}// end menu2

	/**
	 * Displays the fourth menu which displays the list of created categories and its objects.
	 *
	 * @throws IllegalArgumentException the exception which displays the input error message
	 */
	private static void Menu3() throws IllegalArgumentException {

		// demonstrates the Factory Design Pattern
		myPlanet.buildThePlanet();

		System.out.print("\n-------------------------" +
						"\n    TerraForming Menu" +
						"\n-------------------------" +
						"\n\nPlanet Name: " + myPlanet.getName() +
						", TerraObjects: " + myPlanet.getListOfTerraObjects().size() +
						", Impact Score: " + myPlanet.getTotalImpactScore() +
						"\n1)\tList all water objects" +
						"\n2)\tList all plant objects" +
						"\n3)\tList all mineral objects" +
						"\n4)\tList all animal objects" +
						"\n5)\tExit Program" +
						"\n >> ");

		boolean userChoseQuit = false;
		// execute the input loop while the input is not valid
		do {
			try {

				int numOfCategories = 4;
				// upper boundary needs +1 for the "quit" option
				int input = CheckInput.getIntRange(1, numOfCategories + 1);

				// user chose to list all objects of a category
				if (input >= 1 && input <= numOfCategories) {

					// print out the description of the chosen category by the index in the 3D ArrayList
					System.out.println(myPlanet.getCategoryDescription(input - 1));

					// user chose the last option (to quit)
				} else {
					userChoseQuit = true;
				}

				if (!userChoseQuit) {
					System.out.print("-------------------------" +
									"\n    TerraForming Menu" +
									"\n-------------------------" +
									"\n\nPlanetName: " + myPlanet.getName() +
									", TerraObjects: " + myPlanet.getListOfTerraObjects().size() +
									", Impact Score: " + myPlanet.getTotalImpactScore() +
									"\n1)\tList all water objects" +
									"\n2)\tList all plant objects" +
									"\n3)\tList all mineral objects" +
									"\n4)\tList all animal objects" +
									"\n5)\tExit Program" +
									"\n >> ");
				}

			} catch (IllegalArgumentException error) {
				System.out.print("The input must be an integer within the range; please try again: ");
			}

		} while (!userChoseQuit);
		
	}// end menu 3

}// end test
