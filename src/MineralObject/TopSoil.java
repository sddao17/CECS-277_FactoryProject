
package MineralObject;
import FactoryProject.Utility;

/**
 * @author Hoanh Nguyen, Leslie Ortega, Phoenix Ngan, Steven Dao
 * @version 1.0
 * Due Date: May 5th, 2021, 2:00pm
 *
 * Purpose: Creates a TopSoil object.
 *
 * Target Output: A topsoil object with any specified traits.
 */
public class TopSoil extends MineralObject {

    /**
     * Default constructor which constructs a default TopSoil.
     */
    public TopSoil() {
        this("Top soil");
    }

    /**
     * Overloaded constructor which creates a TopSoil object with the given parameters.
     *
     * @param newName the name of the topsoil
     */
    public TopSoil(String newName) {
        super(newName);

        // generate a random integer between 80 and 100
        int randomNum = Utility.generateRandomInt(80, 100);
        this.setImpactScore(randomNum);
    }

}
