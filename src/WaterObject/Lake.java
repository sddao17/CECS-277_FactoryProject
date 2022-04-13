
package WaterObject;
import FactoryProject.Utility;

/**
 * @author Hoanh Nguyen, Leslie Ortega, Phoenix Ngan, Steven Dao
 * @version 1.0
 * Due Date: May 5th, 2021, 2:00pm
 *
 * Purpose: Creates a Lake object.
 *
 * Target Output: A lake object with any specified traits.
 */
public class Lake extends WaterObject {

    /**
     * Default constructor which constructs a default Lake.
     */
    public Lake() {
        this("Lake");
    }

    /**
     * Overloaded constructor which creates a Lake object with the given parameters.
     *
     * @param newName the name of the lake
     */
    public Lake(String newName) {
        super(newName);

        // generate a random integer between 40 and 50
        int randomNum = Utility.generateRandomInt(40, 50);
        this.setImpactScore(randomNum);
    }

}
