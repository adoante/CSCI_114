
/**
 * Pro.java: Creates a Pro Basketball Player with name and set score.
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 11, Homework #1
 */
public class Pro extends Player
{
    /**
     * <p>
     * One arg Constructor
     * </p>
     * 
     * @param name A Pro Player's name
     */
    public Pro(String name){
        super(name);
    }

    /**
     * <p>
     * Accesses a Pro Player's score.
     * <p>
     * 
     * @return A Pro Player's score.
     */
    public int getScore() {
        return (15);   
    }

    /**
     * <p>
     * Prints a Pro Player's name and score.
     * <p>
     * 
     * @return A Pro Player's name and score.
     */
    public String  toString() {
        return ("Pro: " + getName() + ", Score: " + getScore());   
    }
}