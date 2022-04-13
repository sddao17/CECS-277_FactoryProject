
package AnimalObject;
import FactoryProject.Utility;

/**
 * @author Hoanh Nguyen, Leslie Ortega, Phoenix Ngan, Steven Dao
 * @version 1.0
 * Due Date: May 5th, 2021, 2:00pm
 *
 * Purpose: Creates a Human object.
 *
 * Target Output: A human object with any specified traits.
 */
public class Human extends AnimalObject {

    /**
     * Default constructor which constructs a default Human.
     */
    public Human() {
        this("Human");
    }

    /**
     * Overloaded constructor which creates a human object with the given parameters.
     *
     * @param newName the name of the human
     */
    public Human(String newName) {
        super(newName);

        // generate a random integer between -90 and -100
        int randomNum = Utility.generateRandomInt(-90, -100);
        this.setImpactScore(randomNum);
    }

}
