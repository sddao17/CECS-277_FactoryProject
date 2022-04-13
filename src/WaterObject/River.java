
package WaterObject;
import FactoryProject.Utility;

/**
 * @author Hoanh Nguyen, Leslie Ortega, Phoenix Ngan, Steven Dao
 * @version 1.0
 * Due Date: May 5th, 2021, 2:00pm
 *
 * Purpose: Creates a River object.
 *
 * Target Output: A river object with any specified traits.
 */
public class River extends WaterObject {

    /**
     * Default constructor which constructs a default River.
     */
    public River() {
        this("River");
    }

    /**
     * Overloaded constructor which creates a River object with the given parameters.
     *
     * @param newName the name of the river
     */
    public River(String newName) {
        super(newName);

        // generate a random integer between 10 and 60
        int randomNum = Utility.generateRandomInt(10, 60);
        this.setImpactScore(randomNum);
    }

}
