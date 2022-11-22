/**
 * CircleInsideSquare.java: Sets up a a square JFrame with a centered circle of the same width/height
 * Author:     Adolfo Sanpedro Gante
 * Module:     2
 * Project:    Lab
 * Problem Statement: Write a graphics program to display a square containing a circle.
 *                    Make the diameter of the circle and the length of the square’s side equal,
 *                    so that the circle just touches each side of the square. 
 *
 * Algorithm:
 *   Sets up JFrame with size with width 500 and height 500
 *   draws circle
 *   draw rectangle left to the cricle with height equal to circles diameter
 *   draw rectangle right to the cricle with height equal to circles diameter
 *   draw rectangle above cricle with length equal to circles diameter plus double width size of previous rectangles
 *   draw rectangle below cricle with length equal to circles diameter plus double width size of previous rectangles
 */

import java.awt.Color ;
import java.awt.Graphics ;
import javax.swing.JFrame ;

public class CircleInsideSquare extends JFrame {

    // Set up constants for the title, height, and width of the JFrame
    final static String TITLE = "(what the title of your picture?)" ;
    final static int WIDTH = 500,           // width of JFrame (including borders)
    HEIGHT = 500 ;         // height of JFrame (borders and controls)

    public void paint(Graphics canvas) {
        //Sets frames color
        canvas.setColor(Color.PINK);
        canvas.fillRect(0, 0, 10000, 10000);

        //draws circle
        canvas.setColor(Color.BLUE.darker( ));
        canvas.fillOval(50,50,400,400);
        //draws square w/ 4 rectangles
        canvas.setColor(Color.GREEN.darker( ));
        canvas.drawRect(40,50,10,400);
        canvas.fillRect(40,50,10,400);
        canvas.drawRect(450,50,10,400);
        canvas.fillRect(450,50,10,400);
        canvas.drawRect(40,40,420,10);
        canvas.fillRect(40,40,420,10);
        canvas.drawRect(40,450,420,10);
        canvas.fillRect(40,450,420,10);
        //draws two-line boarder
        canvas.setColor(Color.BLACK);
        canvas.drawRect(45,45,410,410);
        canvas.drawRect(40,40,420,420);

    }

    public static void main(String[] args) {

        // Create the JFrame and set its size, title, close operation, and location.
        CircleInsideSquare frame = new CircleInsideSquare() ;
        frame.setSize(WIDTH, HEIGHT) ;
        frame.setTitle("Circle Inside Square") ;       // set the title in upper-left corner
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;       // close when X is clicked
        frame.setLocationRelativeTo(null) ;         // center JFrame on user's screen

        // Make drawing visible
        frame.setVisible(true) ;
    }
}
