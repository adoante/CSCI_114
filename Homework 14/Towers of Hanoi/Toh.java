import java.util.Scanner;

 /**
  * Toh.java: Solves the Towers of Hanoi problem using multiple recursive methods.
  * <p>
  * <b>Problem Statement</b>:<br /> Using multiple recursion solve the Towers of Hanoi Problem.
  * </p>
  * <p>
  * <b>Algorithm</b>:
  *    <ol>
  *        <li> Create a scanner to recive user input at an integer. </li>
  *        <li> Ask user for a non-negitive whole number. </li>
  *        <li> Create a loop that breaks when a negitive number is entered. </li>
  *        <li> Create a recursive method to solve Toh using the following pseudocode. </li>
  *        <li> Invoke the method specifying these 4 parameters for this level of recursion. </li>
  *        <li> n (the number of disks to move) </li>
  *        <li> the from peg </li>
  *        <li> the to peg </li>
  *        <li> an intermediate peg as necessary </li>
  *        <li> Base case: if n = 0, then just return (do nothing) </li>
  *        <li> Recursive case: </li>
  *        <li> Step 1: invoke method again (a new level of recursion) using these parameters in order:  </li>
  *        <li> n – 1 (the number of disks to move) </li>
  *        <li> from the current from peg </li>
  *        <li> to the current intermediate peg </li>
  *        <li> using the current to peg as the temporary peg </li>
  *        <li> Step 2: move the nth peg from the current from peg to the current to peg </li>
  *        <li> Step 3: invoke method again (a new level) using these parameters in order:  </li>
  *        <li> n – 1 (the number of disks to move) </li>
  *        <li> from the current intermediate peg </li>
  *    </ol>
  * </p>
  * @author Adolfo Sanpedro Gante
  * @version Module 14, Homework #3
  */

public class Toh {
  //Static variable to keep track of number of "moves".
  public static int moves = 0;

  public static void main(String[] args) {
    //Creates scanner for user input
    Scanner sc = new Scanner(System.in);

    //Loops untill user chooses to exit
    while(true) {
      System.out.println("Enter negitive number to exit the program.");
      System.out.printf("Enter a number of disks: ");
      int userInput = sc.nextInt();

      //Exits Loop
      if (userInput < 0) {
        break;
      }
      //Prints the moves needed to solve Towers of Hanoi with a specified number of disks
      solveToh(userInput, 'A', 'B', 'C');
      //Prints the number of moves needed to solve ToH
      System.out.println("Total moves: " + moves);
      System.out.println();
      //Resets moves counter for next number of disks.
      moves = 0;
    }
  }
  /**
   * Solves the Towers of Hanoi problem using multiple recursion.
   * @param n The number of disks.
   * @param a The current peg.
   * @param b The intermediate peg.
   * @param c The final peg.
   */
  public static void solveToh(int n, char a, char b, char c) {
    //If n == 0 then there no solution needed.
    if (n > 0) {
      //Moves n - 1 disks on A to B using C
      solveToh(n - 1, a, c, b);
      System.out.println("Move Disk from " + a + " to " + c +".");
      //Moves n - 1 disks on B to C using A
      solveToh(n - 1, b, a, c);
      //Updates the moves counter.
      moves++;
  }
 }
}
