import java.util.Scanner;

/**
 * Payoff.java: Determines when or if a loan will be payed off.
 * <p>
 * <b>Problem Statement</b>:<br /> Write a program which uses a recursive method to determine and display
 *                                 the number of months required to pay off a mortgage or loan (when the
 *                                 new outstanding balance goes to 0.00) and the total interest paid over
 *                                 the life of the mortgage or loan.
 * </p>
 * <p>
 * <b>Algorithm</b>:
 *    <ol>
 *        <li> Create a loan class that will hold the original amount, annual interest rate and monthly payment. </li>
 *        <li> The loan will gain monthly intrest based on the annual at the beggining of the month. </li>
 *        <li> The loan monthly payment will be payed off at the end of the month. </li>
 *        <li> Calculate the new monthly total using monthly intrest and monthly payment. </li>
 *        <li> Ask the user for the starting loan amount, annual interest rate, and month payment. </li>
 *        <li> Create a new loan object using the variables mentioned above. </li>
 *        <li> Write a recursive method to determine the number of months when it will take to paid off the loan. </li>
 *        <li> The recursive method should take three peramaters. Loan amount, annual interest rate, and month payment.</li>
 *        <li> The recursive method should check for an overpayment and tell the user if this case occured. </li>
 *        <li> Also check for a "negative amortization", the recursive should show the interest and the monthly payment
 *             for the first month, then stop. </li>
 *        <li> Next print the number of months to pay off the loan, if there was an overpayment and if a "negative
 *             amortization" occured </li>
 *        <li> Finally Loop the program untill the user enters a sentinel to exit. </li>
 *    </ol>
 * </p>
 * @author Adolfo Sanpedro Gante
 * @version Module 14, Homework #2
 */

public class Payoff {
  public static void main(String[] args) {
    //Instance Variables
    Loans loan;

    //Loops untill user chooses to exit.
    while (true) {
      //Asks user for Loan amount, annual interest rate, and month payment.
      Scanner userInput = new Scanner(System.in);
      System.out.println("Enter a negative number as the inital loan amount to exit.");
      System.out.printf("Enter the inital loan amount: ");
      double loanAmount = userInput.nextDouble();
      //breaks out of the loop.
      if (loanAmount < 0) {
        break;
      }
      System.out.printf("Enter the annual interest rate as a percentage: ");
      double interestRate = userInput.nextDouble();
      System.out.printf("Enter the monthly payment amount: ");
      double monthlyPayment = userInput.nextDouble();

      //Creates a loan object using userInput
      loan = new Loans(loanAmount, interestRate, monthlyPayment);

      //Recursive method
      System.out.println(freedomIn(loan.getLoanAmount(), loan.getIntrestRate(), loan.getMonthlyPayment(), 0));
      System.out.println();
    }
  }
  /**
   * A recursive method that determines and displays the number of months required to pay off a mortgage or loan
   * @param  loanAmount     The initial loan amount
   * @param  interestRate   The annual intrest rate
   * @param  monthlyPayment The monthly payment
   * @param  count          A counter used to keep track of number of months through every call.
   * @return                the number of months required to pay off a loan (and refund or negative amortization.)
   */
  public static String freedomIn (double loanAmount, double interestRate, double monthlyPayment, int count) {
    //Calcs the monthly interest rate
    double monthlyRate = (interestRate / 100.0) / 12.0;
    //Saves the inital loan amount to test against new loan amount
    double startLoanAmount = loanAmount;
    //calcs the new loan amount
    loanAmount = (loanAmount + (loanAmount * monthlyRate)) - monthlyPayment;

    //Negative Amortization Case
    if (loanAmount > startLoanAmount) {
      return ("Interest: " + interestRate +"%, Payment: " + Math.round(monthlyPayment) + ", Negative Amortization!!!!!!!!");
    }
    //No refund case
    if (loanAmount == 0.0) {
      return ("It will take " + count + " months.");
    }
    //case with a refund
    if (loanAmount < 0.0) {
      return ("It will take " + count + " months and you have a refund of $" + (-1 * Math.round(loanAmount)));
    }
    //updates count and loops recursive method untill the number of months is determined.
    count++;
    return freedomIn(loanAmount, interestRate, monthlyPayment, count);

  }
}
