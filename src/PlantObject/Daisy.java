
package PlantObject;
import FactoryProject.Utility;

/**
 * @author Hoanh Nguyen, Leslie Ortega, Phoenix Ngan, Steven Dao
 * @version 1.0
 * Due Date: May 5th, 2021, 2:00pm
 *
 * Purpose: Creates a Daisy object.
 *
 * Target Output: A daisy object with any specified traits.
 */
public class Daisy extends PlantObject {

    /**
     * Default constructor which constructs a default Daisy.
     */
    public Daisy() {
        this("Daisy");
    }

    /**
     * Overloaded constructor which creates a Daisy object with the given parameters.
     *
     * @param newName the name of the daisy
     */
    public Daisy(String newName) {
        super(newName);

        // generate a random integer between 20 and 60
        int randomNum = Utility.generateRandomInt(20, 60);
        this.setImpactScore(randomNum);
    }

}
