/**
 * MsPacman.java: 
 * Author:     Adolfo Sanpedro Gante
 * Module:     2
 * Project:    Lab
 * Problem Statement: Draw two more pictures of our own design.
 * 
 * Algorithm:
 *    Look up refrence of pixel art MsPacman
 *    Divided frames in a grid of square
 *    Draw squares and rectangles as "pixels" following the refrence
 */

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class MsPacman extends JFrame {

    // Set up constants for the title, height, and width of the JFrame
    final static String TITLE = "MsPacman" ;
    final static int WIDTH = 375,           // width of JFrame (including borders)
    HEIGHT = 400 ;         // height of JFrame (borders and controls)

    public void paint(Graphics canvas) {
        //Sets frames color
        canvas.setColor(Color.YELLOW);
        canvas.fillRect(0, 0, 10000, 10000);
        
        canvas.setColor(Color.BLACK);
        canvas.fillRect(100,25,50,25);
        canvas.fillRect(75,50,25,25);
        canvas.fillRect(150,50,125,25);
        canvas.fillRect(75,75,25,25);
        canvas.fillRect(275,75,50,25);
        canvas.fillRect(325,100,25,25);
        canvas.fillRect(350,125,25,50);
        canvas.fillRect(25,100,50,25);
        canvas.fillRect(0,125,25,25);
        canvas.fillRect(25,150,25,125);
        canvas.fillRect(50,275,25,50);
        canvas.fillRect(75,325,25,25);
        canvas.fillRect(100,350,50,25);
        canvas.fillRect(150,375,125,25);
        canvas.fillRect(275,350,50,25);
        canvas.fillRect(325,325,25,25);
        canvas.fillRect(350,275,25,50);
        canvas.fillRect(250,250,100,25);
        canvas.fillRect(250,175,100,25);
        canvas.fillRect(200,200,50,20);
        canvas.fillRect(200,230,50,20);
        canvas.fillRect(150,215,50,20);
        canvas.setColor(Color.RED);
        canvas.fillRect(300,150,50,25);
        canvas.fillRect(300,275,50,25);
        canvas.fillRect(100,50,50,25);
        canvas.fillRect(100,75,50,25);
        canvas.fillRect(125,75,50,25);
        canvas.fillRect(125,100,50,25);
        canvas.fillRect(75,100,50,25);
        canvas.fillRect(75,125,50,25);
        canvas.fillRect(25,125,50,25);
        canvas.fillRect(50,150,50,25);
        canvas.fillRect(50,175,50,25);
        canvas.setColor(Color.BLUE.darker( ));
        canvas.fillRect(150,175,50,25);
        canvas.fillRect(175,150,50,25);
        canvas.fillRect(75,125,25,25);
        canvas.fillRect(100,100,25,25);
    }

    public static void main(String[] args) {
        // Create the JFrame and set its size, title, close operation, and location.
        MsPacman frame = new MsPacman() ;
        frame.setSize(WIDTH, HEIGHT) ;
        frame.setTitle("MsPacman") ;                  // set the title in upper-left corner
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;   // close when X is clicked
        frame.setLocationRelativeTo(null) ;               // center JFrame on user's screen

        // Make drawing visible
        frame.setVisible(true) ;
    }
}
