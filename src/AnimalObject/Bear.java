
package AnimalObject;
import FactoryProject.Utility;

/**
 * @author Hoanh Nguyen, Leslie Ortega, Phoenix Ngan, Steven Dao
 * @version 1.0
 * Due Date: May 5th, 2021, 2:00pm
 *
 * Purpose: Creates a Bear object.
 *
 * Target Output: A bear object with any specified traits.
 */
public class Bear extends AnimalObject {

    /**
     * Default constructor which constructs a default Bear.
     */
    public Bear() {
        this("Bear");
    }

    /**
     * Overloaded constructor which creates a Bear object with the given parameters.
     *
     * @param newName the name of the bear
     */
    public Bear(String newName) {
        super(newName);

        // generate a random integer between -100 and -60
        int randomNum = Utility.generateRandomInt(-100, -60);
        this.setImpactScore(randomNum);
    }

}
