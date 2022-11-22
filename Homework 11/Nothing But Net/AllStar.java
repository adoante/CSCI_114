
/**
 * AllStar.java: Creates an All Star Basketball Player with name and set score.
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 11, Homework #1
 */
public class AllStar extends Player
{
    /**
     * <p>
     * One arg Constructor
     * </p>
     * 
     * @param name An All-Star's name
     */
    public AllStar(String name){
        super(name);
    }

    /**
     * <p>
     * Accesses an All-Star Player's score.
     * <p>
     * 
     * @return An All-Star Player's score.
     */
    public int getScore() {
        return (35);   
    }
    
    /**
     * <p>
     * Prints an All-Star's Player name and score.
     * <p>
     * 
     * @return An All-Star's Player name and score.
     */
    public String  toString() {
        return ("All Star: " + getName() + ", Score: " + getScore());   
    }
}