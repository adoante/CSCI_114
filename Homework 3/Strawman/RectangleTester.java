
/**
 * RectangleTester.java - Tests the methods in the Rectangle class
 * Author:     Adolfo Sanpedro Gante
 * Module:     3
 * Project:    Lab
 * Problem Statement: create a class named  Rectangle.  This class should have "stubs"   
 *                    for its constructor, getters, setters, and methods  erase, draw, 
 *                    center, and  toString. In these stubs, each method simply prints 
 *                    a message with the name of the method being called, the  id  of the calling
 *                    object, and and relevant properties of the calling object. 
 *                    
 * Algorithm: 
 *     1. Creates two rectangles 
 *     2. Use the draw method and its "stub" to print out the methods name and id
 *     3. Use the centers method and its "stub" to print out the methods name and id
 *     4. Use the center method and its "stub" to print out the methods name and id
 *        and its "stubs" for the draw/erase method
 *     5. Getters print out varibles name and id for the rectangle
 *     6. Setters print out varibles name and id for the rectangle
 *     7. the toString method prints out the rectangles id,height,width,x,y
 */
public class RectangleTester
{
    public static void main(String[] args) {
        //Creates two rectangles
        Rectangle one = new Rectangle("one", 25, 13, 4, 12);
        Rectangle two = new Rectangle("two", 7, 17, 29, -11);
        
        //Stubs for rectangles constructors
        System.out.println(one.rectangleString());
        System.out.println(two.rectangleString());
        System.out.println();
        
        //draws both rectangles
        System.out.println(one.draw(one.getID()));
        System.out.println(two.draw(two.getID()));
        
        //Centers rectangle "one"
        System.out.println(one.center(one.getID()));
        
        //Sets the height and width for "one"
        one.setHeight(28);
        one.setWidth(16);
        
        //stubs for height and width setters
        System.out.println(one.heightString());
        System.out.println(one.widthString());
        
        //Sets the x and y position of "two"
        two.setX(15);
        two.setY(-34);
        
        //stubs for x and y position
        System.out.println(two.xString());
        System.out.println(two.yString());
        System.out.println();
        
        //Invokes the toString method for each rectangle
        System.out.println("Running toString() " + one);
        System.out.println("Returned: " + one);
        System.out.println("Running toString() " + two);
        System.out.println("Returned: " + two);

    }
}
