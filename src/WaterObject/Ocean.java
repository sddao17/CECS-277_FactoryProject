
package WaterObject;
import FactoryProject.Utility;

/**
 * @author Hoanh Nguyen, Leslie Ortega, Phoenix Ngan, Steven Dao
 * @version 1.0
 * Due Date: May 5th, 2021, 2:00pm
 *
 * Purpose: Creates an Ocean object.
 *
 * Target Output: An ocean object with any specified traits.
 */
public class Ocean extends WaterObject {

    /**
     * Default constructor which constructs a default Ocean.
     */
    public Ocean() {
        this("Ocean");
    }

    /**
     * Overloaded constructor which creates a Ocean object with the given parameters.
     *
     * @param newName the name of the ocean
     */
    public Ocean(String newName) {
        super(newName);

        // generate a random integer between 50 and 100
        int randomNum = Utility.generateRandomInt(50, 100);
        this.setImpactScore(randomNum);
    }

}
