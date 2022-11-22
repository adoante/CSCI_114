
/**
 * Scrub.java: Creates a Scrub Basketball Player with name and set score.
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 11, Homework #1
 */
public class Scrub extends Player
{
    /**
     * <p>
     * One arg Constructor
     * </p>
     * 
     * @param name A Scrub Player's name
     */
    public Scrub(String name){
        super(name);
    }

    /**
     * <p>
     * Accesses a Scrub Player's score.
     * <p>
     * 
     * @return A Scrub Player's score.
     */
    public int getScore() {
        return (6);   
    }

    /**
     * <p>
     * Prints a Scrub Player's name and score.
     * <p>
     * 
     * @return A Scrub Player's name and score.
     */
    public String  toString() {
        return ("Scrub: " + getName() + ", Score: " + getScore());   
    }
}
