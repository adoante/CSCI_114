import java.util.Scanner;

/**
 * MultiplyBy9.java: calculates the first nine multiples of 9
 *
 * @author Adolfo Sanpedro Gante
 * @version Lab, Module 7
 */
public class MultiplyBy9
{
    static public void main(String []args) {
        //Instace Variables
        int num = 0;
        int firstDigit = 0;
        int secondDigit = 0;

        //Creates new Scanner Object for user input
        Scanner userInput = new Scanner(System.in);

        //Loops program untill user inputs a -1
        while(true) {
            //Asks user for an integer from 0 to 9
            System.out.println("Enter a number from 0 to 9. Your number: ");
            System.out.print("Your number: ");
            num = userInput.nextInt();

            //Exits program
            if (num == -1) {
                System.out.println("Exiting Program.");
                System.exit(0);
            }
            //Checks if number is not within range
            else if (num > 9){
                System.out.println("Your number is to large.");
            }
            else if (num < -1) {
                System.out.println("Your number is to small.");
            }
            //Input 0 would break program so special if statement for that input
            else if (num == 0) {
                System.out.println(num + " times 9 equals 0");
            }
            else {
                //Determines first digit
                firstDigit = num - 1;
                //Determines second digit
                secondDigit = 9 - firstDigit;
                //Prints out answer
                System.out.println(num + " times 9 equals " + String.valueOf(firstDigit)
                                    + String.valueOf(secondDigit));
            }
        }
    }
}
