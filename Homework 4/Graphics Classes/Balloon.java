
/**
 * Balloon.java - Draw a Ellipse2D object and Rectangle2D underneath it. 
 * Author:     Adolfo Sanpedro Gante
 * Module:     4
 * Project:    Homework
 * Description: Draw a single rectangle / circle on the graphic
 *
 * Instance variables:
 *   *  xLeft
 *   *  yTop
 *   *  scale
 *
 * Methods:
 *   *  draw(), which actually draws the Circle (oval) and Rectangle on the underlying
 *       graphics object
 */

import java.awt.Graphics2D ;
import java.awt.Graphics ;
import java.awt.geom.Ellipse2D ;
import java.awt.Rectangle ;
import java.awt.Color ;

public class Balloon
{
    //Constants
    private static final int CIRCLE_WIDTH = 110;
    private static final int CIRCLE_HEIGHT = 130;
    private static final int RECTANGLE_WIDTH = 8;
    private static final int RECTANGLE_HEIGHT = 200;
    private static final int RECTANGLE_X_OFFSET = 52;
    private static final int RECTANGLE_Y_OFFSET = 130;
    
    //Instance Variables
    private int xLeft = 0;
    private int yTop = 0;
    private double scale = 0;
    
    //Constructor which updates instance variables
    public Balloon(int xLeft, int yTop, double scale) {
        this.xLeft = xLeft;
        this.yTop = yTop;
        this.scale = scale;
    }
    
    public void draw(Graphics2D figure) {

        //Calculations for rescaling the circle (balloon)
        int circleX = (int) (xLeft);
        int circleY = (int) (yTop);
        int circleWidth = (int) (CIRCLE_WIDTH * scale);
        int circleHeight = (int) (CIRCLE_HEIGHT * scale);
        //Creates a red balloon
        Ellipse2D.Double circle = new Ellipse2D.Double(circleX, circleY, circleWidth, circleHeight);
        figure.setColor(Color.RED) ;
        figure.fill(circle) ;
        
        //calculations for rescaling the rectangle (the balloon string)
        int rectangleX = (int) (xLeft + (RECTANGLE_X_OFFSET * scale));
        int rectangleY = (int) (yTop + (RECTANGLE_Y_OFFSET * scale));
        int rectangleWidth = (int) (RECTANGLE_WIDTH * scale);
        int rectangleHeight = (int) (RECTANGLE_HEIGHT * scale);
        //Creates a white rectangle
        Rectangle rectangle = new Rectangle(rectangleX, rectangleY, rectangleWidth, rectangleHeight) ;
        figure.setColor(Color.WHITE);
        figure.fill(rectangle);
    }
}
