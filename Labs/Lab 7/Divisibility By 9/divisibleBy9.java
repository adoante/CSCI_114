import java.util.Scanner;

/**
 * divisibleBy9.java: determines if a number is evenly divisible by 9.
 *
 * @author Adolfo Sanpedro Gante
 * @version Lab, Module 7
 */
public class divisibleBy9
{
    public static final int ZERO = '0';

    public static void main(String [] args) {
        //Instance Variables
        long num = 0;
        int sum = 0;
        String numToString = " ";
        
        //Creates scanne object for user input
        Scanner sc = new Scanner(System.in);

        while (true) {
            //Prompt the user for a whole number and read the user’s input into a  long  variable.
            System.out.print("Enter a whole number: ");
            num = sc.nextLong();
            
            //Convert the number to a  String
            numToString = String.valueOf(num);
            
            //Calculate the sum of the digits in the number by looping through each character
            //(each digit) in the  String,  converting it to a number, and adding it to the sum.
            for (int i = 0; i < numToString.length(); i++){
                sum = sum + (numToString.charAt(i) - ZERO);
            }
            
            //If the sum of the digits is 0, then exit the program
            if (sum == 0) {
                System.out.println("Exiting program.");
                System.exit(0);
            }
            
            //Determines if the sum of the digits in the number is evenly divisible by 9.
            sum = sum % 9;
            
            //print a message to the user indicating whether or not the original number is divisible by 9.
            System.out.println(sum == 0 ? num + " is evenly divisible by 9" : num 
                + " is not evenly divisible by 9");

            //Resets sum as to not to interfere with step 3                                    
            sum = 0;
        } 
    }
}
