import java.util.Scanner;

/**
 * AirlineSeatReservations.java: Assign passenger's seats in a small airplane.
 * 
 * <p>
 * <b>Problem Statement</b>: <br /> Write a program to assign passenger's seats in a small airplane.
 *                                  Assume the plane has its seats in 7 rows with 4 seats in each row
 *                                  (A, B, C, or D).
 * </p>
 *                                  
 * <b>Algorithm</b>:
 *    <ol>
 *        <li> Prompt the user to enter a row and column input (ex. 1A). </li>
 *        
 *        <li> Verify that the user enters rows between 1 and 7 only, and columns A, B, C, or D only.  </li>
 *        
 *        <li> If the user enters an entry that is invalid, print an error message telling them what's
 *             wrong, then prompt for the next entry. </li>
 *             
 *        <li> Model the seats in the plane using a multi-dimensional array with seven rows and four columns. </li>
 *        
 *        <li> Use a loop in your program which continues to prompt for a seat to reserve until either the user
 *             specifies a sentinel to stop the program, or when all seats are reserved. </li>
 *             
 *        <li> After each entry from the user, the program should display the seat reservation pattern,
 *             with an 'X' marking the seats already assigned. </li>
 *             
 *        <li> This continues until either all seats are filled or the user enters a sentinel indicating
 *             that they are done entering reservations. </li> 
 *             
 *        <li> If the user tries to reserve a seat which is already taken, the program should say that
 *             seat is occupied and ask for another choice. </li> 
 *        
 *    </ol>
 *
 * @author Adolfo Sanepdro Gante
 * @version Homework, Module 8
 */
public class AirlineSeatReservations
{
    public static void main(String [] args) {
        //Constant
        final String SENTINEL = "9999";

        //Instance Variables
        int seatsLeft = 28;

        //Creates a multi-dimensional array with 7 rows and 4 columns
        char seats[][] = new char[][]
            {
                {'A','B','C','D'},
                {'A','B','C','D'},
                {'A','B','C','D'},
                {'A','B','C','D'},
                {'A','B','C','D'},
                {'A','B','C','D'},
                {'A','B','C','D'},
            };

        //Creates Scanner obj. for user input
        Scanner sc = new Scanner(System.in);
        String userInput = " ";

        //Promtes user to enter seat numbers
        //exits loop when sentinel value is given or when all seats are taken.
        System.out.println("Enter 9999 to exit program.");
        System.out.print("Please enter a seat reservation number: ");
        while (true) {
            userInput = sc.nextLine();
            if (userInput.equals(SENTINEL) || seatsLeft == 0) {
                break;
            }
            else if (( userInput.charAt(0) < '1' || userInput.charAt(0) > '7')) {
                System.out.println("** Please enter a row number from 1 to 7. **");
            }
            else if (( userInput.charAt(1) < 'A' || userInput.charAt(1) > 'D')) {
                System.out.println("** Please enter a seat letter from A to D. **");
            }
            else {
                if (seats[userInput.charAt(0) - 49][userInput.charAt(1) - 65] == 'X') {
                    System.out.println("You have already picked this seat. Please choose another.");
                }
                else {
                    seats[userInput.charAt(0) - 49][userInput.charAt(1) - 65] = 'X';
                    seatsLeft--;
                }
            }

            //Prints the multi-dimensional array neatly in a grid
            for (int i = 0; i < seats.length; i++) {
                System.out.print(i+1 + " ");
                for (int j = 0; j < seats[0].length; j ++) {
                    System.out.print(seats[i][j] + " ");
                }
                System.out.println();
            }

            System.out.print("Please enter a seat reservation number: ");
        }
        
        //Prints the remaining seats
        System.out.println("There are " + seatsLeft + " seats available.");
    }
}
