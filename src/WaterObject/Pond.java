
package WaterObject;
import FactoryProject.Utility;

/**
 * @author Hoanh Nguyen, Leslie Ortega, Phoenix Ngan, Steven Dao
 * @version 1.0
 * Due Date: May 5th, 2021, 2:00pm
 *
 * Purpose: Creates a Pond object.
 *
 * Target Output: A pond object with any specified traits.
 */
public class Pond extends WaterObject {

    /**
     * Default constructor which constructs a default Pond.
     */
    public Pond() {
        this("Pond");
    }

    /**
     * Overloaded constructor which creates a Pond object with the given parameters.
     *
     * @param newName the name of the pond
     */
    public Pond(String newName) {
        super(newName);

        // generate a random integer between 5 and 10
        int randomNum = Utility.generateRandomInt(5, 10);
        this.setImpactScore(randomNum);
    }

}
