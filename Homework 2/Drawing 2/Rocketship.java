/**
 * Rocketship.java:
 * Author:     Adolfo Sanpedro Gante
 * Module:     2
 * Project:    Lab
 * Problem Statement: Draw two more pictures of our own design.
 *
 * Algorithm:
 *    Draw tall oval as the body
 *    Draw 3 smaller tall ovals for the fins
 *    Draw a small circle for the window
 *   
 */

import java.awt.Color ;
import java.awt.Graphics ;
import javax.swing.JFrame ;

public class Rocketship extends JFrame
{
    // Set up constants for the title, height, and width of the JFrame
    final static String TITLE = "Rocketship" ;
    final static int WIDTH = 500,           // width of JFrame (including borders)
    HEIGHT = 500 ;         // height of JFrame (borders and controls)

    public void paint(Graphics canvas) {
        //Sets frames color
        canvas.setColor(Color.BLACK);
        canvas.fillRect(0, 0, 10000, 10000);
        
        //draws rocket body
        canvas.setColor(Color.WHITE);
        canvas.fillOval(150,50,100,200);
        //draws rocket fins
        canvas.setColor(Color.RED);
        canvas.fillOval(150,180,35,100);
        canvas.fillOval(220,180,35,100);
        canvas.fillOval(190,220,20,75);
        //draws rocket window
        canvas.setColor(Color.BLACK);
        canvas.fillOval(190,80,35,35);
        
    }
    
    public static void main(String[] args) {
        // Create the JFrame and set its size, title, close operation, and location.
        Rocketship frame = new Rocketship() ;
        frame.setSize(WIDTH, HEIGHT) ;
        frame.setTitle("Rocketship") ;                  // set the title in upper-left corner
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;   // close when X is clicked
        frame.setLocationRelativeTo(null) ;               // center JFrame on user's screen

        // Make drawing visible
        frame.setVisible(true) ;
    }
}
