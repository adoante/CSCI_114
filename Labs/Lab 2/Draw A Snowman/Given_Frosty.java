/**
 * Frosty.java - Draw a picture of a snowman using Swing and Graphics packages
 * Author:     (put your name here)
 * Module:     2
 * Project:    Lab
 * Problem Statement: Using Java's graphics packages, draw a picture of a snowman,
 *    including circles for the body, eyes, and buttons.
 *
 * Algorithm:
 *
 * In main:
 *   1. Create a JFrame
 *   2. Set the JFrame's title "Frosty the Snowman"
 *   3. Set the JFrame' width (500) and height (620)
 *   4. Set the JFrame to close-on-exit
 *   5. Set the Jframe's location relative to null
 *   6. Make the JFrame visible
 *
 * In paint:
 *   7. Set the background to dark blue
 *   8. Refer to Lab for details:
 *     - Draw three circles for head, upper-body, and lower-body (legs)
 *     - Draw two dark magenta circles for eyes
 *     - Draw Frosty's mouth using drawArc
 *     - Draw three buttons on Frosty's upper body
 *     - Draw a black hat
 */

import java.awt.Color ;
import java.awt.Graphics ;
import javax.swing.JFrame ;

public class Frosty extends JFrame {

    // Set up constants for the title, height, and width of the JFrame
    final static String TITLE = "(what the title of your picture?)" ;
    final static int WIDTH = 100,           // width of JFrame (including borders)
                     HEIGHT = 100 ;         // height of JFrame (borders and controls)

    public void paint(Graphics canvas) {

    }

    public static void main(String[] args) {

        // Create the JFrame and set its size, title, close operation, and location.
        Frosty frame = new Frosty() ;
        frame.setSize(????????) ;
        frame.setTitle(???????) ;                     // set the title in upper-left corner
        frame.setDefaultCloseOperation(?????) ;       // close when X is clicked
        frame.setLocationRelativeTo(??????) ;         // center JFrame on user's screen

        // Make the snowman visible
        frame.setVisible(???????) ;
    }
}