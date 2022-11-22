/**
 * Sqaure.java: Creates a Sqaure shape using the Rectangle class as parent class.
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 15, Lab
 */

public class Square extends Rectangle {
  //Instnace Variables
  //None

  /**
   * One arg constructor that sets the length of a squares sides
   * @param sideLength a Squares side length
   */
  public Square (double sideLength) {
    super (sideLength, sideLength);
  }

  //Getters and Setters

  /**
   * Sets the side lengths of a square
   * @param sideLength a squares side length
   */
  public void setLength(double sideLength) {
    setWidth(sideLength);
    setHeight(sideLength);
  }
  /**
   * Gets a square's side length
   * @return a squares side length
   */
  public double getLength (){
    return getWidth();
  }

  //toString

  /**
   * Prints a Squares Side Length, Perimeter and Area.
   * @return side Length, Perimeter and Area.
   */
  public String toString() {
    return ("Square has side Lengths of: " + df.format(getLength()) + ", Perimeter: " +
            df.format(getPerimeter()) + ", Area: " + df.format(getArea()));
  }
}
