
/**
 *FractionTester.java: tests the methods in the Fraction class
 *<p>
 *<b>Problem Statment</b>:<br /> The program will test all methods from the Fraction class
 *</p>                  
 *<b> Algorithm</b>:                  
 <ol>
 *    <li>Create a new Fraction object using the full constructor</li>
 *    <li>Create a second Fraction object using the no-arg constructor</li>
 *    <li>Use the setNumerator and setDenominator methods to set the varibles for the second fraction</li>
 *    <li>Use the showFraction method to print the fractions in ratio form (EX: 1/4)</li>
 *    <li>Use the equals method to determine if frac1 is equal to frac2</li>
 *    <li>Use the toString method to print out the fraction and its value</li>
 *</ol>
 *
 * @author Adolfo Sanpedro Gante
 * @version Homework, Module 6
 */
public class FractionTester
{
    public static void main (String[] args) {
        //First fraction
        Fraction frac1 = new Fraction();
        frac1.setNumerator(-6);
        frac1.setDenominator(4);
        //Second Fraction
        Fraction frac2 = new Fraction(-125, 83);
        
        //Shows frac1 and frac2 ratio
        System.out.println(frac1.showFraction());
        System.out.println(frac2.showFraction());
        
        //compares frac1 and frac2
        //true = frac1 and frac2 have the same value
        //false = frac1 and frac2 don't have the same value
        System.out.println(frac1.equals(frac2));
        
        //Prints the fraction ratio and what it evaluates to
        System.out.println(frac1);
        System.out.println(frac2);
    }
}
