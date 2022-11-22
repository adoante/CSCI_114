import java.text.DecimalFormat;

/**
 * Figure.java: Makes a shape with a height and width that are used to calculate area and perimiter
 *
 * @author Adolfo Sanpedro Gante
 * @verison Module 15, Lab
 */

public abstract class Figure {
  //Instance Variables
  private double area = 0.0;
  private double perimeter = 0.0;

  //Formats the Perimeter and Area to two decimal places
  public DecimalFormat df = new DecimalFormat("0.00");

  /**
   * A no arg constructor because the class is abstract.
   */
  public Figure () {

  }

  //Setters and Getters

  /**
   * Sets a Figures area
   * @param area the area of a shape
   */
  public void setArea(double area) {
    this.area = area;
  }
  /**
   * Sets a Figures perimeter
   * @param perimeter the perimeter of a shape
   */
  public void setPerimeter(double perimeter) {
    this.perimeter = perimeter;
  }
  /**
   * Gets a Figures area
   * @return the area
   */
  public double getArea() {
    return this.area;
  }
  /**
   * Gets a Figures perimeter
   * @return the perimeter
   */
  public double getPerimeter() {
    return this.perimeter;
  }

  public abstract String toString();

  public abstract boolean equals(Object anObject);

  public abstract void calcPerimiter();

  public abstract void calcArea();

  /**
   * Gives the number of sides to a figure.
   * @return 0
   */
  public int getNumberOfSides() {
    return 0;
  }

}
