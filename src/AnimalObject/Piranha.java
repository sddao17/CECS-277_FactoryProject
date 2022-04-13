
package AnimalObject;
import FactoryProject.Utility;

/**
 * @author Hoanh Nguyen, Leslie Ortega, Phoenix Ngan, Steven Dao
 * @version 1.0
 * Due Date: May 5th, 2021, 2:00pm
 *
 * Purpose: Creates a Piranha object.
 *
 * Target Output: A piranha object with any specified traits.
 */
public class Piranha extends AnimalObject {

    /**
     * Default constructor which constructs a default Piranha.
     */
    public Piranha() {
        this("Piranha");
    }

    /**
     * Overloaded constructor which creates a Piranha object with the given parameters.
     *
     * @param newName the name of the piranha
     */
    public Piranha(String newName) {
        super(newName);

        // generate a random integer between -60 and -40
        int randomNum = Utility.generateRandomInt(-60, -40);
        this.setImpactScore(randomNum);
    }

}
