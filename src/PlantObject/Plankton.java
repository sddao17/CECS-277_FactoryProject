
package PlantObject;
import FactoryProject.Utility;

/**
 * @author Hoanh Nguyen, Leslie Ortega, Phoenix Ngan, Steven Dao
 * @version 1.0
 * Due Date: May 5th, 2021, 2:00pm
 *
 * Purpose: Creates a Plankton object.
 *
 * Target Output: A plankton object with any specified traits.
 */
public class Plankton extends PlantObject {

    /**
     * Default constructor which constructs a default Plankton.
     */
    public Plankton() {
        this("Plankton");
    }

    /**
     * Overloaded constructor which creates a Plankton object with the given parameters.
     *
     * @param newName the name of the plankton
     */
    public Plankton(String newName) {
        super(newName);

        // generate a random integer between 20 and 60
        int randomNum = Utility.generateRandomInt(20, 60);
        this.setImpactScore(randomNum);
    }

}
