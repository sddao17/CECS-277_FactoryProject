
package MineralObject;
import FactoryProject.Utility;

/**
 * @author Hoanh Nguyen, Leslie Ortega, Phoenix Ngan, Steven Dao
 * @version 1.0
 * Due Date: May 5th, 2021, 2:00pm
 *
 * Purpose: Creates a RockSalt object.
 *
 * Target Output: A rock salt object with any specified traits.
 */
public class RockSalt extends MineralObject {

    /**
     * Default constructor which constructs a default RockSalt.
     */
    public RockSalt() {
        this("Rock salt");
    }

    /**
     * Overloaded constructor which creates a RockSalt object with the given parameters.
     *
     * @param newName the name of the rock salt
     */
    public RockSalt(String newName) {
        super(newName);

        // generate a random integer between 20 and 40
        int randomNum = Utility.generateRandomInt(20, 40);
        this.setImpactScore(randomNum);
    }

}
