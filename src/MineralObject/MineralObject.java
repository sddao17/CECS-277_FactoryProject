
package MineralObject;
import FactoryProject.TerraObject;

/**
 * @author Hoanh Nguyen, Leslie Ortega, Phoenix Ngan, Steven Dao
 * @version 1.0
 * Due Date: May 5th, 2021, 2:00pm
 *
 * Purpose: Creates Mineral objects with a name and impact score.
 *
 * Target Output: A mineral object with specific traits.
 */
public abstract class MineralObject extends TerraObject {

    /**
     * Null constructor for the MineralObject class.
     * Default constructor is null due to the class being abstract.
     */
    public MineralObject() {
        this("");
    }

    /**
     * Overloaded constructor which creates an Mineral object with the given parameters.
     *
     * @param newName the name of the mineral
     */
    public MineralObject(String newName) {
        super(newName, "Mineral");
    }

}
