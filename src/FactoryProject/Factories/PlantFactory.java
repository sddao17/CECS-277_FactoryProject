
package FactoryProject.Factories;

import java.util.ArrayList;

import FactoryProject.TerraObject;
import FactoryProject.Utility;
import PlantObject.*;

/**
 * @author Hoanh Nguyen, Leslie Ortega, Phoenix Ngan, Steven Dao
 * @version 1.0
 * Due Date: May 5th, 2021, 2:00pm
 *
 * Purpose: Creates plant terra objects.
 *
 * Target Output: The correct number of randomized plant objects.
 */
public class PlantFactory extends TerraObjectFactory {

	PlantObject ob;

	/**
	 * Default constructor which initializes the list of objects and impact score.
	 */
	public PlantFactory() {
		listObjects = new ArrayList<TerraObject>();
		impactScore = 0;
	}

	/**
	 * Create plant objects based on the plant score given.
	 *
	 * @param numOb the number of objects to create
	 */
	@Override
	public void generateObject(int numOb) {
		while (numOb > 0) {
			int rand = Utility.generateRandomInt(0, 4);
			switch (rand) {
			case 1:
				ob = new Daisy();
				listObjects.add(ob);
				numOb --;
				break;
			case 2:
				ob = new OakTree();
				listObjects.add(ob);
				numOb --;
				break;
			case 3:
				ob = new Plankton();
				listObjects.add(ob);
				numOb --;
				break;
			case 4:
				ob = new Vineyard();
				listObjects.add(ob);
				numOb --;
				break;
			}	
		}//end while
		
	}

	/**
	 * Returns the list of objects.
	 *
	 * @return the list of objects
	 */
	@Override
	public ArrayList<TerraObject> getObjectList() {
		return listObjects;
	}

	/**
	 * Prints the list of objects.
	 */
	@Override
	public void printListObject() {
		for (TerraObject ob : listObjects) {
			System.out.println(ob);
		}
		System.out.println("Size of the list: " + listObjects.size());
		
	}

	/**
	 * Returns the impact score.
	 *
	 * @return the impact score
	 */
	@Override
	public int getImpactScore() {
		for (TerraObject ob : listObjects) {
			impactScore += ob.getImpactScore();
		}
		return impactScore;
	}

}//end
