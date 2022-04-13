
package FactoryProject;

import java.util.ArrayList;

import FactoryProject.Factories.*;
import AnimalObject.*;
import MineralObject.*;
import PlantObject.*;
import WaterObject.*;

/**
 * @author Hoanh Nguyen, Leslie Ortega, Phoenix Ngan, Steven Dao
 * @version 1.0
 * Due Date: May 5th, 2021, 2:00pm
 *
 * Purpose: Stores and manipulates all Terra objects within an
 *          ArrayList container.
 *
 * Target Output: A list of all Terra objects made within the program.
 */
public class Planet {

	private final ArrayList<TerraObject> listOfTerraObjects;
	private TerraObjectFactory factory;
	private int impactScore;
	private int numObs;
	private String size;
	private String name;
	private int waterPer;
	private int plantPer;
	private int mineralPer;
	private int animalPer;
	private int totalPer;

	/**
	 * Default constructor which initializes an empty ArrayList of Terra objects.
	 */
	public Planet() {
		listOfTerraObjects = new ArrayList<>();
		impactScore = 0;
		numObs = 0;
		name = "";
		size = "";
		waterPer = 0;
		plantPer = 0;
		mineralPer = 0;
		animalPer = 0;
		totalPer = 100;

	}

	/**
	 *  Default constructor which constructs the size and number of objects for the planet.
	 *
	 * @param name the name of the planet
	 * @param planetSizeOption the user input which indicates the size of the planet
	 */
	public Planet(String name, int planetSizeOption) {
		listOfTerraObjects = new ArrayList<>();
		this.name = name;
		this.totalPer = 100;
		// make a number of TerraObjects based on the user's specified planet size

		switch (planetSizeOption) {
		// user chose "small": 200 - 500 Terra objects
		case 1:
			this.numObs = Utility.generateRandomInt(200, 500);
			this.size = "Small";
			break;

		// user chose "medium": 501 - 1,000 Terra objects
		case 2:
			this.numObs = Utility.generateRandomInt(501, 1000);
			this.size = "Medium";
			break;

		// user chose "large": 1,001 - 1,500 Terra objects
		case 3:
			this.numObs = Utility.generateRandomInt(1001, 1500);
			this.size = "Large";
			break;

		// user chose "extra large": 1,501+ Terra objects (for us, up to 10,000)
		case 4:
			this.numObs = Utility.generateRandomInt(1501, 10000);
			this.size = "Extra large";
			break;

		default:
			break;
		}
	}

	/**
	 * Returns the list of Terra objects.
	 *
	 * @return the ArrayList of Terra objects
	 */
	public ArrayList<TerraObject> getListOfTerraObjects() {
		return listOfTerraObjects;
	}

	/**
	 * Adds the contents of the indicated list to the planet's list of terra objects.
	 *
	 * @param otherList the other list of terra objects to be added
	 */
	public void addToPlanet(ArrayList<TerraObject> otherList) {
		listOfTerraObjects.addAll(otherList);
	}

	/**
	 * Returns the percentage remaining.
	 *
	 * @return the percentage remaining
	 */
	public int getPercentage() {
		return (totalPer - (animalPer + mineralPer + plantPer + waterPer));
	}

	/**
	 * Sets the name for the planet.
	 *
	 * @param name the new name for the planet
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Returns the name of the planet.
	 *
	 * @return the name of the planet
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the number of objects in the planet.
	 * @return the number of objects in the planet
	 */
	public int getNumObs() {
		return numObs;
	}
	
	/**
	 * Returns the number of water objects.
	 *
	 * @return the number of water objects
	 */
	public int getWaterObject() {
		return numObs * waterPer /100;
	}


	/**
	 * Returns the number of plant objects.
	 *
	 * @return the number of plant objects
	 */
	public int getPlantObject() {
		return numObs * plantPer / 100;
	}


	/**
	 * Returns the number of mineral objects.
	 *
	 * @return the number of mineral objects
	 */
	public int getMineralObject() {
		return numObs * mineralPer / 100;
	}

	/**
	 * Returns the number of animal objects.
	 *
	 * @return the number of animal objects
	 */
	public int getAnimalObject() {
		return numObs * animalPer / 100;
	}
	
	/**
	 * Sets the water percentage.
	 *
	 * @param water the new water percentage
	 */
	public void setWater(int water) {
		this.waterPer = this.waterPer + water;
	}

	/**
	 * Sets the plant percentage.
	 *
	 * @param plant the new plant percentage
	 */
	public void setPlant(int plant) {
		this.plantPer = this.plantPer + plant;
	}

	/**
	 * Sets the mineral percentage.
	 *
	 * @param mineral the new mineral percentage
	 */
	public void setMineral(int mineral) {
		this.mineralPer = this.mineralPer + mineral;
	}

