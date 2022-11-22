import java.util.Scanner;
import java.util.ArrayList;
/**
 * DecimalToBinary.java: Converts a decimal number into its equivilant binary number.
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 14, Lab Project #3
 */

public class DecimalToBinary {
  public static void main(String[] args) {
    //Creats scanner for user input
    Scanner sc = new Scanner(System.in);

    //Loops untill user enters the sentiel
    while(true) {
      System.out.println("Enter a negitive number to exit.");
      System.out.printf("Enter a whole number in decimal format: ");
      int userInput = sc.nextInt();

      //Breaks out of the loop.
      if (userInput < 0) {
        break;
      }

      System.out.println("Your number in binary using recursive method: " + recursiveConverter(userInput));
      System.out.println("Your number in binary using iterative method: " + iterativeConverter(userInput));
      System.out.println();
    }
  }

  /**
   * A recursive method to convert a whole number to binary.
   * @param  num1 A non-negitive whole number
   * @return      an equivilant binary number
   */
  public static String recursiveConverter(int num1) {
    //First 1 or 0 of the binary number.
    int num2 = num1 % 2;
    //Next number to be divided
    num1 = num1 / 2;
    //Creates a string to store the binary number
    String convertedNum = String.valueOf(num2);
    //if num2 equals 0 then return the binary single digit
    if (num1 == 0) {
      return convertedNum;
    }
    //return the found binary number and loop recursive method untill num1 equals 0
    return recursiveConverter(num1) + convertedNum;
  }

  public static String iterativeConverter(int num1) {
    ArrayList<String> binary = new ArrayList<String>();
    String convertedNum = "";
    //Loops untill an equal binary number is found
    do {
      //First 1 or 0 of the binary number.
      int num2 = num1 % 2;
      //Next number to be divided
      num1 = num1 / 2;
      //Stores found binary digit into ArrayList
      binary.add(0, String.valueOf(num2));
      //Concats the found binary digit with other digits
      convertedNum = binary.get(0) + convertedNum;
    }
    while (num1 > 0);
    //Prints the num cnverted into binary
    return convertedNum;
  }
}
