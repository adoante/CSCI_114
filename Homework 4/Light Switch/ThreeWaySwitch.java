
/**
 * ThreeWaySwitch.java - creates a simulated 3-way light switch  
 * Author:     Adolfo Sanpedro Gante
 * Module:     4
 * Project:    Homework
 *
 * Instance variables:
 *   int firstSwitchState - the first light switches state, whether it is down or up
 *   int secondSwitchState - the second light switches state, whether it is down or up
 *   
 * Methods:
 *   Full constructor
 *   All getters and setters(toggle)
 *   toString
 */

public class ThreeWaySwitch
{
    //Instace Variables
    private int firstSwitchState = 0;
    private int secondSwitchState = 0;

    public ThreeWaySwitch(int initialFristSwtich, int initialSecondSwitch) {
        firstSwitchState = initialFristSwtich;
        secondSwitchState = initialSecondSwitch;
    }

    public int getFirstSwitchState() {
        return (firstSwitchState);
    }

    public int getSecondSwitchState() {
        return(secondSwitchState);   
    }

    public int getLightState() {
        return (firstSwitchState + secondSwitchState) % 2;   
    }
    
    public void toggleFirstSwitch() {
        firstSwitchState = (firstSwitchState + 1) % 2;
    }
    
    public void toggleSecondSwitch() {
        secondSwitchState = (secondSwitchState + 1) % 2;
    }
    
    public String toString(){
     return("First Switch is " + (getFirstSwitchState() == 1 ? "up." : "down.")
             + " Second switch is " + (getSecondSwitchState() == 1 ? "up." : "down.") +
             " The light is " + (getLightState() == 1 ? "on." : "off."));
    }
    
    
    
}
