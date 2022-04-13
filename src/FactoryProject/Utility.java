
package FactoryProject;
/**
 * @author Hoanh Nguyen, Leslie Ortega, Phoenix Ngan, Steven Dao
 * @version 1.0 Due Date: May 5th, 2021, 2:00pm
 *
 * Purpose: Tool box consisting of miscellaneous functions or methods.
 *
 * Target output: The specified function output.
 */
public class Utility {

	/**
	 * Generates a random integer within the given range.
	 *
	 * @param low the lower boundary of the range
	 * @param high the upper boundary of the range
	 * @return the int within the range
	 */
	public static int generateRandomInt(int low, int high) {
		return (int) (Math.random() * (high - low + 1) + low);
	}

}
