
package WaterObject;
import FactoryProject.TerraObject;

/**
 * @author Hoanh Nguyen, Leslie Ortega, Phoenix Ngan, Steven Dao
 * @version 1.0
 * Due Date: May 5th, 2021, 2:00pm
 *
 * Purpose: Creates Water objects with a name and impact score.
 *
 * Target Output: A water object with specific traits.
 */
public abstract class WaterObject extends TerraObject {

    /**
     * Null constructor for the WaterObject class.
     * Default constructor is null due to the class being abstract.
     */
    public WaterObject() {
        this("");
    }

    /**
     * Overloaded constructor which creates an Water object with the given parameters.
     *
     * @param newName the name of the water object
     */
    public WaterObject(String newName) {
        super(newName, "Water");
    }

}
