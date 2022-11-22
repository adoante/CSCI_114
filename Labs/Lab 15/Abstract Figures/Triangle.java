/**
 * Triangle.java: Creates a triangle shape using the Figure class as parent class.
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 15, Lab
 */

public class Triangle extends Figure {
  //Instance Variables
  private double side1 = 0.0;           //Side one length
  private double side2 = 0.0;           //Side two length
  private double side3 = 0.0;           //Side three length

  /**
   * Full arg constructor that takes all 3 lenghts of a triangle regardless of type.
   * @param side1 The length of the first side of the triangle
   * @param side2 The length of the second side of the triangle
   * @param side3 The length of the third side of the triangle
   */
  public Triangle (double side1, double side2, double side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  //Setters and Getters

  /**
   * Sets the side length of side1 of a triangle
   * @param side1 the side1 length
   */
  public void setSide1 (double side1) {
    this.side1 = side1;
  }
  /**
   * Sets the side length of side2 of a triangle
   * @param side1 the side2 length
   */
  public void setSide2 (double side2) {
    this.side2 = side2;
  }
  /**
   * Sets the side length of side3 of a triangle
   * @param side1 the side3 length
   */
  public void setSide3 (double side3) {
    this.side3 = side3;
  }
  /**
   * Gets the side length of side1
   * @return side1 length
   */
  public double getSide1 () {
    return this.side1;
  }
  /**
   * Gets the side length of side2
   * @return side2 length
   */
  public double getSide2 () {
    return this.side2;
  }
  /**
   * Gets the side length of side3
   * @return side3 length
   */
  public double getSide3 () {
    return this.side3;
  }

  /**
   * Gives the number of sides a triangle has
   * @return 3
   */
  public int getNumberOfSides() {
    return 3;
  }

  /**
   * Prints a triangles side lengths, perimeter, and area.
   * @return side1, side2, side3, perimeter and area
   */
  public String toString() {
    return ("Triangle has side lengths of: " + df.format(side1) + " " + df.format(side2) + " " + df.format(side3) +
            ", Perimeter: " + df.format(getPerimeter()) + ", Area: " + df.format(getArea()) );
  }

  /**
   * Checks two tringles and determines if they are equal
   * @param  anObject a triangle object
   * @return          true or false
   */
  public boolean equals(Object anObject) {
    if (anObject == null) {
      return false;
    }
    if (getClass() != anObject.getClass()) {
      return false;
    }
    Triangle otherTriangle = (Triangle) anObject;
    return (side1 == otherTriangle.side1 && side2 == otherTriangle.side2 && side3 == otherTriangle.side3);
  }

  /**
   * Calculates the Perimeter of a trianle using its three side lengths
   */
  public void calcPerimiter() {
    double P = (side1 + side2 + side3);
    setPerimeter(P);
  }
  /**
   * Calculates the Area of a trianle using its three side lengths
   */
  public void calcArea() {
    double P = (side1 + side2 + side3) / 2;
    double A = Math.sqrt( P * (P - side1) * (P - side2) * (P - side3) );
    setArea(A);
  }
}
