
package FactoryProject;

import java.util.Scanner;

/**
 * @author Hoanh Nguyen, Leslie Ortega, Phoenix Ngan, Steven Dao
 * @version 1.0
 * Due Date: May 5th, 2021, 2:00pm
 *
 * Purpose: Checks and validates the input from the user.
 *
 * Target Output: The validated input.
 */
public class CheckInput {

    /**
     * Checks the validity of the name.
     *
     * @throws NameException the custom exception for handling empty names as strings
     * @return the name as a valid, nonempty string
     */
    public static String getName() throws NameException {
        String clientName;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of your planet: ");
        clientName = sc.nextLine();

        // will throw NameException if the name is empty
        while (!isNameValid(clientName)) {
            System.out.print("Enter the name of your planet: ");
            clientName = sc.nextLine();
        }
        return clientName;
    }// end getName

    /**
     * Check user input data for name; will throw exception if the
     * name is blank
     *
     * @param s the string to check for validity
     * @return true if the name is valid; false otherwise.
     */
    public static boolean isNameValid(String s) {
        try {
            if (s == null || s.isBlank()) {
                throw new NameException(); // throw exception the name is blank
            } else {
                return true;
            }
        } catch (NameException e) {
            return false;
        }
    }// end isNameValid

    /**
     * Checks and validates the percentage as an integer from the user.
     *
     * @param percentage the user-input percentage of the category
     * @return the valid percentage as an integer
     */
    public static int getPercentageAsInt(int percentage) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean flag;
        do {
            try {
                n = sc.nextInt();
                if (n <= percentage) {
                    flag = false;
                } else {
                    System.out.println("You entered a number bigger then the total percentage remaining!");
                    System.out.print("Please try again: ");
                    flag = true;
                }
            } catch (Exception e) {
                sc = new Scanner(System.in);
                System.out.println("Only integer values are accepted; please try again: ");
                flag = true;
            }
        } while (flag);
        return n;
    }

    /**
     * Checks user input to see if it is a valid integer within the range.
     * Code based from Mimi Opkin’s website (CheckInput.java).
     *
     * @param low the lowest acceptable integer in the range of type int
     * @param high the highest acceptable integer in the range of type int
     * @throws IllegalArgumentException the exception which displays the input error message
     * @return the input of type int.
     */
    public static int getIntRange(int low, int high) throws IllegalArgumentException
    {
        Scanner in = new Scanner(System.in);
        int input = 0;
        boolean valid = false;
        while (!valid)
        {
            if(in.hasNextInt()) {
                input = in.nextInt();
                if (input <= high && input >= low)
                    valid = true;
                else
                    throw new IllegalArgumentException();
            } else {
                throw new IllegalArgumentException();
            }
        }

        return input;
    } // End of user input code

    /**
     * Checks if the input is either yes or no.
     *
     * @throws IllegalArgumentException the exception which displays the input error message
     * @return the valid input
     */
    public static boolean checkYesNo() throws IllegalArgumentException {
        Scanner in = new Scanner(System.in);
        String input;

        input = in.nextLine();

        if (input.equalsIgnoreCase("yes")) {
            return true;
        } else if (input.equalsIgnoreCase("no")) {
            return false;
        } else {
            throw new IllegalArgumentException();
        }

    }

}
