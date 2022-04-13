
package MineralObject;
import FactoryProject.Utility;

/**
 * @author Hoanh Nguyen, Leslie Ortega, Phoenix Ngan, Steven Dao
 * @version 1.0
 * Due Date: May 5th, 2021, 2:00pm
 *
 * Purpose: Creates a Coal object.
 *
 * Target Output: A coal object with any specified traits.
 */
public class Coal extends MineralObject {

    /**
     * Default constructor which constructs a default Coal.
     */
    public Coal() {
        this("Coal");
    }

    /**
     * Overloaded constructor which creates a Coal object with the given parameters.
     *
     * @param newName the name of the coal
     */
    public Coal(String newName) {
        super(newName);

        // generate a random integer between -80 and -40
        int randomNum = Utility.generateRandomInt(-80, -40);
        this.setImpactScore(randomNum);;
    }

}
