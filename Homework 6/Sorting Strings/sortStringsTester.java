import java.util.Scanner;

/**
 *sortStringsTester.java: tests the methods in the sortStrings class
 *<p>
 *<b>Problem Statment</b>:<br /> a program which prompts the user for three  Strings, then
 *                  sorts and displays them in reverse lexicographic (largest 
 *                  first, then smaller, then smallest) order on your screen.
 *                  If the user enters "quit" at any prompt, then your program
 *                  should end.
 *</p>                  
 *<b> Algorithm</b>:                  
 <ol>
 *    <li>Ask user for three strings and store those strings</li>
 *    <li>If the user enters "quit" at any point use system.exit(1) to end program</li>
 *    <li>create a new sortStrings object with three tirmed varibles</li>
 *    <li>use all three string3/2/1Pos methods form sortStrings class to determine lexicographic order</li>
 *    <li>Print reverse lexicographic order using the public varibles within sortStrings class</li>
 *</ol>
 *
 * @author Adolfo Sanpedro Gante
 * @version Homework, Module 6
 */
public class sortStringsTester
{
    public static void main (String [] args) {
        //creats new scanner object to take user input
        //asks user for three strings
        //if use enters "quit" the program will end
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter three Strings:");
        System.out.print("String 1: ");
        String string1 = sc.nextLine();
        if (string1.equals("quit")) {
            System.exit(1);
        }
        System.out.print("String 2: ");
        String string2 = sc.nextLine();
        if (string2.equals("quit")) {
            System.exit(1);
        }
        System.out.print("String 3: ");
        String string3 = sc.nextLine();
        if (string3.equals("quit")) {
            System.exit(1);
        }
        
        //creates new sortStrings and trims white space from String variables
        sortStrings line = new sortStrings(string1.trim(), string2.trim(), string3.trim());
        
        //Invokes methods from sortStrings class to determine lexicographic order
        line.string3Pos();
        line.string2Pos();
        line.string1Pos();
        
        //Prints strings in reverse lexicographic order
        System.out.println("Those Strings in reverse lexicographic order are:");
        System.out.println("1) " + line.third);
        System.out.println("2) " + line.second);
        System.out.println("3) " + line.first);
    }
}
