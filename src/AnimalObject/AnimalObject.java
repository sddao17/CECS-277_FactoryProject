
package AnimalObject;
import FactoryProject.TerraObject;

/**
 * @author Hoanh Nguyen, Leslie Ortega, Phoenix Ngan, Steven Dao
 * @version 1.0
 * Due Date: May 5th, 2021, 2:00pm
 *
 * Purpose: Creates Animal objects with a name and impact score.
 *
 * Target Output: An animal object with specific traits.
 */
public abstract class AnimalObject extends TerraObject {

    /**
     * Null constructor for the AnimalObject class.
     * Default constructor is null due to the class being abstract.
     */
    public AnimalObject() {
        this("");
    }

    /**
     * Overloaded constructor which creates an Animal object with the given parameters.
     *
     * @param newName the name of the Animal
     */
    public AnimalObject(String newName) {
        super(newName, "Animal");
    }

}
