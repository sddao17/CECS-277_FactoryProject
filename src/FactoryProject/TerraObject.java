
package FactoryProject;

/**
 * @author Hoanh Nguyen, Leslie Ortega, Phoenix Ngan, Steven Dao
 * @version 1.0
 * Due Date: May 5th, 2021, 2:00pm
 *
 * Purpose: Creates a simulated Terra object, where each object will have its ow name and impact score.
 *
 * Target Output: A Terra object with user-specific traits.
 */
public abstract class TerraObject {

    protected String name;
    protected String categoryType;
    protected int impactScore;

    /**
     * Null constructor for the TerraObject class.
     * Default constructor is null due to the class being abstract.
     */
    public TerraObject() {
        this("", "");
    }

    /**
     * Overloaded constructor which creates a Terra object with the given parameters.
     *
     * @param newName the name of the terra object
     */
    public TerraObject(String newName, String newCategoryType) {
        name = newName;
        categoryType = newCategoryType;
        impactScore = 0;
    }

    /**
     * Returns the name of the Terra object.
     *=
     * @return the name of the terra object
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the impact score of the Terra object.
     *
     * @return the impact score of the terra object
     */
    public int getImpactScore() {
        return impactScore;
    }

    /**
     * Returns the name of the category's type.
     *
     * @return the name of the category's type.
     */
    public String getCategoryType() {
        return categoryType;
    }

    /**
     * Sets the impact score of the Terra Object.
     *
     * @param newImpactScore the new impact score of the terra object
     */
    public void setImpactScore(int newImpactScore) {
        impactScore = newImpactScore;
    }

    /**
     * Returns a description of the Terra object.
     *
     * @return a description of the Terra Object
     */
    @Override
    public String toString() {
        return "Name: " + name + ", Impact score: " + impactScore;
    }

}
