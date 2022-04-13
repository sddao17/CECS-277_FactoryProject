
package PlantObject;
import FactoryProject.TerraObject;

/**
 * @author Hoanh Nguyen, Leslie Ortega, Phoenix Ngan, Steven Dao
 * @version 1.0
 * Due Date: May 5th, 2021, 2:00pm
 *
 * Purpose: Creates Plant objects with a name and impact score.
 *
 * Target Output: A plant object with specific traits.
 */
public abstract class PlantObject extends TerraObject {

    /**
     * Null constructor for the PlantObject class.
     * Default constructor is null due to the class being abstract.
     */
    public PlantObject() {
        this("");
    }

    /**
     * Overloaded constructor which creates an Plant object with the given parameters.
     *
     * @param newName the name of the plant
     */
    public PlantObject(String newName) {
        super(newName, "Plant");
    }

}
