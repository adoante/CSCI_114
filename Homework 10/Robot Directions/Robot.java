import java.awt.Point;

/**
 * Robot.java: Simulates a robot wandering on an infinite two-dimensional plane. 
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 10, Homework #1
 */
public class Robot
{
    private String direction = "N";
    private Point coordinates;

    /**
     * <p>
     * Creates a Robot Object on a two-dimensional plane.
     * <p>
     * 
     * @param direction The initial direction the robot is facing. 
     * @param coordinates The inital start point of the robot.
     * 
     */
    public Robot(String direction, Point coordinates) {
        this.direction = direction;
        this.coordinates = coordinates;
    }

    /**
     * <p>
     * Turns the Robots direction left from its current direction.
     * <p>
     * 
     * <p>
     * Precondition: A Robot Object exists with an initial direction. <br />
     * Postcondition: The Robot is now facing left of its previous direction.
     */
    public void turnLeft() {
        if (direction == "N" || direction == "n")
        {
            this.direction = "W";
        }
        else if (direction == "S" || direction == "s")
        {
            this.direction = "E";
        }
        else if (direction == "E" || direction == "e")
        {
            this.direction = "N";
        }
        else if (direction == "W" || direction == "w")
        {
            this.direction = "S";
        }
    }
    
    /**
     * <p>
     * Turns the Robots direction right from its current direction.
     * <p>
     * 
     * <p>
     * Precondition: A Robot Object exists with an initial direction. <br />
     * Postcondition: The Robot is now facing right of its previous direction.
     */
    public void turnRight() {
       if (direction == "N" || direction == "n")
        {
            this.direction = "E";
        }
        else if (direction == "S" || direction == "s")
        {
            this.direction = "W";
        }
        else if (direction == "E" || direction == "e")
        {
            this.direction = "S";
        }
        else if (direction == "W" || direction == "w")
        {
            this.direction = "N";
        }
    }
    
    /**
     * <p>
     * Moves the Robot by one unit depending on its direction.
     * <p>
     * 
     * Precondition: A named Robot Object Exists. <br />
     * Postcondition: The Robot object has moved one unit towards its direction.
     */
    public void move() {
        if (direction == "N") {
            coordinates.move((int) coordinates.getX(), (int) coordinates.getY() + 1);
        }
        else if (direction == "S") {
            coordinates.move((int) coordinates.getX(), (int) coordinates.getY() - 1);
        }
        else if (direction == "W") {
            coordinates.move((int) coordinates.getX() - 1, (int) coordinates.getY());
        }
        else if (direction == "E") {
            coordinates.move((int) coordinates.getX() + 1, (int) coordinates.getY());
        }
    }
    
    /**
     * <p>
     * Gets the (x, y) coordinates of a Robot Objects location.
     * <p>
     * 
     * Precondition: A named Robot Object Exists. <br />
     * Postcondition: A Robot Objects (x, y) coordinates are returned.
     * 
     * @return the (x, y) coordinates of a Robot Object
     * 
     */
    public Point getLocation() {
        return (coordinates.getLocation());
    }
    
    /**
     * <p>
     * Gets the direction of a Robot Object.
     * <p>
     * 
     * Precondition: A named Robot Object Exists. <br />
     * Postcondition: A Robot Objects direction are returned.
     * 
     * @return the direction of a Robot Object
     * 
     */
    public String getDirection() {
        return direction;
    }
    
    /**
     * <p>
     * Prints a Robot Objects direction and coordinates.
     * <p>
     * 
     * Precondition: A named Robot Object Exists. <br />
     * Postcondition: A Robot Objects direction and coordinates are returned.
     * 
     * @return the direction and coordinates of a Robot Object
     * 
     */
    public String toString() {
        return ("Direction: " + direction + " and Location: " + (int) coordinates.getX() + ", " + (int) coordinates.getY());
    }
    
    /**
     * <p>
     * Compares two Robots direction and coordinates and determines if they are equal
     * </p>
     * 
     * <p>
     * Precondition: Two named Robot Object Exists <br />
     * Postcondition: none
     * </p>
     * 
     * @param anotherRobot A different Robot object
     * @return either true or false dependent on whether or not the two Robots are equal
     * 
     */
    public boolean equals(Robot anotherRobot) {
        if (direction.equals(anotherRobot.direction)) {
            if(coordinates.equals(anotherRobot)) {
                return true;   
            }
        }
        return false;
    }
}