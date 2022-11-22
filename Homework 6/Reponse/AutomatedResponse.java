import java.util.Scanner;

/**
 * AutomatedResponse.java: Responds to a question, exclamation, or sentence.
 * 
 *<p>
 *<b> Problem Statment</b>: <br /> A program that takes a one-line sentence as from the keyboard
 *                         and prints pre-made respones based on type of punctuation.
 *
 *</p>
 *<b>Algorithm:</b>
 *<ol>
 *     <li>If the sentence ends with a question mark ‘?’ and the sentence contains an 
 *         even number of characters, then print the word "Yes" on the console.
 *     <li>If the sentence ends with a question mark ‘?’ and the sentence contains an
 *         odd number of characters, then print the word "No".
 *     <li>If the sentence ends with an exclamation mark ‘!’, print the word "Wow".
 *     <li>In all other cases, your program will output the string "You always say" 
 *         followed by the input string enclosed in quotes.  Your output should all be on one line.
 *     <li>Use an if-else statment to determine type of punctuation and a switch statment for either of the two
 *         respones for one-line text containing a '?'.
 *</ol>
 * @author Adolfo Sanpedro Gante
 * @version Homework, Module 6
 */
public class AutomatedResponse
{
    public static void main (String [] args) {
        //Creates new scanner object to take user input
        Scanner response = new Scanner(System.in);
        String userInput = response.nextLine();
        
        //returns -1 if userInput doesn't have either '?' or '!'
        int questionMark = userInput.lastIndexOf("?");
        int exclamationMark  = userInput.lastIndexOf("!");

        //If either question/exclamation mark is greater than 0
        //then the it contain either '?' or '!'
        //if its less than zero it doesn't contain either '?' or '!'
        if (questionMark > 0) {
            switch(userInput.length() % 2) {
                case 0:
                System.out.println("Yes");
                break;
                
                case 1:
                System.out.println("No");
                break;
            }
        } else if (exclamationMark > 0) {
            System.out.println("Wow");
        } else { 
            System.out.println("You always say, " + "\"" + userInput + "\"");
        }
    }
}
