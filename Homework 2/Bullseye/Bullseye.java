/**
 * Project 2-Bullseye.java: 
 * Author:     Adolfo Sanpedro Gante
 * Module:     2
 * Project:    Lab
 * Problem Statement: Write a program that displays a bulls-eye pattern with a circle in the middle and five (5) concentric circles around it.
                      Fill the circles with alternating colors of your choice.
 * 
 * Algorithm:
 *   Set up a JFrame
 *   Draw a circle a certain color
 *   Repeat draws circles with alternating colors while shrinking the circles size
 */

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Bullseye extends JFrame {

    // Set up constants for the title, height, and width of the JFrame
    final static String TITLE = "Bullseye" ;
    final static int WIDTH = 500,           // width of JFrame (including borders)
    HEIGHT = 500 ;         // height of JFrame (borders and controls)

    public void paint(Graphics canvas) {
        //Sets frames color
        canvas.setColor(Color.WHITE);
        canvas.fillRect(0, 0, 10000, 10000);

        //draws frist circle
        canvas.setColor(Color.BLUE);
        canvas.fillOval(125,125,250,250);
        //draws second circle
        canvas.setColor(Color.PINK);
        canvas.fillOval(150,150,200,200);
        //draws third circle
        canvas.setColor(Color.BLUE);
        canvas.fillOval(175,175,150,150);
        //draws fourth circle
        canvas.setColor(Color.PINK);
        canvas.fillOval(200,200,100,100);
        //draws fith circle
        canvas.setColor(Color.BLUE);
        canvas.fillOval(225,225,50,50);
    }

    public static void main(String[] args) {
        // Create the JFrame and set its size, title, close operation, and location.
        Bullseye frame = new Bullseye() ;
        frame.setSize(WIDTH, HEIGHT) ;
        frame.setTitle("Bullseye") ;                  // set the title in upper-left corner
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;   // close when X is clicked
        frame.setLocationRelativeTo(null) ;               // center JFrame on user's screen

        // Make drawing visible
        frame.setVisible(true) ;
    }
}