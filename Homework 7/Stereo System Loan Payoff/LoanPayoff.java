import java.text.DecimalFormat;

/**
 * LoanPayoff.java: pays off the intrest and cost of a stereo system
 * <p>
 * <b>Problem Statement</b>:<br /> You have just purchased a stereo system that cost $1,000
 *                    on credit plan. The credit plan has interest and a monthly
 *                    payment of $50. Create a program to pay off the intrest and cost
 *                    of the stero system and tell the user of long it will take plus
 *                    the amount of intrest paid.
 * </p>
 * 
 * <b>Algorithm</b>:
 *    <ol>
 *        <li> Create constants for the initial loan amount ($1,000),annual interest
 *             rate (18%), and payment amount ($50). </li>
 *        <li> Use a loop to calculate the amount of interest and the size of
 *             the debt after each month.  </li>
 *        <li> Use a variable to count the number of loop iterations (the number
 *             of months) until the debt is zero. </li>
 *        <li> Use a variable to total the amount of intrest paid over the life of the loan. </li>
 *        <li> When the inital cost reached zero exit the loop. </li>
 *        <li> Print how many months it will take you to pay off the loan and 
 *             the total amount of interest paid over the life of the loan. </li> 
 *    </ol>
 *
 * @author Adolfo Sanpedro Gante
 * @version Homework, Module 7
 */
public class LoanPayoff
{
    public static void main (String [] args) {
        //Constants
        final double INITIAL_LOAN_AMOUNT = 1000.0;
        final double MONTHLY_INTEREST_RATE = 0.015;
        final double PAYMENT_AMOUNT = 50.0;
        
        //Instace Variables
        double newBalanceDue = INITIAL_LOAN_AMOUNT;
        double interestDue = 0.0;
        double moneyAfterInterest = 0.0;
        double totalInterestPaid = 0.0;
        int months = 0;
        
        //Decimal Format to print money amount to two decimal points
        DecimalFormat df = new DecimalFormat("0.##");
        
        //Loops until the loan is paid off (reaches 0)
        while (newBalanceDue > 0){
            //Calculates the amount of intrest to pay
            interestDue = (newBalanceDue * MONTHLY_INTEREST_RATE);
            
            //Calculates the amount of money left over after interestDue
            //is subtracted from the monthly payment amount
            moneyAfterInterest = (PAYMENT_AMOUNT - interestDue);
            
            //Calculates the new balance due
            newBalanceDue = (newBalanceDue - moneyAfterInterest);
            
            //Add one to the month counter
            //Counter used to determine how many months it will take you to pay off the loan
            months++;
            
            //determines the total amount of interest paid over the life of the loan.
            totalInterestPaid = totalInterestPaid + interestDue;
        }
        
        //Prints out how many months it will take you to pay off the loan and
        //the total amount of interest paid over the life of the loan.
        System.out.println("It will take " + df.format(months) + " months to pay off the loan.");
        System.out.println("Total amount of interest paid over the life of the loan is $"
                           + df.format(totalInterestPaid));

    }
}
