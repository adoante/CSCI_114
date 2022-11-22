
/**
 * CircuitTester.java - Tests the methods in the ThreeWaySwitch class
 * Author:     Adolfo Sanpedro Gante
 * Module:     4
 * Project:    Homework
 * Problem Statement:  Simulate a circuit for controlling a hallway light that has switches at both
 *                     ends of the hallway. Each switch can be up or down, and the light can be on or off.
 *                     Toggling a switch turns the light on (if currently off) or off (if currently on).
 *                     This is called a 3-way switch.
 *                    
 * Algorithm: 
 *     1. Create a ThreeWaySwitch object
 *     2. Using the toggle methods create all 4 combinations (down/down, up/down, down/up, and up/up)
 *     3. Print the status of the two switches and if the light is On or Off for all 4 combinations
 */

public class CircuitTester
{
    public static void main(String[] args) {

        //Create Three Way Switch Object that sets both switches to Down(0)
        ThreeWaySwitch hallWay = new ThreeWaySwitch(0, 0);
        
        //Both are light switchs are down so light is off
        System.out.println(hallWay);
        
        //Toggles frist light switch, first light switch is up
        //second light switch is down
        //light is now on
        hallWay.toggleFirstSwitch();
        System.out.println(hallWay);
        
        //Toggles second light switch, second switch is up
        //first light switch is up
        //light is now off
        hallWay.toggleSecondSwitch();
        System.out.println(hallWay);
      
        //Toggles frist light switch, first switch is down
        //second light switch is up
        //light is now on
        hallWay.toggleFirstSwitch();
        System.out.println(hallWay);
    }
}
