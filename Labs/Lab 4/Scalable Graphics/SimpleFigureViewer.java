/**
 * SimpleFigureViewer.java - Create a graphics with an overlapping circle and a rectangle
 * Author:     Adolfo Sanpedro Gante
 * Module:     4
 * Project:    Lab, Phase 1
 * Problem Statement: Demonstrate the JFrame / JComponent / Graphic class structure by
 *    creating a SimpleFigure class which draws an overlapping circle and square.
 *
 * Algorithm:
 *   1.  Create a SimpleFigure class which draws a circle overlapping a rectangle.
 *       *  The class will extend a JFrame (meaning that it will be a JFrame with some
 *          added properties and/or methods).
 *       *  This class will contain the main method, which:
 *            a. creates a new JFrame
 *            b. sets the size, close-button behavior, and location relative to the
 *               upper-left corner of the screen
 *            c. makes this object (JFrame) visible
 *   2.  Create a SimpleFigureComponent class, which will hold all graphics figures.  This
 *       class will have one method named "paint" which is invoked every time
 *       the JComponent (or JFrame) changes.
 *   3.  Create a SimpleFigure class which will actually draw an overlapping red circle on top
 *       of a black rectangle.
 *       3a. The upper-left corner of the Rectangle will be (100, 100), with a width of 275
 *           and height of 200
 *       3b. The upper-left corner of the Circle will be at (175, 175) with a diameter of 220
 */

import javax.swing.JFrame;

public class SimpleFigureViewer {

    public static final String TITLE = "Two figures" ;       // JFrame title
    public static final int WIDTH = 780 ;                      // JFrame width (in pixels)
    public static final int HEIGHT = 600 ;                     // JFrame height (in pixels)

    public static void main(String[] args) {

        // Create a new JFrame
        JFrame frame = new JFrame() ;

        // Set the size, title, and exit operationframe.  Open at the center of the screen
        frame.setTitle(TITLE);
        frame.setSize(WIDTH, HEIGHT) ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null) ;

        // Instantiate a new JComponent object, then make the JFrame visible
        frame.add(new SimpleFigureComponent());                // anonymous (no variable name)
        frame.setVisible(true);
   }
}

