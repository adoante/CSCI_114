/**
 * ConversionTester.java: Tests the methods in Temerature
 * <p>
 * <b>Problem Statement</b>: Compare the ten  Temperature  objects
 *                           using the equals method and display the results
 * </p>
 * 
 * <p>
 * <b>Algorithm</b>:
 *    <ol>
 *        <li> Create ten temperature objects using all four constructors at least once. </li>
 *        <li> Use the equals method to determine whether or not the Temperatures are equal. </li>
 *        <li> Use the toString method to print what two Temperatures are being compared
 *             and print the results of the equals method. </li>
 *    </ol>
 * 
 * </p>
 * @author Adolfo Sanpedro Gante
 * @version Homework, Module 7
 */

public class ConversionTester {

    public static char DEGREE = '\u00b0' ;                         // degree symbol

    public static void main(String[] args) {

        Temperature freezeCelsius = new Temperature() ;
        Temperature freezeFahrenheit = new Temperature(32, 'F') ;

        Temperature boilCelsius = new Temperature(100) ;
        Temperature boilFahrenheit = new Temperature(212, 'F') ;

        Temperature fiftyCelsius = new Temperature(50) ;
        Temperature fiftyFahrenheit = new Temperature(50, 'F') ;

        Temperature minusFortyCelsius = new Temperature(-40.0, 'C') ;
        Temperature minusForthFahrenheit = new Temperature(-40.0, 'F') ;
        
        Temperature isThisConsideredCold = new Temperature(45);
        Temperature iKnowThisConsideredCold = new Temperature(15, 'f');
        
        
        System.out.print(freezeCelsius + " and " + freezeFahrenheit + " is ");
        System.out.println(freezeCelsius.equals(freezeFahrenheit) ? "equal." : "not equal.");
        
        System.out.print(boilCelsius + " and " + boilFahrenheit + " is ");
        System.out.println(boilCelsius.equals(boilFahrenheit) ? "equal." : "not equal.");
        
        System.out.print(fiftyCelsius + " and " + fiftyFahrenheit + " is ");
        System.out.println(fiftyCelsius.equals(fiftyFahrenheit) ? "equal." : "not equal."); 
        
        System.out.print(minusFortyCelsius + " and " + minusForthFahrenheit + " is ");
        System.out.println(minusFortyCelsius.equals(minusForthFahrenheit) ? "equal." : "not equal.");
        
        System.out.print(isThisConsideredCold + " and " + iKnowThisConsideredCold + " is ");
        System.out.println(isThisConsideredCold.equals(iKnowThisConsideredCold) ? "equal." : "not equal.");
    } // end of main
}
// end of ConversionTester class