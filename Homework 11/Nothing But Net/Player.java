
/**
 * Player.java: Creates a Basketball Player with a name and score.
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 11, Homework #1
 */
public class Player
{
    //Instance Variables
    private String name = " ";

    /**
     * <p>
     * Player Constructer with one arg.
     * </p>
     * 
     * @param name A Players Name
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Accesses a Player's name.
     * <p>
     * 
     * @return A Player's name.
     */
    public String getName(){
        return (name);   
    }

    /**
     * <p>
     * Mutates a Player's name.
     * <p>
     * 
     * @param name A new name for a Player.
     */
    public void setName(String name){
        this.name = name;   
    }

    /**
     * <p>
     * Accesses a Player's score.
     * <p>
     * 
     * @return 0
     */
    public int getScore() {
        return (0);   
    }

    /**
     * <p>
     * Prints a Player's name and score.
     * <p>
     * 
     * @return A Player's name and score.
     */
    public String toString() {
        return("Name: " + name +", Score: " + getScore());   
    }

    /**
     * <p>
     * Compares a Player's name and score to another Player's name and score.
     * 
     * @param anObject An Object of Object Class
     * @return Either true or false
     */
    public boolean equals(Object anObject) {
        if (anObject == null) {
            return false;   
        }
        if (getClass() != anObject.getClass()) {
            return false;   
        }
        Player otherPlayer = (Player) anObject;
        return (getName().equals(otherPlayer.getName()) & getScore() == otherPlayer.getScore()); 
    }
}
