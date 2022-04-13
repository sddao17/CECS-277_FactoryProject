
package FactoryProject;

/**
 * @author Hoanh Nguyen, Leslie Ortega, Phoenix Ngan, Steven Dao
 * @version 1.0
 * Due Date: May 5th, 2021, 2:00pm
 *
 * Purpose: Handles the exception where a name is inputted as an empty string.
 *
 * Target Output: The error message indicating the name cannot be empty.
 */
public class NameException extends Exception{
	/**
	 * Default constructor
	 */
	public NameException() {
		super("Name is empty.");
		System.out.println("Name cannot empty. Please enter again.");
	}
	/**
	 * Overload constructor
	 * @param s the string for the error message
	 */
	public NameException(String s) {
		super("Name is empty.");
		System.out.println(s);
	}

}
