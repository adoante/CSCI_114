/**
 * Rectangle.java: Creates a Rectangle shape using the Figure class as parent class.
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 15, Lab
 */

public class Rectangle extends Figure {
  //Instance Variables
  private double height = 0.0;
  private double width = 0.0;

  /**
   * Full arg constructor that takes the two sides of a Rectangle
   * @param height The height of a Rectangle
   * @param width  The width of a Rectangle
   */
  public Rectangle (double height, double width) {
    this.height = height;
    this.width = width;
  }

  //Setters and Getters

  /**
   * Sets the height of a Rectangle
   * @param height a Rectangle
   */
  public void setHeight (double height) {
    this.height = height;
  }
  /**
   * Sets the width of a Rectangle
   * @param width width of a Rectangle
   */
  public void setWidth (double width) {
    this.width = width;
  }
  /**
   * Gets the height of a Rectangle
   * @return a Rectangle's height
   */
  public double getHeight () {
    return this.height;
  }
  /**
   * Gets the width of a Rectangle
   * @return a Rectangle's width
   */
  public double getWidth () {
    return this.width;
  }

  //toString and equals

  /**
   * Prints a Rectangles height, width, perimeter, and area.
   * @return height, width, perimeter, and area.
   */
  public String toString() {
    return ( "Rectangle has Height: "  + df.format(height) + ", Width: " + df.format(width) + ", Perimeter: "
            + df.format(getPerimeter()) + ", Area: " + df.format(getArea()) );
  }

  /**
   * Checks two Rectangles and determines if they are equal
   * @param  anObject a Rectangle object
   * @return          true or false
   */
  public boolean equals(Object anObject) {
    if (anObject == null) {
      return false;
    }
    if (getClass() != anObject.getClass()) {
      return false;
    }
    Rectangle otherRectangle = (Rectangle) anObject;
    return (height == otherRectangle.height && width == otherRectangle.width);
  }

  //calcArea and calcPerimiter

  /**
   * Calculates the Perimeter of a Rectangle using its width and height
   */
  public void calcPerimiter() {
    double P = ((height + width) * 2);
    setPerimeter(P);
  }
  /**
   * Calculates the Area of a Rectangle using its width and height
   */
  public void calcArea() {
    double A = (height * width);
    setArea(A);
  }

  //Number of sides
  /**
   * Gets the number of sides for a Rectangle
   * @return 4
   */
  public int getNumberOfSides() {
    return 4;
  }
}
