import java.awt.Graphics2D ;
import java.awt.Graphics ;
import java.awt.geom.Ellipse2D ;
import java.awt.Rectangle ;
import java.awt.Color ;

/**
 * <h2>BullseyeRecursive.java - Draw a black and red bullseye using recursion</h2>
 * Creates a black & red bullseye using recursion to draw smaller and smaller circles
 * <p>Instance variables:</p>
 * <ul>
 *   <li>startDiameter - the diameter of the initial (outer) circle</li>
 *   <li>deltaDiameter - the number of pixels to decrease each smaller circle will be decreased</li>
 *   <li>xStart - the x-coordinate of the outer-most circle's upper-left corner</li>
 *   <li>yStart - the y-coordinate of the outer-most circle's upper-left corner</li>
 * </ul>
 * @author Chris Merrill
 * @version Module 14, Demonstration
 */

public class BullseyeRecursive {

    // Instance variables
       double startDiameter = 0,                      // diameter of largest circle
           deltaDiameter = 0,                      // difference between successively smaller circles
           startX = 0,                             // x-coordinate of upper-left corner of first circle
           startY = 0 ;                            // y-coordinate of upper-left corner of first circle
       int lightGrey = 210;
   /**
    * Constructor just sets the values of the four instance variables.
    *
    * @param start diameter (in pixels)
    * @param number of pixels to reduce diameter in each call
    * @param starting x-coordinate in JFrame
    * @param starting y-coordinate in JFrame
    */
    public BullseyeRecursive (double startDiameter, double deltaDiameter, double startX, double startY) {
        this.startDiameter = startDiameter ;
        this.deltaDiameter = deltaDiameter ;
        this.startX = startX ;
        this.startY = startY ;
    }

   /**
    * Initial call to begin recursion the initial values (from the constructor)
    * @param the graphics object to draw on
    */
    public void draw(Graphics2D g2) {
        drawCircles(startDiameter, startX, startY, g2) ;
     }

   /**
    * Recursive method to draw concentric circles.  Base case is when the diameter is less than 100 pixels.
    * @param the diameter (in pixels) of circle to draw
    * @param upper-left x-coordinate of circle
    * @param upper-right y-coordinate of circledeltaDiameter = 0
    * @param graphics object on which to draw circle
    */
    private void drawCircles(double diameter, double xCorner, double yCorner, Graphics2D g2) {

        // Fill in circle, then draw a black circle around its border.
        Ellipse2D.Double circle = new Ellipse2D.Double(xCorner, yCorner, diameter, diameter);
        Color circleColor = new Color (lightGrey, lightGrey, lightGrey);
        g2.setColor(circleColor);
        g2.fill(circle) ;
        g2.draw(circle) ;

        // Recursive case?  If the diameter is more than 100 pixels, then draw a smaller circle
        // inside this circle decreasing the diameter by "deltaDiameter", and moving the upper-left
        // corner to the right and down by half the diameter change.
        if (deltaDiameter == 20){
          if (diameter >= 100) {
            lightGrey = lightGrey - 10;
              drawCircles(diameter - deltaDiameter, xCorner + deltaDiameter / 2,
                                   yCorner + deltaDiameter / 2, g2) ;
          }
        }
        else if (deltaDiameter == 0.1) {
          if (diameter >= 100) {
            lightGrey = lightGrey - 10;
              drawCircles(diameter - (diameter * deltaDiameter), xCorner + (diameter * deltaDiameter) / 2,
                                   yCorner + (diameter * deltaDiameter) / 2, g2) ;
          }
        }

    }
}