	/**
	 * Sets the animal percentage.
	 *
	 * @param animal the new animal percentage
	 */
	public void setAnimal(int animal) {
		this.animalPer = this.animalPer + animal;
	}

	/**
	 * Returns the total impact score of the planet.
	 *
	 * @return the total impact score of the planet
	 */
	public int getTotalImpactScore() {
		return impactScore;
	}

	/**
	 * 	Resets percentages of the categories to 0
	 * 	and the total percentage remaining to 100.
	 */
	public void resetPer() {
		waterPer = 0;
		plantPer = 0;
		mineralPer = 0;
		animalPer = 0;
		totalPer = 100;
	}

	/**
	 * Builds the planet after taking input from user.
	 * Demonstrates the Factory Design Pattern.
	 */
	public void buildThePlanet() {
		TerraObjectFactory wf = new WaterFactory();
		wf.generateObject(getWaterObject());
		this.addToPlanet(wf.getObjectList());

		TerraObjectFactory mf = new MineralFactory();
		mf.generateObject(getMineralObject());
		this.addToPlanet(mf.getObjectList());

		TerraObjectFactory pf= new PlantFactory();
		pf.generateObject(getPlantObject());
		this.addToPlanet(pf.getObjectList());

		TerraObjectFactory af = new AnimalFactory();
		af.generateObject(getAnimalObject());
		this.addToPlanet(af.getObjectList());

		impactScore = wf.getImpactScore() + mf.getImpactScore() + pf.getImpactScore() + af.getImpactScore();
	}

	/**
	 * Returns a 3D ArrayList of the total objects in the categories in the following format:
	 * 		list:	[
	 * 					[ Water objects:
	 * 	  	  				[Lakes], [Oceans], [Ponds], [Rivers]
	 * 	  	  			], [ Plant objects:
	 * 	  	  				[Daisies], [OakTrees], [Plankton], [Vineyards]
	 * 	  	  			], [ Mineral objects:
	 * 	  					[Coals], [MercuryMetals], [RockSalts], [TopSoils]
	 * 	 				], [ Animal objects:
	 * 	  					[Bears], [Flamingos], [Humans], [Piranhas]
	 * 	  				]
	 * 				]
	 *
	 * @return the 3D ArrayList of organized objects
	 */
	public ArrayList<ArrayList<ArrayList<TerraObject>>> getObjectsByCategory() {
		// the 3D ArrayList of the objects by category
		ArrayList<ArrayList<ArrayList<TerraObject>>> objectsByCategory = new ArrayList<>() {
			{
				// water objects
				add(new ArrayList<>() {
					{
						add(new ArrayList<>());
						add(new ArrayList<>());
						add(new ArrayList<>());
						add(new ArrayList<>());
					}
				});

				// plant objects
				add(new ArrayList<>() {
					{
						add(new ArrayList<>());
						add(new ArrayList<>());
						add(new ArrayList<>());
						add(new ArrayList<>());
					}
				});

				// mineral objects
				add(new ArrayList<>() {
					{
						add(new ArrayList<>());
						add(new ArrayList<>());
						add(new ArrayList<>());
						add(new ArrayList<>());
					}
				});

				// animal objects
				add(new ArrayList<>() {
					{
						add(new ArrayList<>());
						add(new ArrayList<>());
						add(new ArrayList<>());
						add(new ArrayList<>());
					}
				});
			}
		};


		// iterate through the list of all objects and separate them by category
		for (TerraObject object : listOfTerraObjects) {
			// water objects
			if (object instanceof WaterObject) {

				if (object instanceof Lake) {
					objectsByCategory.get(0).get(0).add(object);
				} else if (object instanceof Ocean) {
					objectsByCategory.get(0).get(1).add(object);
				} else if (object instanceof Pond) {
					objectsByCategory.get(0).get(2).add(object);
				} else if (object instanceof River) {
					objectsByCategory.get(0).get(3).add(object);
				}
			}
			// plant objects
			else if (object instanceof PlantObject) {

				if (object instanceof Daisy) {
					objectsByCategory.get(1).get(0).add(object);
				} else if (object instanceof OakTree) {
					objectsByCategory.get(1).get(1).add(object);
				} else if (object instanceof Plankton) {
					objectsByCategory.get(1).get(2).add(object);
				} else if (object instanceof Vineyard) {
					objectsByCategory.get(1).get(3).add(object);
				}
			}
			// mineral objects
			else if (object instanceof MineralObject) {

				if (object instanceof Coal) {
					objectsByCategory.get(2).get(0).add(object);
				} else if (object instanceof MercuryMetal) {
					objectsByCategory.get(2).get(1).add(object);
				} else if (object instanceof RockSalt) {
					objectsByCategory.get(2).get(2).add(object);
				} else if (object instanceof TopSoil) {
					objectsByCategory.get(2).get(3).add(object);
				}
			}
			// animal objects
			else if (object instanceof AnimalObject) {

				if (object instanceof Bear) {
					objectsByCategory.get(3).get(0).add(object);
				} else if (object instanceof Flamingo) {
					objectsByCategory.get(3).get(1).add(object);
				} else if (object instanceof Human) {
					objectsByCategory.get(3).get(2).add(object);
				} else if (object instanceof Piranha) {
					objectsByCategory.get(3).get(3).add(object);
				}
			}
		}

		return objectsByCategory;
	}

