/**
 * Circle.java: Creates a Circle shape using the Figure class as parent class.
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 15, Lab
 */

public class Circle extends Figure {
  //Instance Variables
  private double radius = 0.0;

  /**
   * One arg constructor that sets a circles radius
   * @param radius the length of a straight line from the center to the circumference of a circle or sphere
   */
  public Circle (double radius) {
    this.radius = radius;
  }

  //Setters and Getters

  /**
   * Sets the radius of a circle
   * @param radius the length of a straight line from the center to the circumference of a circle or sphere
   */
  public void setRadius (double radius) {
    this.radius = radius;
  }
  /**
   * Gets the radius of a circle
   * @return a Circles radius
   */
  public double getRadius () {
    return this.radius;
  }

  //toString and equals

  /**
   * Prints a Circles radius, area and perimeter
   * @return radius, area and perimeter
   */
  public String toString () {
    return ("Circle has a radius of: " + df.format(radius) + ", Perimeter: " +
            df.format(getPerimeter()) + ", Area: " + df.format(getArea()));
  }

  /**
   * Checks two Circles and determines if they are equal
   * @param  anObject a Circle object
   * @return          true or false
   */
  public boolean equals(Object anObject) {
    if (anObject == null) {
      return false;
    }
    if (getClass() != anObject.getClass()) {
      return false;
    }
    Circle otherCircle = (Circle) anObject;
    return (radius == otherCircle.radius);
  }

  //Calculates Area and Perimeter

  /**
   * Calculates the area of circle using 2 PI r^2
   */
  public void calcArea () {
    setArea(Math.PI * (radius * radius));
  }
  /**
   * Calculates the perimeter of a circle using 2 PI r
   */
  public void calcPerimiter () {
    setPerimeter(2 * Math.PI * radius);
  }
}
