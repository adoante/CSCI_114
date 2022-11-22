
/**
 * NameAndBirths.java: A collection of the most popular baby names.
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 12, Homework #1
 */
public class NameAndBirths
{
    //Instance Variables
    String name = " ";       //A popular baby name
    int births = 0;          //The amount of babys named a popular name
    
    /**
     * <p>
     * Two args constructor with name and number of births
     * </p>
     * 
     * @param name A popular baby name
     * @param births The number of births 
     */
    public NameAndBirths(String name, int births) {
        this.name = name;   
        this.births = births;
    }
    
    //getters
    
    /**
     * <p>
     * Accesses the name
     * </p>
     * 
     * @return A name
     */
    public String getName() {
        return (name);   
    }
    
    /**
     * <p>
     * Accesses the number of births
     * </p>
     * 
     * @return the number of births
     */
    public int getBirths() {
        return (births);   
    }
    
    //setters
    
    /**
     * <p>
     * Mutates the name
     * </p>
     * 
     * @param name A name
     */
    public void setName(String name) {
        this.name = name;   
    }
    
    /**
     * <p>
     * Mutates the number of births
     * </p>
     * 
     * @param births the number of births
     */
    public void setBirths(int births) {
        this.births = births;   
    }
    
    /**
     * <p>
     * Prints the name and number of births
     * </p>
     * 
     * @return name and number of births
     */
    public String toString() {
        return("Name: " + name + ", Number of Births: " + births);
    }
    
    /**
     * <p>
     * Prints the name and number of births
     * </p>
     * 
     * @return name and number of births
     */
    public boolean equals(Object anObject) {
        if (anObject == null) {
            return false;   
        }
        if (anObject.getClass() != getClass()) {
            return false;   
        }
        NameAndBirths otherNameAndBirths = (NameAndBirths) anObject;
        return (name.equals(otherNameAndBirths.getName()) && births == otherNameAndBirths.getBirths());
    }
}
