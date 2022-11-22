import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * GradeSummary.java: program to read from the user a list of exam scores
 * <p>                   
 * <b>Problem Statement</b>:<br /> Write a program to read from the user a list of exam scores (integer 
 *                    percentages in the range 0 to 100) and to output: the total number of
 *                    grades entered, the number of grades in each letter-grade category, 
 *                    the percentage of the total grades each letter grade represents
 * </p>                   
 * <b>Algorithm</b>: 
 *    <ol>            
 *        <li> Ask user for grade input. </li>
 *        <li> Determine which grade catagory the inputed grade goes into. </li>
 *        <li> Save each grade input into their respective catagory. </li>
 *        <li> If the user enteres a negitive number exit the loop. </li>
 *        <li> Go back to step 1 (loop the program). </li>
 *        <li> If program is exited print the number and percentage of
 *        <li> each grade in each grade catagory. </li>
 *    </ol>
 * </p>
 * @author Adolfo Sanpedro
 * @version Homework, Module 7
 */
public class GradeSummary
{
    public static void main (String [] args) {
        //Instance Variables
        double totalGrades = 1;
        double numA = 0;
        double numB = 0;
        double numC = 0;
        double numD = 0;
        double numF = 0;

        //Scanner Object for user input
        Scanner sc = new Scanner(System.in);
        double userInput = 0;

        //Asks user to input grades and to enter a negitive number to exit program
        System.out.println("********** Grade Counter **********");
        System.out.println("Enter each grade on a separate line");
        System.out.println("(A negative grade will end entry)");

        //Loops program untill user enters a negitive number
        while(true) {
            System.out.print("Enter grade #" + (int) totalGrades + ": ");
            userInput = sc.nextInt();
            if (userInput < 0) {
                System.out.println("Printing Totals:");
                break;
            }
            //Determines which letter grade each number grade goes into
            //add one when its determined
            else if (userInput >= 90) {
                numA++;
                totalGrades++;
            }
            else if (userInput <= 89 & userInput >= 80) {
                numB++;
                totalGrades++;
            }
            else if (userInput <= 79 & userInput >= 70) {
                numC++;
                totalGrades++;
            }
            else if (userInput <= 69 & userInput >= 60) {
                numD++;
                totalGrades++;
            }
            else if (userInput <= 59 & userInput >= 0) {
                numF++;
                totalGrades++;
            }
        }
        
        //Subtracts 1 from total grades because last grade "-1" is not valid
        totalGrades--;

        //Decimal Format object to format grade percentages
        DecimalFormat df = new DecimalFormat("0.#");
        
        //If no grades are entered, no grades are possible to print
        if (totalGrades == 0) {
            System.out.println("No Grades are possible.");
        } 
        //Prints total grades, amount of each grade and percentage based on total grades
        else {
            System.out.println("Total number of grades = " + (int) totalGrades);
            System.out.println("Number of A's = " + (int) numA + " which is " + df.format(numA * 100 / totalGrades) + "%");
            System.out.println("Number of B's = " + (int) numB + " which is " + df.format(numB * 100 / totalGrades) + "%");
            System.out.println("Number of C's = " + (int) numC + " which is " + df.format(numC * 100 / totalGrades) + "%");
            System.out.println("Number of D's = " + (int) numD + " which is " + df.format(numD * 100 / totalGrades) + "%");
            System.out.println("Number of F's = " + (int) numF + " which is " + df.format(numF * 100 / totalGrades) + "%");
        }
    }
}
