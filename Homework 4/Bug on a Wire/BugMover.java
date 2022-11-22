
/**
 * BugMover.java - tests the Bug Class methods by moving two bugs
 * Author:     Adolfo Sanpedro Gante
 * Module:     4
 * Project:    Homework
 * Problem Statement: Implement a class named  Bug  that models a bug walking along a wire. 
 *                    From our view, the bug can move either left or right. Initially but bug moves
 *                    to the right (in the positive direction),
 *                    but it can turn and move in the opposite direction (in the negative direction). 
 *                    When the bug moves, it moves one unit in the current direction it is facing.
 *                    
 * Algorithm:
 *    1. Create two  Bug  objects, the first at position 5, and the second at position 10.
 *    2. Move the first bug 3 times.
 *    3. Print the position of the first bug.
 *    4. Turn the second bug and move 2 times.
 *    5. Print the position of the second bug.
 */
public class BugMover
{
    public static void main(String[] args) {
        //Creates two bugs both facing right
        //1st bug at position 5
        //2nd bug at position 10
        Bug flik = new Bug("Flik", 5, 1); //now at 5
        Bug heimlich = new Bug("Heimlich",10, 1); //now at 10

        //Moves 1st bug 3 times
        flik.move();
        flik.move();
        flik.move();
        //prints 1st bugs position
        System.out.println(flik);

        //Turns 2nd bug and moves 2 times
        heimlich.turn();
        heimlich.move();
        heimlich.move();
        System.out.println(heimlich);
    }
}
