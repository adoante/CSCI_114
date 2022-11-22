import java.text.DecimalFormat;

/**
 * Fraction.java:  class will be used to represent a ratio of two integers,
 *                 both stored in each object of the class as instance variables
 *
 * @author Adolfo Sanpedro Gante
 * @version Homework, Module 6
 */
public class Fraction
{
    //Instance Variables
    private int numerator = 0;      //the fractions numerator
    private int denominator = 0;    //the fractions denominator

    public Fraction (int numerator,int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {

    }

    /**
     * @return displays the fraction on the screen as a ratio, (e.g., 5 / 9).
     */

    public String showFraction() {
        return(numerator + "/" + denominator);
    }

    /**
     * @return takes as a parameter another  Fraction  object and returns  true  if
     *         the two fractions represent the same real value and  false  otherwise.
     *         For example, the two fractions 1 / 3 and 20 / 60 are equal, so the 
     *         method should return  true. (If either denominator is 0, then return  false.)
     */
    public boolean equals(Fraction another) {
        if(denominator == 0 || another.denominator == 0) {
            return (false);   
        }
        else {
            double fraction1 = (double) (numerator / denominator);
            double fraction2 = (double) (another.numerator / another.denominator);

            if(fraction1 == fraction2) {
                return (true); 
            } else {
                return(false);
            }
        }
    }

    //Sets decimal format for only to decimal points
    DecimalFormat df = new DecimalFormat("0.###");
    /**
     * @return  returns a  String  containing the numerator, the denominator, and the real
     *          value represented by dividing the numerator by the denominator. 
     */
    
    public String toString(){
        return("The fraction " + numerator + "/" + denominator
            + " evaluates to " + df.format((double) numerator/ denominator));
    }

    //Accessors
    public int numeratorValue(){
        return(numerator);
    }

    public int denominatorValue(){
        return(denominator);
    }
    //Mutators
    public void setNumerator(int newNumerator) {
        numerator = newNumerator;
    }

    public void setDenominator(int newDenominator) {
        denominator = newDenominator;
    }
}
