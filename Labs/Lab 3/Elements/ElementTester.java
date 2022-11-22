
/**
 * ElementTester.java - tests the Element Class with 4 elements
 * Author:     Adolfo Sanpedro Gante
 * Module:     3
 * Project:    Homework
 * Problem Statement: Create an  ElementTester  class containing  main  which exercises the methods
 *                    in  Element  and prints a nicely-formatted report of several elements.
 *                    
 * Algorithm:
 *    1. Create  Element  objects for the following four chemical elements:
 *         Hydrogen using no-arg constructor, then setters
 *         Create the other elements(Oxygen, Gold, Plutonium) using the full constructor
 *    2.Display all 4 elements on separate lines using  toString
 *    3.Create a columnar report showing all 4 elements:
 *         atomic number should be right-justified, since it's a number
 *         name and "natural" flag should be left-justified (both are text)
 */
public class ElementTester
{
    public static void main(String[] args) {
        //creates new element object using no-arg constructor and setters
        Element hydrogen = new Element();
        hydrogen.setName("Hydrogen");
        hydrogen.setAtomicNumber(1);
        hydrogen.setIsNatural(true);
        
        //creates new element object using full constructor
        Element oxygen = new Element("Oxygen", 8, true);
        Element gold = new Element("Gold", 79, true);
        Element plutonium = new Element("Plutonium", 94, false);
        
        //Prints out the elements information
        System.out.println(oxygen);
        System.out.println(gold);
        System.out.println(plutonium);
        System.out.println();
        
        //Prints a neatly set report
        System.out.println(" Atomic      Element      Is\n" +
                           " Number       Name      Natural?\n" +
                           "---------  ----------  ----------");
                           

        String format = "%4d       %-12s %3s %n";
        System.out.printf(format, hydrogen.getAtomicNumber(),
                                  hydrogen.getName(),
                                  hydrogen.getIsNatural());
        System.out.printf(format, gold.getAtomicNumber(),
                                  gold.getName(),
                                  gold.getIsNatural());
        System.out.printf(format, plutonium.getAtomicNumber(),
                                  plutonium.getName(),
                                  plutonium.getIsNatural());
    }
}
