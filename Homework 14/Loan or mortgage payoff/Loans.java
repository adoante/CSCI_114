/**
 * Loans.java: Creates loans with an initial amount, annual interest rate, and monthly payment.
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 14, Homework #2
 */

public class Loans {
  //Instance variables
  private double startLoanAmount = 0;              //The initial loan amount
  private double annualIntrestRate = 0.0;       //The annual intrest rate
  private double monthlyPayment = 0;                 //The monthly payment

  /**
   * Full arg constructor that creates a loan
   * @param startLoanAmount   The initial loan amount
   * @param annualIntrestRate The annual intrest rate
   * @param monthlyPayment    The monthly payment
   */
  public Loans (double startLoanAmount, double annualIntrestRate, double monthlyPayment) {
    this.startLoanAmount = startLoanAmount;
    this.annualIntrestRate = annualIntrestRate;
    this.monthlyPayment = monthlyPayment;
  }
  /**
   * No arg constructor.
   */
  public Loans() {

  }
  /**
   * Sets the initial loan ammount
   * @param startLoanAmount an amount of money
   */
  public void setLoanAmount(double startLoanAmount) {
    this.startLoanAmount = startLoanAmount;
  }
  /**
   * Sets the annual intrest rate for a loan
   * @param annualIntrestRate The annual interest rate as a percentage
   */
  public void setIntrestRate(double annualIntrestRate) {
    this.annualIntrestRate = annualIntrestRate;
  }
  /**
   * Sets the monethly payment on a loan
   * @param monthlyPayment the monthly payment
   */
  public void setMonthlyPayment(double monthlyPayment) {
    this.monthlyPayment = monthlyPayment;
  }
  /**
   * Gets the initial loan amount
   * @return the loan amount
   */
  public double getLoanAmount() {
    return this.startLoanAmount;
  }
  /**
   * Gets the annual interest rate of a loan
   * @return the interest rate
   */
  public double getIntrestRate() {
    return this.annualIntrestRate;
  }
  /**
   * Gets the monethly payment of a loan
   * @return the monthly payment
   */
  public double getMonthlyPayment() {
    return this.monthlyPayment;
  }
  /**
   * Prints the loan amount, interest rate and the monthly payment.
   * @return loan amount, interest rate and the monthly payment.
   */
  public String toString() {
    return ("Amount: " + getLoanAmount() + ", Rate: " + getIntrestRate() + ", Payment: " + getMonthlyPayment());
  }
}
