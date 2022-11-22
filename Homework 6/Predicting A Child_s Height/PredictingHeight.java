import java.util.Scanner;

/**
 * PredictingHeight.java: estimate the adult height of a child is to using the mother and fathers height
 *<p>
 * <b>Problem Statment</b>:<br /> Write a program that prompts for the gender of the child, the height of the father, 
 *                   and the height of the mother, then calculates and prints the estimated adult height 
 *                   of the child.
 *</p>
 *<b> Algorithm</b>:
 *<ol>
 *    <li> Ask user if the child is either male or female</li>
 *    <li> Ask the user for the mothers and fathers heights</li>
 *    <li> Mothers and fathers heights should be saved as strings</li>
 *    <li> Convert both mother and fathers heights to two separate integers. (int feet, inches)</li>
 *    <li> Convert feet into inches (ex: 6 feet = 72 inches)</li>
 *    <li> Add feet and inches as the mothers and fathers new heights</li>
 *    <li> Depending on if the child is either male or female use these formules to calculate thier height
 *   <ul> 
 *       <li> <code> male_child_height = ((mother_height * 13 / 12) + father_height ) / 2 </code> </li>
 *       <li> <code> female_child_height = ((father_height * 13 / 12) + mother_height ) / 2 </code> </li>
 *   </ul>
 *    <li> Finally neatly print out the childs height in this format: #'##" (Ex: 5'10") </li>
 *</ol>
 *
 * @author Adolfo Sanpedro Gante
 * @version Homework, Module 6
 */
public class PredictingHeight
{
    //Constants
    public static final int ZERO = '0';
    
    public static void main (String [] arga) {
        //Instance Variables
        int childHeight = 0;
        String mother = " ";
        String father = " ";
        int motherHeight = 0;
        int fatherHeight = 0;
        String maleORfemale = " ";
        int feet = 0;
        int inches = 0;
        int cFeet = 0;
        int cInches = 0;        
        
        //creates new scanner object
        //asks the user if the child is male or female
        Scanner sc = new Scanner(System.in);
        System.out.println("Is the child male or female?");
        maleORfemale = sc.nextLine();
        
        //asks for mothers
        System.out.println("For all heights please use this format: #'##\" (Ex: 5'10\")");
        System.out.println("What is the mothers height?");
        mother = sc.nextLine();
        
        if (mother.length() == 4) {
            feet = ((int) mother.charAt(0) - ZERO) * 12;
            inches = (int) mother.charAt(2) - ZERO;
            motherHeight = feet + inches;  
        } else if (mother.length() == 5) {
            feet = ((int) mother.charAt(0) - ZERO) * 12;
            inches = ((int) mother.charAt(3) - ZERO) + 10;
            motherHeight = feet + inches;
        } else if (mother.length() == 2) {
            feet = ((int) mother.charAt(0) - ZERO) * 12;
            motherHeight = feet;
        }
        
        System.out.println("What is the fathers height?");
        father = sc.nextLine();
        //5'10"
        if (father.length() == 3) {
            feet = ((int) father.charAt(0) - ZERO) * 12;
            inches = (int) father.charAt(2) - ZERO;
            fatherHeight = feet + inches;  
        } else if (father.length() == 4) {
            feet = ((int) father.charAt(0) - ZERO) * 12;
            inches = ((int) father.charAt(3) - ZERO) + 10;
            fatherHeight = feet + inches;
        }
        else if (father.length() == 2) {
            feet = ((int) father.charAt(0) - ZERO) * 12;
            fatherHeight = feet;
        }
        
        //lowercases users input for use in switch statment
        maleORfemale.toLowerCase();

        //switch statment for either male or female cases
        //default asks user for male or female
        switch (maleORfemale) {
            case "male":
                //calculation for predicting child height
                childHeight = ((motherHeight *  (13/12)) + fatherHeight) / 2;
                //converts childHeight from inches to both feet and inches
                cFeet = childHeight / 12;
                cInches = childHeight % 12;
                System.out.println("Child's predicted height is: " + cFeet + "'" + cInches + "\"");
            break;
            case "female":
                //calculation for predicting child height
                childHeight = ((fatherHeight *  (13/12)) + motherHeight) / 2;
                //converts childHeight from inches to both feet and inches
                cFeet = childHeight / 12;
                cInches = childHeight % 12;
                System.out.println("Child's predicted height is: " + cFeet + "'" + cInches + "\"");
            break;
            default:
                System.out.println("Please only enter either male or female.");
                System.out.println("Max height is 9'11");
        }

    }
}
