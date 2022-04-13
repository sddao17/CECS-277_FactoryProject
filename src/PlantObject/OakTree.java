
package PlantObject;
import FactoryProject.Utility;

/**
 * @author Hoanh Nguyen, Leslie Ortega, Phoenix Ngan, Steven Dao
 * @version 1.0
 * Due Date: May 5th, 2021, 2:00pm
 *
 * Purpose: Creates a OakTree object.
 *
 * Target Output: An oak tree object with any specified traits.
 */
public class OakTree extends PlantObject {

    /**
     * Default constructor which constructs a default OakTree.
     */
    public OakTree() {
        this("Oak tree");
    }

    /**
     * Overloaded constructor which creates an OakTree object with the given parameters.
     *
     * @param newName the name of the oak tree
     */
    public OakTree(String newName) {
        super(newName);

        // generate a random integer between 80 and 100
        int randomNum = Utility.generateRandomInt(80, 100);
        this.setImpactScore(randomNum);
    }

}
