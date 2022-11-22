/**
 * BalloonFigureComponent.java - Contains three balloon objects
 * Author:     Adolfo Sanpedro Gante
 * Module:     4
 * Project:    Homework
 * Description: Instantiates three balloons objects on this JComponent.
 *
 */

import java.awt.Graphics ;
import java.awt.Graphics2D ;
import javax.swing.JComponent ;

public class BalloonComponent extends JComponent {

    public void paint(Graphics g) {
        // Extend using the Graphics2D library so we can add objects to the canvas
        Graphics2D g2 = (Graphics2D) g;
        
        //calculation that allows the balloon objects to move with the JFrame
        int x = (int) (getWidth() * 1.0 / 4.0);
        int y = (int) (getHeight() * 1.0 / 4.0);
        
        //creates 3 balloon objects with different top-left corners and draws
        Balloon UP = new Balloon(x, y, 1.0 / 2.0);
        UP.draw(g2);
        
        Balloon UP2 = new Balloon(x + 175, y + 25, 1.0);
        UP2.draw(g2);
        
        Balloon UP3 = new Balloon(x + 300, y - 50, 1.0 / 2.0);
        UP3.draw(g2);
        
    }
}
