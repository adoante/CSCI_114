
/**
 * Rectangle.java - creates a rectangle to draw  
 * Author:     Adolfo Sanpedro Gante
 * Module:     3
 * Project:    Homework
 *
 * Instance variables:
 *   String id -  identifies rectangle object
 *   int x - represents the x-coordinate of the upper-left corner of the rectangle
 *   int y - represents the y-coordinate of the upper-left corner
 *   int width - represents the horizontal size (in the 'x' direction) of the rectangle
 *   int height - represents the vertical size (in the 'y' direction) of the rectangle
 *   
 * Methods:
 *   No-Arg constructor
 *   Full constructor
 *   All getters and setters
 *   toString
 *   draw
 *   center
 *   erase
 */
public class Rectangle
{
    //Instance Variables
    private String ID = " ";
    private int x = 0;
    private int y = 0;
    private int width = 0;
    private int height = 0;

    //Constructors
    public Rectangle() {

    }

    public Rectangle(String newID, int newHeight, int newWidth, int newX, int newY) {
        ID = newID;
        x = newX;
        y = newY;
        width = newWidth;
        height = newHeight;
    }
    
    public String rectangleString() {
         return ("In constructor of " + ID + " with height " + height + " and width "
                 + width + " at (" + x + ", " + y + ")"); 
    }

    //Prints what methods are used my certain rectangles ID
    public String draw(String newID) {
        return ("Running draw() for " + newID + ".");
    }

    public String erase(String newID) {
        return ("Running erase() for " + newID + ".");
    }

    public String center(String newID) {
        return ("Running center() for " + newID + ".\n" + "Running erase() for " + newID + ".\n" 
                + "Centering " + newID + ".\n" + "Running draw() for " + newID + ".\n");
    }

    //All getters
    public String getID() {
        return (ID);
    }

    public int getX() {
        return (x);
    }

    public int getY() {
        return(y);
    }

    public int getWidth() {
        return(width);
    }

    public int getHeight() {
        return(height);
    }

    //All setters
    public void setID(String newID) {
        ID = newID;
    }

    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY; 
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public void setHeight(int newHeight) {
        height = newHeight;
    }

    //"stubs" for setters
    public String heightString() {
        return ("Running setter of height for " + ID + " with value of " + height);
    }

    public String widthString() {
        return ("Running setter of width for " + ID + " with value of " + width);
    }

    public String xString() {
        return ("Running setter of x for " + ID + " with value of " + x);
    }

    public String yString() {
        return ("Running setter of y for " + ID + " with value of " + y);
    }

    //to string method that lists rectangle information
    public String toString() {
        return ( ID + ", height " + height + " and width " 
            + width + " at (" + x + ", " + y + ")");
    }
}
