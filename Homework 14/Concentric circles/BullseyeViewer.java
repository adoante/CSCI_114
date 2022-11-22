import javax.swing.JFrame;

/**
 * <h2>BullseyeViewer.java - Create black/red bullseyes using recursive and iterative methods.</h2>
 * <p>Problem Statement: Using recursion, draw successively smaller black and red circles to form
 *    a bullseye.  Do the same thing using an iterative method.</p>
 * <p>Algorithm:</p>
 * <ol>
 *   <li>Create a <code>Bullseye</code> class which will create start the process.
 *     <ul>
 *       <li>The class will extend a JFrame (meaning that it will be a <code>JFrame</code> with
 *           added properties and/or methods).</li>
 *     </ul>
 *   </li>
 *   <li>This class contains the main method, which creates a new <code>JFrame</code> (an object of this class),
 *       sets the size, close-button behavior, and location relative to the upper-left corner of the
 *       screen, and makes this object (JFrame) visible</li>
 *   <li>Create a <code>BullseyeComponent</code> class, which will hold two graphics figure - a bullseye figure
 *       drawn recursively on the left, and another on the right.  This class will have one method
 *       named <code>paint</code> which is invoked every time the <code>JCompnent</code> changes.</li>
 *   <li>Create a BullesyeRecursive class which will actually draw an bullseye consisting of overlapping
 *       black and red circles</li>
 *   <li>The constructor takes four parameters, all ints
 *     <ul>
 *       <li>the diameter of the largest circle comprising the bullseye (in pixels)</li>
 *       <li>the difference between successively smaller circles (in pixels)</li>
 *       <li>the x-coordinate of the upper-left corner of the initial circle</li>
 *       <li>the y-coordinate of the upper-left corner of the initial circle</li>
 *     </ul>
 *   </li>
 *   <li>Create a BullseyeIterative class which will do the same thing using a <code>while</code> loop</li>
 * </ul>
 * @author Chris Merrill
 * @version Module 14, Demonstration
 */

public class BullseyeViewer {

    public static final String TITLE = "Bullseye Viewer" ;
    public static final int CANVAS_WIDTH = 1050,
                            CANVAS_HEIGHT = 550 ;

    public static void main(String[] args) {

        // Create a new JFrame
        JFrame frame = new JFrame();

       // Set the size, title, and exit operationframe.  Open at the center of the screen
       frame.setTitle(TITLE);
       frame.setSize(CANVAS_WIDTH, CANVAS_HEIGHT) ;
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLocationRelativeTo(null) ;

       // Instantiate a new JComponent object, then make the JFrame visible
       frame.add(new BullseyeComponent());
       frame.setVisible(true);
   }
}
