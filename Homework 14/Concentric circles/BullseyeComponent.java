import java.awt.Graphics ;
import java.awt.Graphics2D ;
import javax.swing.JComponent ;

/**
 * <h2>BullseyeComponent.java - Draws one Bullseye object</h2>
 * <p>Description: Instantiate and place one bullseye figure on the left of a JFrame using a recursive
 *    version, and another bullseye on the right of the <code>JFrame</code> using an iterative version</p>
 * <ul>
 *   <li>Make each initial circle have a diameter of 450 pixels</li>
 *   <li>Make the difference between diameters of each smaller circle 50 pixels</li>
 *   <li>Put the initial recursive circle at x=50, y=35</li>
 *   <li>Put the initial iterative circle at x=525, y=35</li>
 *   <li>Draw each circle until the diameter is less than 100 pixels</li>
 * </ul>
 * @author Chris Merrill
 * @version Module 14, Demonstration
 */

public class BullseyeComponent extends JComponent {

   /**
    * Overrides <code>paint</code>in <code>JComponent</code> class.  Is called
    * every time that something on the JFrame changes.  This method calls <code>BullseyeRecursive</code>
    * and <code>BullseyeInterative</code> to show the difference between recursion and iteration.
    *
    * @param g The Graphics object on which all drawning is done.
    */
    public void paint(Graphics g) {

        // Extend using the Graphics2D library so we can add objects to the graphics object
        Graphics2D g2 = (Graphics2D) g;

        // Create one BullseyeRecursive object at location 50, 35.
        BullseyeRecursive eye1 = new BullseyeRecursive(450, 20, 50, 35) ;
        eye1.draw(g2) ;

        BullseyeRecursive eye2 = new BullseyeRecursive(450, 0.1, 500, 35) ;
        eye2.draw(g2) ;
    }
}