	/**
	 * Counts the total impact score for all of the terra objects in each category.
	 *
	 * @param list the list of TerraObjects
	 * @return the array containing the list of impact scores of each category
	 */
	public int[] countObjectImpactScore(ArrayList<TerraObject> list) {
		int[] out = new int[4];
		for(TerraObject object : list) {
			// water objects
			if (object instanceof WaterObject) {

				if (object instanceof Lake) {
					out[0] += object.getImpactScore();
				} else if (object instanceof Ocean) {
					out[1] += object.getImpactScore();
				} else if (object instanceof Pond) {
					out[2] += object.getImpactScore();
				} else if (object instanceof River) {
					out[3] += object.getImpactScore();
				}
			}
			// plant objects
			else if (object instanceof PlantObject) {

				if (object instanceof Daisy) {
					out[0] += object.getImpactScore();
				} else if (object instanceof OakTree) {
					out[1] += object.getImpactScore();
				} else if (object instanceof Plankton) {
					out[2] += object.getImpactScore();
				} else if (object instanceof Vineyard) {
					out[3] += object.getImpactScore();
				}
			}
			// mineral objects
			else if (object instanceof MineralObject) {

				if (object instanceof Coal) {
					out[0] += object.getImpactScore();
				} else if (object instanceof MercuryMetal) {
					out[1] += object.getImpactScore();
				} else if (object instanceof RockSalt) {
					out[2] += object.getImpactScore();
				} else if (object instanceof TopSoil) {
					out[3] += object.getImpactScore();
				}
			}
			// animal objects
			else if (object instanceof AnimalObject) {

				if (object instanceof Bear) {
					out[0] += object.getImpactScore();
				} else if (object instanceof Flamingo) {
					out[1] += object.getImpactScore();
				} else if (object instanceof Human) {
					out[2] += object.getImpactScore();
				} else if (object instanceof Piranha) {
					out[3] += object.getImpactScore();
				}
			}
		}
		return out;
	}

	public String getCategoryDescription(int categoryNumber) {
		// use StringBuilder to avoid warning of string concatenation in loops
		StringBuilder description = new StringBuilder();
		ArrayList<ArrayList<TerraObject>> categories = getObjectsByCategory().get(categoryNumber);

		// print each category's contents
		for (ArrayList<TerraObject> category : categories) {
			// prints the name of the first object in the concrete class
			description.append("\n").append(category.get(0).getName()).append(" Objects:\n\n");

			// print every single object in each concrete class category
			for (TerraObject terraObject : category) {
				description.append("\t").append(terraObject).append("\n");
			}
		}

		int totalObjects = 0;
		int totalImpactScore = 0;
		int impactScoresIndex = 0;

		// traverse through each concrete class category
		for (ArrayList<TerraObject> category : categories) {
			totalObjects += category.size();

			// traverse through the list of specific concrete classes to add all impact scores
			for (TerraObject terraObject : category) {
				totalImpactScore += terraObject.getImpactScore();
			}
		}

		description.append("\nTotal ").append(categories.get(categoryNumber).get(0).getCategoryType())
						.append(" Objects: ").append(totalObjects)
					.append("\nTotal Impact Score: ").append(totalImpactScore)
					.append("\nNumber of each object:\n");

		// for each category, get the name of the concrete class and output the numOfObj in the list
		for (ArrayList<TerraObject> category : categories) {
			int[] impactScores = countObjectImpactScore(category);
			description.append("\t").append(category.get(0).getName()).append(": ").append(category.size())
					.append("\t(Impact score: ").append(impactScores[impactScoresIndex]).append(")\n");
			impactScoresIndex++;
		}

		return description.toString();
	}

	/**
	 * Returns the planet information.
	 *
	 * @return the planet information
	 */
	public String toString() {
		String out = "Planet Size: " + size + "\n";
		out = out + "terraObject distribution: "
				+ "\n" + "	Water: " + waterPer + "%" + ", Number of water objects: " + getWaterObject()
				+ "\n" + "	Plant: " + plantPer + "%" + ", Number of plant objects: " + getPlantObject()
				+ "\n" + "	Mineral: " + mineralPer + "%" + ", Number of mineral objects: " + getMineralObject()
				+ "\n" + "	Animal: "	+animalPer + "%" + ", Number of animal objects: " + getAnimalObject();
		return out;
	}
}
