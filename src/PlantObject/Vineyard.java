
package PlantObject;
import FactoryProject.Utility;

/**
 * @author Hoanh Nguyen, Leslie Ortega, Phoenix Ngan, Steven Dao
 * @version 1.0
 * Due Date: May 5th, 2021, 2:00pm
 *
 * Purpose: Creates a Vineyard object.
 *
 * Target Output: A vineyard object with any specified traits.
 */
public class Vineyard extends PlantObject {

    /**
     * Default constructor which constructs a default Vineyard.
     */
    public Vineyard() {
        this("Vineyard");
    }

    /**
     * Overloaded constructor which creates a Vineyard object with the given parameters.
     *
     * @param newName the name of the vineyard
     */
    public Vineyard(String newName) {
        super(newName);

        // generate a random integer between 40 and 80
        int randomNum = Utility.generateRandomInt(40, 80);
        this.setImpactScore(randomNum);
    }

}
