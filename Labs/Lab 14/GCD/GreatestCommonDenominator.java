import java.util.Scanner;

/**
 * GreatestCommonDenominator.java: Find the GreatestCommonDenominator of two integers.
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 14, Lab Project #2
 */
public class GreatestCommonDenominator {

  public static void main(String[] args) {
    //Creates Scanner to take user input
    Scanner sc = new Scanner(System.in);

    while (true) {
      //Tells user how to exit.
      System.out.println("Enter 0 as your first number to exit.");
      //Asks user to thier first numbers
      System.out.printf("Enter your first number : ");
      int num1 = sc.nextInt();
      //Exits program if user enters 0
      if (num1 == 0) {
        break;
      }
      //Asks user for thier second number
      System.out.printf("Enter your second number: ");
      int num2 = sc.nextInt();

      System.out.println("G.C.D. using the recursive method: " + recursiveGCD(num1, num2));
      System.out.println("G.C.D. using the iterative method: " + iterativeGCD(num1, num2));
      System.out.println();

    }
  }
  /**
   * A recursive method using Euclidean's algo. to find GreatestCommonDenominator
   * @param  num1 an integer number
   * @param  num2 an integer number
   * @return      [returns the GreatestCommonDenominator of two integer numbers
   */
  public static int recursiveGCD(int num1, int num2) {
    //remainder equals the modulo num1 and num2
    int remainder = num1 % num2;
    //if remainder equals 0 then return num2
    if (remainder == 0) {
      return num2;
    }
    //Sets new num1 and num2 according to Euclidean's Algorithm.
    num1 = num2;
    num2 = remainder;
    //returns the method untill a GCD is found.
    return recursiveGCD(num1, num2);
 }

 /**
  * An iterative method using Euclidean's algo. to find GreatestCommonDenominator
  * @param  num1 an integer number
  * @param  num2 an integer number
  * @return      [returns the GreatestCommonDenominator of two integer numbers
  */
 public static int iterativeGCD(int num1, int num2) {
   //Loops untill a GCD is found
   while (true) {
     //remainder equals the modulo num1 and num2
     int remainder = num1 % num2;
     //if remainder equals 0 then return num2
     if (remainder == 0) {
       return num2;
     }
     //Sets new num1 and num2 according to Euclidean's Algorithm.
     num1 = num2;
     num2 = remainder;
   }
 }
}
