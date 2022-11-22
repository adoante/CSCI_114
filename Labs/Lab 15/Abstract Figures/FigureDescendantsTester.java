/**
 * FigureDescendantsTester.java: Tests all the methods in the Figure Class and all of its descendants.
 *
 * </p>
 * <p>
 * <b>Algorithm</b>:
 *    <ol>
 *        <li> First, declare and create an array of six  Figure  objects </li>
 *        <li> Instantiate two  Rectangle  objects, both with height = 10.3 and width = 8.0.  Assign
 *             to elements #0 and #1 of the array </li>
 *        <li> Instantiate a  Square  with a side of 20 and put into element #2. </li>
 *        <li> Instantiate a triangle with sides of 6.5, 14.9, and 11.3. Put into element #3. </li>
 *        <li> Instantiate a circle with radius of 4.31 and put into element #4. </li>
 *        <li> Instantiate another circle with radius of 8.15 and put into element #5. </li>
 *        <li> Write a loop that spins through all of the elements in the array </li>
 *            <ul>
 *                <li> invoke  calculatePerimeter()  on each object in the array </li>
 *                <li> invoke  calculateArea()  on each object in the array </li>
 *                <li> use  toString  to show the details of the object in the array </li>
 *                <li> if  toString  doesn’t include perimeter or area, show those on a separate line </li>
 *            </ul>
 *        <li> Compare the  Rectangle  objects in elements 0 and 1 and determine if they are equal </li>
 *        <li> Compare the  Circle  objects in elements 4 and 5 and show if they are equal </li>
 *        <li> Compare the  Triangle  object in element 3 with the  Square  in element 2 and determine if they are equal. </li>
 *    </ol>
 * </p>
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 15, Lab
 */

public class FigureDescendantsTester {
  public static void main(String[] args) {
    //Declares and creates an array with 6 Figure objects
    Figure[] shapes = new Figure[6];

    //Instantiate two  Rectangle  objects, both with height = 10.3 and width = 8.0.
    //Sets them to index 0 and 1
    shapes[0] = new Rectangle(10.3, 8.0);
    shapes[1] = new Rectangle(10.3, 8.0);

    //Instantiate a  Square  with a side of 20 and put into element #2.
    shapes[2] = new Square(20.0);

    //Instantiate a triangle with sides of 6.5, 14.9, and 11.3. Put into element #3.
    shapes[3] = new Triangle(6.5, 14.9, 11.3);

    //Instantiate a circle with radius of 4.31 and put into element #4.
    shapes[4] = new Circle(4.31);

    //Instantiate another circle with radius of 8.15 and put into element #5.
    shapes[5] = new Circle(8.15);

    //For each loop to calculate Area/Perimeter and to print its values.
    int index = 1;
    for (Figure s : shapes) {
      s.calcArea();
      s.calcPerimiter();
      System.out.println("Figure #" + index + ": " + s);
      index++;
    }

    System.out.println();
    System.out.println("Tests equals() methods.");
    //Compare the  Rectangle  objects in elements 0 and 1 and determine if they are equal
    System.out.println("  Rectangle 1 and 2 are " + (shapes[0].equals(shapes[1]) ? "equal.": "not equal."));
    //Compare the  Circle  objects in elements 4 and 5 and show if they are equal
    System.out.println("  Circles 5 and 6 are " + (shapes[4].equals(shapes[5]) ? "equal.": "not equal."));
    //Compares Circle 5 to itself and show if they are equal
    System.out.println("  Circle 5 equal to itself? " + (shapes[4].equals(shapes[4]) ? "Yes.": "No."));
    //Compare the  Triangle  object in element 3 with the  Square  in element 2 and determine if they are equal.
    System.out.println("  Triangle 4 and Square 3 are " + (shapes[3].equals(shapes[2]) ? "equal.": "not equal."));



  }
}
