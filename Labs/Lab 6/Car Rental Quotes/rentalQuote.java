import java.util.Scanner;

/**
 * rentalQuote.java: determines the total price to rent a car on a weekly or weekly plus daily basis.
 * 
 *<p>
 *<b>Problem Statment</b>: <br /> The user wants to determine the best possiable rate to rent a car for.
 *                   They have a few choices. The cars color either black or white.
 *                   The type of car: Full-Size or Economy. Full-Size and Economy have two rates:
 *                   Daily or Weekly. The cars color does not affect these rates. The program should
 *                   compare Weekly rates to Weekly plus Daily rates depending on the amout of days the
 *                   user wants to rent the car for. (EX: 13 days = 1week + 6days VS 2weeks. Which would
 *                   be the cheaper rate?).
 *</p>
 *<b>Algorithm:</b>
 *<ol>
 *     <li>Economy has two Constant Rates: 25.50/day & 120.50/week</li>
 *     <li>Full-size has two Constant Rates: 39.40/day & 216.25/week</li>
 *     <li>The program should calculate two rates:</li>
 *  <ul> 
 *       <li>Number of complete weeks multiplied by the weekly rate
 *           plus the number of leftover days times the daily rate.</li>
 *       <li>Number of complete weeks plus 1, and that number multiplied by the weekly rate.</li>
 *  </ul>
 *     <li>Ask the user for Car Color, Car Type (Full-Size or Economy)</li>
 *         and the amount of days they want to rent the car for.</li>
 *     <li>Make sure the user can input either: (Full size or full size) and (Economy or economy)</li>
 *         when asked for car size/type.
 *     <li>Compare the two calculations and determine which is the cheaper/best price</li>
 *         Neatly print out and tell the user what thier best rate.
 *</ol>  
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 6, Lab
 */
public class rentalQuote
{
    public static void main(String [] args) {
        //Constants
        final double ECON_DAILY_RATE = 25.50;
        final double ECON_WEEKLY_RATE = 120.50;
        final double FULLSIZE_DAILY_RATE = 39.40;
        final double FULLSIZE_WEEKLY_RATE = 216.25;

        //Instance Variables
        String carSize = " ";
        String carColor = " ";
        int days = 0;
        double weeklyDailyTotal = 0.0;
        double weeklyOnlyTotal = 0.0;
        int leftOver = 0;
        int numWeeks = 0;

        //Creates new scanner object to take user input for car size, color, and days renting
        Scanner userInput = new Scanner(System.in);
        System.out.println("Full Size or Economy?");
        carSize = userInput.nextLine();
        System.out.println("White, Black or Red for car color?.");
        System.out.println("RED CARS HAVE A SUBCHARGE OF %15 FROM REGULAR RATES");
        carColor = userInput.nextLine();
        System.out.println("How long will the rental be? Please awnser in whole number of days.");
        days = userInput.nextInt();
        
        //lower cases users input for the switch statments
        carSize = carSize.toLowerCase();
        carColor = carColor.toLowerCase();
        
        //Switch statement used so the user can type either
        //full size or economy
        switch (carSize) {
            case "full size":
                //calculations to determine the number of weeks and days left over
                numWeeks = days / 7;
                leftOver = days % 7;
                
                //Calculations to determine the weekly + left over days cost
                //vs adding another weeks cost
                //checks if car color is red to  apply 15% subcharge
                
                if (carColor.equals("red")) {
                    weeklyDailyTotal = (numWeeks * FULLSIZE_WEEKLY_RATE) + (leftOver * FULLSIZE_DAILY_RATE)
                                       + ((numWeeks * FULLSIZE_WEEKLY_RATE) + (leftOver * FULLSIZE_DAILY_RATE)) * 0.15;
                    weeklyOnlyTotal = (((numWeeks + 1) * FULLSIZE_WEEKLY_RATE)) + ((((numWeeks + 1) * FULLSIZE_WEEKLY_RATE)) * 0.15);
                }
                else if (carColor.equals("black") || carColor.equals("white")) {
                    weeklyDailyTotal = (numWeeks * FULLSIZE_WEEKLY_RATE) + (leftOver * FULLSIZE_DAILY_RATE);
                    weeklyOnlyTotal = ((numWeeks + 1) * FULLSIZE_WEEKLY_RATE);
                }
                
                //If statment to tell the user which car rental quote is cheaper
                if (weeklyDailyTotal <= weeklyOnlyTotal) {
                    System.out.println("Quote for a " + carColor.toLowerCase() +" full sized car for "+ days + " days: \n" + 
                                       leftOver + (leftOver > 1 ? " days at " : " day at ") + FULLSIZE_DAILY_RATE + "/day"
                                       + " and " + (numWeeks) + (numWeeks > 1 ? " weeks at " : " week at ") + FULLSIZE_WEEKLY_RATE + "/wk "
                                       + ", total " + weeklyDailyTotal);
                }
                else if (weeklyDailyTotal >= weeklyOnlyTotal) {
                    System.out.println("Quote for a " + carColor.toLowerCase() +" full sized car for "+ days + " days: \n" + 
                                       (numWeeks + 1) + (numWeeks > 1 ? " weeks at " : " week at ") + FULLSIZE_WEEKLY_RATE + "/wk "
                                       + ", total " + weeklyOnlyTotal);
                }
                break;
            case "economy":
                //calculations to determine the number of weeks and days left over
                numWeeks = days / 7;
                leftOver = days % 7;
    
                //Calculations to determine the weekly + left over days cost
                //vs adding another weeks cost
                //checks if car color is red to  apply 15% subcharge
                
                if (carColor.equals("red")) {
                    weeklyDailyTotal = (numWeeks * ECON_WEEKLY_RATE) + (leftOver * ECON_DAILY_RATE)
                                       + ((numWeeks * ECON_WEEKLY_RATE) + (leftOver * ECON_DAILY_RATE)) * 0.15;
                    weeklyOnlyTotal = (((numWeeks + 1) * ECON_WEEKLY_RATE)) + ((((numWeeks + 1) * ECON_WEEKLY_RATE)) * 0.15);
                }
                else if (carColor.equals("black") || carColor.equals("white"))  {
                    weeklyDailyTotal = (numWeeks * ECON_WEEKLY_RATE) + (leftOver * ECON_DAILY_RATE);
                    weeklyOnlyTotal = ((numWeeks + 1) * ECON_WEEKLY_RATE);
                }
                
                //If statment to tell the user which car rental quote is cheaper
                if (weeklyDailyTotal <= weeklyOnlyTotal) {
                    System.out.println("Quote for a " + carColor.toLowerCase() +" full sized car for "+ days + " days: \n" + 
                                       leftOver + (leftOver > 1 ? " days at " : " day at ") + ECON_DAILY_RATE + "/day"
                                       + " and " + (numWeeks) + (numWeeks > 1 ? " weeks at " : " week at ") + FULLSIZE_WEEKLY_RATE + "/wk "
                                       +", total " + weeklyDailyTotal);
                }
                else if (weeklyDailyTotal >= weeklyOnlyTotal) {
                    System.out.println("Quote for a " + carColor.toLowerCase() +" full sized car for "+ days + " days: \n" + 
                                       (numWeeks + 1) + (numWeeks > 1 ? " weeks at " : " week at ") + ECON_WEEKLY_RATE + "/wk "
                                       + ", total " + weeklyOnlyTotal);
                }
                break;
            default:
                System.out.println("Please try again. Thank you.");
                System.out.println("Check your spelling and make sure amount of days isn't negitive.");
        }

    }
}