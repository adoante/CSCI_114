/**
 * SimpleFigureComponent.java - Contains two SimpleFigure object
 * Author:     Adolfo Sanpedro Gante
 * Module:     4
 * Project:    Lab, Phase 1
 * Description: Instantiate one SimpleFigure object on this JComponent.
 *
 */

import java.awt.Graphics ;
import java.awt.Graphics2D ;
import javax.swing.JComponent ;

public class SimpleFigureComponent extends JComponent {

    // Paints a picture of a Rectangle / Circle figure on the canvas.  All info about
    // the rectangle and circle are in Simplefigure.
    public void paint(Graphics g) {

        // Extend using the Graphics2D library so we can add objects to the canvas
        Graphics2D g2 = (Graphics2D) g;

        // Create one SimpleFigure object and draw
        SimpleFigure figure1 = new SimpleFigure(100, 100, 1.0) ;
        figure1.draw(g2) ;
        
        //calculation that allows the 2nd simple figure to move with the JFrame 
        int x = (int) (getWidth() * 2.0 / 3.0);
        int y = (int) (getHeight() * 2.0 / 3.0);
        
        //creates 2nd SimpleFigure object and draws
        SimpleFigure figure2 = new SimpleFigure(x, y, 1.0 / 3.0);
        figure2.draw(g2) ;
    }
}
