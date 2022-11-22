
/**
 * HotDogStand.java: Creates a Hotdog Stand with an ID and number of hotdogs sold.
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 10, Homework #2
 */
public class HotDogStand
{
    //Instance Variables
    private int id = 0;
    private int hotdogSold = 0;
    
    //Static Variables
    private static int totalSold = 0;

    /**
     * <p>
     * Creates a HotDogStand Object with an ID and number of hotdogSold.
     * <p>
     * 
     * @param id The number used to identify the hotdog stand. 
     * @param hotdogSold The current number of hotdogs sold.
     * 
     */
    public HotDogStand(int id, int hotdogSold) {
        this.id = id;
        this.hotdogSold = hotdogSold;
    }

    /**
     * <p>
     * Increases the number of hotdogs sold by one hotdog.
     * <p>
     * 
     * <p>
     * Precondition: A HotDogStand Object exists with an initial number of hotdogSold. <br />
     * Postcondition: The number of hotdogSold has increased by one hotdog.
     */
    public void justSold() {
        hotdogSold++;
    }

    /**
     * <p>
     * Gets the HotDogStand's ID
     * <p>
     * 
     * Precondition: A named Robot HotDogStand Exists. <br />
     * Postcondition: A HotDogStand Objects ID number is returned.
     * 
     * @return the ID number of a HotDogStand Object
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * <p>
     * Gets the HotDogStand's number of hotdogSold.
     * <p>
     * 
     * Precondition: A named Robot HotDogStand Exists. <br />
     * Postcondition: A HotDogStand Objects number of hotdogSold is returned.
     * 
     * @return the ID number of a HotDogStand Object
     * 
     */
    public int getHotdogSold() {
        return hotdogSold;   
    }

    /**
     * <p>
     * Compares two HotDogStand's hotdogSold and determines if they are equal
     * </p>
     * 
     * <p>
     * Precondition: Two named HotDogStand Object Exists <br />
     * Postcondition: none
     * </p>
     * 
     * @param anotherRobot A different HotDogStand object
     * @return either true or false dependent on whether or not the two HotDogStand's hotdogSold are equal
     * 
     */
    public boolean equals(int hotdogSold) {
        return this.hotdogSold == hotdogSold;
    }

    /**
     * <p>
     * Prints a HotDogStand Objects ID and hotdogSold.
     * <p>
     * 
     * Precondition: A named HotDogStand Object Exists. <br />
     * Postcondition: A HotDogStand Objects ID and hotdogSold. are returned.
     * 
     * @return the ID and hotdogSold of a HotDogStand Object
     * 
     */
    public String toString() {
        return ("Stand ID: " + id + " and " + "Hotdogs sold: " + hotdogSold);    
    }

    /**
     * <p>
     * Increases the running total of all hotdogs sold by all hotdog stands.
     * </p>
     * 
     * <p>
     * Precondition: Two named HotDogStand Object Exists <br />
     * Postcondition: none
     * </p>
     * 
     * @param anotherRobot A different HotDogStand object's hotdogSold
     * 
     */
    public static void totalSold(int hotdogSold) {
        totalSold = totalSold + hotdogSold;
    }
    
    /**
     * <p>
     * Gets total of all hotdogs sold by all hotdog stands number.
     * <p>
     * 
     * Precondition: None. <br />
     * Postcondition: A HotDogStand Objects number of hotdogSold is returned.
     * 
     * @return the total of all hotdogs sold by all hotdog stands number.
     * 
     */
    public static int getTotalSold() {
        return totalSold;
    }

}
