import java.util.Scanner;

/**
 * IsPalindrome.java: Tests if a string is a palindrome using recursive and iterative methods.
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 14, Lab Project #1
 */

public class IsPalindrome {

  public static void main(String[] args) {
    //Creates scanner to take user input.
    Scanner sc = new Scanner (System.in);

    //Loops untill user enters sentinel
    while (true) {
      System.out.printf("Enter a line of text: ");
      String userInput = sc.nextLine();

      //Exits the loop is user enters Exit or exit.
      if (userInput.toLowerCase().equals("exit")) {
        break;
      }

      //Calls the recursive methods to check if user input is a palindrome.
      //Calls the iterative methods to check if user input is a palindrome.
      System.out.println("Your input is: " + recursivePalindrome(userInput) + " using the recursive method.");
      System.out.println("Your input is: " + iterativePalindrome(userInput) + " using the iterative method.");
    }
  }

  /**
   * A recursive method to determine if a string is a palindrome.
   * @param  aString A Line of text.
   * @return         returns true or false if a string is(n't) a palindrome.
   */
  public static boolean recursivePalindrome(String aString) {
    //formats the string by removing punctuation,blanks and lowerCases the string.
    aString = aString.toLowerCase();
    aString = aString.replaceAll("\\s+", "");
    aString = aString.replaceAll("\\W", "");

    //If the string is less than to then obvi. it is a palindrome.
    if (aString.length() < 2) {
      return true;
    }
    //if the string start and end char then obvi. not a palindrome.
    else if (aString.charAt(0) != aString.charAt(aString.length() - 1)) {
      return false;
    }
    //Calls the method untill it determines if the string is a palindrome.
    aString = aString.substring(1, aString.length() - 1);
    return recursivePalindrome(aString);
  }

  /**
   * An iterative method to determine if a string is a palindrome.
   * @param  aString A Line of text.
   * @return         returns true or false if a string is(n't) a palindrome.
   */
  public static boolean iterativePalindrome(String aString) {
    //formats the string by removing punctuation,blanks and lowerCases the string.
    aString = aString.toLowerCase();
    aString = aString.replaceAll("\\s+", "");
    aString = aString.replaceAll("\\W", "");

    //If the string is less than to then obvi. it is a palindrome.
    if (aString.length() < 2) {
      return true;
    }

    for (int i = 0; i < aString.length(); i++) {
      if (aString.charAt(i) != aString.charAt(aString.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }

}
