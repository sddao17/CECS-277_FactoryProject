
package MineralObject;
import FactoryProject.Utility;

/**
 * @author Hoanh Nguyen, Leslie Ortega, Phoenix Ngan, Steven Dao
 * @version 1.0
 * Due Date: May 5th, 2021, 2:00pm
 *
 * Purpose: Creates a MercuryMetal object.
 *
 * Target Output: A mercury metal object with any specified traits.
 */
public class MercuryMetal extends MineralObject {

    /**
     * Default constructor which constructs a default MercuryMetal.
     */
    public MercuryMetal() {
        this("Mercury metal");
    }

    /**
     * Overloaded constructor which creates a MercuryMetal object with the given parameters.
     *
     * @param newName the name of the mercury metal
     */
    public MercuryMetal(String newName) {
        super(newName);

        // generate a random integer between -40 and -20
        int randomNum = Utility.generateRandomInt(-40, -20);
        this.setImpactScore(randomNum);
    }

}
