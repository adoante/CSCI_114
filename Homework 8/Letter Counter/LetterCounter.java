import java.util.Scanner;

/**
 * LetterCounter.java: Counts the amount of words and individual letters in user given lines.
 *<p>
 *<b>Problem Statment</b>:<br /> Write a program that will read in multiple lines of text from the user
 *                   and display a count of the number of words and list of all the letters
 *                   that occur in the text, along with the number of times each letter occurs.
 *                   The last line of input from the user should end with a period. After that
 *                   the program will print a number of words entered, along with counts for each letter. 
 *</p>
 *
 *
 *<b>Algorith</b>:
 *   <ol>
 *       <li>Prompt the user for lines of text. Loop this until a sentinel value is entered.</li>
 *       <li>Store user input into an array of type String.</li>
 *       <li>Create an array of type int and size 26 to store individual letter counts.</li>
 *       <li>Loop through the array of strings to determine the letter counts. Also the number of spaces.</li>
 *       <li>Using an multi-way if or switch statement update the array of type int and the spaces counter.</li>
 *       <li>Print the number of words using the spaces counter and number of lines entered (array of type String length)</li>
 *       <li>Print out the letter count for each character (a-z).</li> 
 *   </ol>
 *
 * @author Adolfo Sanpedro Gante
 * @version Homework, Module 8
 */
public class LetterCounter
{
    public static void main(String [] args) {
        //Constants
        final String SENTINEL = ".";

        //Instance Variable
        int num = -1;                          //Counter used to update text[] element
        int textArrayCount = 0;                //Counts the partially filled array
        int spaceCount = 0;                    //Counts the number of spaces in between words

        //Creates new scanner obj. to take user input
        Scanner sc = new Scanner(System.in);

        //Prompts user for lines of text (Strings)
        //Tells user how to end program
        System.out.println("Enter several lines of text to analyze.\nWhen done, end a line with a period.");

        //Creates array of type String to store user input
        //Assuming no one enters over 1000 lines
        String text[] = new String[1000];

        //Loops user input of strings untill sentinel value is given
        do {
            num++;
            System.out.printf((num+1) + ": ");
            text[num] = sc.nextLine();
            textArrayCount++;
        } while (text[num].lastIndexOf(SENTINEL) == -1);

        //Creates Array of type char to count letters
        int letters[] = new int[26];

        //Loops through all lines of text
        //to determine the letter counts using a switch statement
        for (int i = 0; i < textArrayCount; i++) {
            for (int j = 0; j < text[i].length(); j++) {
                switch (Character.toUpperCase(letterValue(text[i], j))) {
                    case 'A':
                    letters[0]++;
                    break;

                    case 'B':
                    letters[1]++;
                    break;

                    case 'C':
                    letters[2]++;
                    break;

                    case 'D':
                    letters[3]++;
                    break;

                    case 'E':
                    letters[4]++;
                    break;

                    case 'F':
                    letters[5]++;
                    break;

                    case 'G':
                    letters[6]++;
                    break;

                    case 'H':
                    letters[7]++;
                    break;

                    case 'I':
                    letters[8]++;
                    break;

                    case 'J':
                    letters[9]++;
                    break;

                    case 'K':
                    letters[10]++;
                    break;

                    case 'L':
                    letters[11]++;
                    break;

                    case 'M':
                    letters[12]++;
                    break;

                    case 'N':
                    letters[13]++;
                    break;

                    case 'O':
                    letters[14]++;
                    break;

                    case 'P':
                    letters[15]++;
                    break;

                    case 'Q':
                    letters[16]++;
                    break;

                    case 'R':
                    letters[17]++;
                    break;

                    case 'S':
                    letters[18]++;
                    break;

                    case 'T':
                    letters[19]++;
                    break;

                    case 'U':
                    letters[20]++;
                    break;

                    case 'V':
                    letters[21]++;
                    break;

                    case 'W':
                    letters[22]++;
                    break;

                    case 'X':
                    letters[23]++;
                    break;

                    case 'Y':
                    letters[24]++;
                    break;

                    case 'Z':
                    letters[25]++;
                    break;

                    case ' ':
                    spaceCount++;
                    break;

                }
            }
        }

        //Prints the amount of words in the text
        System.out.println();
        System.out.println("There are " + (spaceCount + textArrayCount) + " words in the text.");
        System.out.println();
        
        //prints the letter count
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.println(i + ": " + letters[i - 65]);
        }
        
    }

    /**
     * 
     * <p>
     * Converts a specific charater in a string into type char.
     * </p>
     * 
     * @param text A line of text.
     * @param element The specific charater to be converted into type char.
     * 
     * @return the charater (ex. 'a')
     * 
     */
    public static char letterValue(String text, int element){
        char letter = ' ';
        letter = text.charAt(element);
        return(letter);
    }
}
