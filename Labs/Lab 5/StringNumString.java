
/**
 * StringNumString.java - Converts a string with numbers to type int with some calculations
 * Author:     Adolfo Sanpedro Gante
 * Module:     5
 * Project:    Lab
 * Problem Statement:  Read a String from the user which contains two characters, both digits (0 - 9)
 *                     then convert each digit in the String to a separate number, stored as an int.
 *                     Next print the two numbers, their sum, and their product on the console.
 *                     Finally add one to the first number, then consolidate the two numbers back
 *                     into a single number and prints on the console
 *                     
 * Algorithm:
 *   1.  Determine and print the ASCII / Unicode value of the character ‘0’ (zero)
 *       and store in a named constant of type int
 *       
 *   2.  Create a Scanner object which reads from the system console, prompts the user for a 2-digit number,
 *       then reads the response into a String variable using the nextLine() method for the Scanner object.
 *       
 *   3.  Calculate the equivalent numeric value of the first digit in the String and store in an int.
 *   
 *   4.  Calculate the numeric value of the second digit and store in an int
 *   
 *   5.  Print a message on the console telling the user what the first and second digits of the number
 *       are using the int’s calculated in steps 3 and 4 above.
 *       
 *   6.  Print a message on the console showing the user the sum of the first and second digits.
 *   
 *   7.  Print a message on the console showing the user the product of the first and second digits.
 *   
 *   8.  Increment the int holding the value of the first digit by 1 (use the  ++  operator).
 *   
 *   9.  Create a new int variable, then assign it a value by multiplying the first digit 
 *       (from step #8 above) by 10, then adding the second digit.
 *       
 *   10. Print a message telling the user the value of the new number from step #9, and notice that it’s
 *       the first number they entered plus 10.
 */

import java.util.Scanner;

public class StringNumString
{
    public static final int ZERO = '0';
    
    public static void main(String [] args) {
        System.out.println("The value of charater '0' converted to an int is " + ZERO);
        //Creates Scanner object that takes a string input
        Scanner sc = new Scanner(System.in);
        
        //asks user for input
        System.out.print("Input a 2-digit number. For numbers less than 10," +
                         "\nthe user should place a 0 in front of the number.\n");
        System.out.print("Your number: ");
        
        //creates new string varible and takes input from the user
        String userInput = sc.nextLine();
        
        //converts the char ASCII / UNIcode values to int
        int firstDigit = (int) userInput.charAt(0) - ZERO;
        int secondDigit = (int) userInput.charAt(1) - ZERO;
        
        //prints the first and second digit
        System.out.println("The first digit is " + firstDigit + " and the second digit is " + secondDigit);
        //prints the sum of the two digits
        System.out.println("The sum of the two digits is: " + (firstDigit + secondDigit));
        //prints the product of the two digits
        System.out.println("The product of the two digits is: " + (firstDigit * secondDigit));
        //increments the firstDigit 
        firstDigit++;
        //prints the incremented firstDigit
        System.out.println("The first digit plus 1 is: " + firstDigit);
        
        //takes the incremented firstDigit and multiplies by 10 and then adds secondDigit
        int x = (firstDigit * 10) + secondDigit;
        System.out.println("10 added your first digit is: " + x);
    }
}
