
/**
 * Bug.java - Creates a bug on a wire that moves left or right  
 * Author:     Adolfo Sanpedro Gante
 * Module:     4
 * Project:    Homework
 *
 * Instance variables:
 *   String name - the bugs name
 *   bugPosition - the bugs current position
 *   bugDirection - the bugs current direction (left/right)
 *
 * Methods:
 *   Full constructor
 *   getCurrentPosition
 *   getName
 *   move
 *   turn
 *   setName
 *   toString
 */
public class Bug
{
    //Instance Variables
    private int bugPosition = 0;
    private int bugDirection = 0;
    private String name = " ";
    
    //Constructor
    public Bug(String newName, int initialPosition, int initialDirection){
        name = newName;
        bugPosition = initialPosition;
        bugDirection = initialDirection;
    }
    
    //gets the bugs position
    public int getCurrentPosition(){
        return(bugPosition);   
    }
    //gets the bugs name
    public String getName() {
        return (name);
    }

    //moves the bug 1 unit either left or right
    public void move(){
        if (bugDirection == 1) {
            bugPosition = bugPosition + 1;
        }
        else {
            bugPosition = bugPosition - 1;
        }
    }
    //turns the bugs direction (1 = right, 0 = left)
    public void turn(){
        bugDirection = (bugDirection + 1) % 2;
    }
    //sets the bugs name
    public void setName(String newName) {
        name = newName;
    }
    //neatly prints out the bugs name and position
    public String toString(){
        return(name + " is at position " + bugPosition + ".");   
    }
}
