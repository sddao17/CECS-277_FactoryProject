
package AnimalObject;
import FactoryProject.Utility;

/**
 * @author Hoanh Nguyen, Leslie Ortega, Phoenix Ngan, Steven Dao
 * @version 1.0
 * Due Date: May 5th, 2021, 2:00pm
 *
 * Purpose: Creates a Flamingo object.
 *
 * Target Output: A flamingo object with any specified traits.
 */
public class Flamingo extends AnimalObject {

    /**
     * Default constructor which constructs a default Flamingo.
     */
    public Flamingo() {
        this("Flamingo");
    }

    /**
     * Overloaded constructor which creates a Flamingo object with the given parameters.
     *
     * @param newName the name of the flamingo
     */
    public Flamingo(String newName) {
        super(newName);

        // generate a random integer between -60 and -40
        int randomNum = Utility.generateRandomInt(-60, -40);
        this.setImpactScore(randomNum);
    }

}
