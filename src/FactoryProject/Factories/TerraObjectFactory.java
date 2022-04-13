
package FactoryProject.Factories;

import java.util.ArrayList;

import FactoryProject.TerraObject;

/**
 * @author Hoanh Nguyen, Leslie Ortega, Phoenix Ngan, Steven Dao
 * @version 1.0
 * Due Date: May 5th, 2021, 2:00pm
 *
 * Purpose: Creates simulated Terra objects when invoked.
 *
 * Target Output: The specified Terra objects with user-specific traits.
 */
public abstract class TerraObjectFactory {

	protected ArrayList<TerraObject> listObjects;
	protected int impactScore;

	/**
	 * Default constructor for the TerraObjectFactory class.
	 * Constructor is null due to the class being abstract.
	 */
	public TerraObjectFactory() {}

	/**
	 * Generates the objects for the planet.
	 * @param numOb the number of terra objects
	 */
	public abstract void generateObject(int numOb);

	/**
	 * Returns the list of objects.
	 *
	 * @return the list of objects
	 */
	public abstract ArrayList<TerraObject> getObjectList();

	/**
	 * Prints the list of objects.
	 */
	public abstract void printListObject();

	/**
	 * Returns the impact score.
	 *
	 * @return the impact score
	 */
	public abstract int getImpactScore();

}// end class
