import java.awt.Point;

/**
 * RobotTester.java: Tests the methods in the Robot Class;
 * <p>
 * <b>Problem Statement</b>: <br />  Using the Robot Class test the following methods with two robot objects.
 *                                   move(), turnRight(), turnLeft(), getLocation().
 * </p>
 * 
 * <b>Algorithm</b>: 
 *    <ol>
 *         <li> Create a  Robot  object. </li>
 *         <li> Move the robot two units to the north and display its current location. </li>
 *         <li> Turn the robot to the right. </li>
 *         <li> Move the robot two units and displays its location. </li>
 *         <li> Turn the robot to the left. </li>
 *         <li> Move the robot two units and displays its location. </li>
 *         <li> Create a second  Robot  object. </li>
 *         <li> Turn the second robot to the left. </li>
 *         <li> Move the second robot two units and display its location. </li>
 *         <li> Turn the second robot to the left again. </li>
 *         <li> Move the second robot two units and display its location. </li>
 *    </ol>
 * 
 * @author Adolfo Sanpedro Gante
 * @version Module 10, Homework #1
 */
public class RobotTester
{
    public static void main(String[] args) {
        Point coordinates = new Point(0, 0);
        
        //create a robot object
        Robot hal = new Robot("N", coordinates);
        
        //move the robot two units to the north and display its current location
        hal.move();
        hal.move();
        System.out.println(hal);
        
        //turn the robot to the right
        hal.turnRight();
        
        //move the robot two units and display its location
        hal.move();
        hal.move();
        System.out.println(hal);
        
        //turn the robot to the left
        hal.turnLeft();
        
        //move the robot two units and displays its location
        hal.move();
        hal.move();
        System.out.println(hal);
        
        Point coordinate = new Point(0, 0);
        
        //create a second  Robot  object
        Robot bender = new Robot("N", coordinate);
        
        //turns second robot to the left
        bender.turnLeft();
        
        //move the second robot two units and display its location
        bender.move();
        bender.move();
        System.out.println(bender);
        
        //turn the second robot to the left again
        bender.turnLeft();
        
        //move the second robot two units and display its location
        bender.move();
        bender.move();
        System.out.println(bender);
    }
}
