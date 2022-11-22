import java.io.File;
import java.util.Scanner;

/**
 * isPopularName.java: Checks to see if a name is popular or not.
 * 
 * <p>
 * <b>Problem Statement</b>: <br /b> Read text files containing lists of popular girl and boy names into two arrays of objects,
 *                           then prompt the user for a name and see if that name is in either list.
 * </p>
 * 
 * <b>Algorithm</b>:
 * <ol>
 *      <li> Write a method that takes two paramaters: a txt file and a NameAndBirth array. </li>
 *      <li> The method will populate a NameAndBirth array with a givin file. </li>
 *      <li> Create two Array's with an initial size of 1000 for boy and girl names. </li>
 *      <li> Create a method that takes three parameters, either "boy" or "girl", the name
 *           specified by the user, and the array of  NameAndBirth objects to search. </li>
 *      <li> Prompt user to input a name. </li>
 *      <li> Check to see if that name is in either list. </li>
 *      <li> If yes, print the name, popularity ranking and what list it belongs to. </li>
 *      <li> If no, Print that the name is not ranked in "boy" or "girl" list. </li>
 * </ol>
 * @author Adolfo Sanpedro Gante
 * @version Module 12, Homework #1
 */
public class isPopularName
{
    public static void main (String[] args) throws Exception {
        //Two Array's with an initial size of 1000
        NameAndBirths[] boys = new NameAndBirths[1000];
        NameAndBirths[] girls = new NameAndBirths[1000];

        //Populates the boys array
        entersPopularBabyNames ("BoyNames2019.txt", boys);

        //Populates the girls array
        entersPopularBabyNames ("GirlNames2019.txt", girls);

        //Asks user for a name
        Scanner sc = new Scanner (System.in);
        String userInput = " ";
        System.out.println("Enter 9999 to exit program.");

        //Checks both arrays for userInput
        while (true) {
            System.out.printf("Enter a name: ");
            userInput = sc.nextLine();
            if (userInput.equals("9999")) {
                System.out.println("Exited Program.");
                System.exit(0);
            }
            isNameInArray("girl", userInput, girls);
            isNameInArray("boy", userInput, boys);
        }
    }

    public static void entersPopularBabyNames (String fileName, NameAndBirths[] anArray) throws Exception{
        Scanner fileIn = new Scanner (new File(fileName));
        int index = 0;
        while (fileIn.hasNextLine()){
            fileIn.useDelimiter("[\\s]+");
            String name = fileIn.next();
            int births = fileIn.nextInt();
            fileIn.nextLine();

            anArray[index] = new NameAndBirths(name, births);
            index++;
        }
        fileIn.close();
    }

    public static void isNameInArray (String boyGirl, String name, NameAndBirths[] anArray) {
        int rank = 1;
        boolean inArray = false;
        for (NameAndBirths j : anArray){
            if (name.toLowerCase().equals(j.getName().toLowerCase())) {
                System.out.println(name + " is ranked " + rank + " among " + boyGirl + "s with " + j.getBirths() + " registered births.");
                inArray = true;
            }
            rank++;
        }
        
        if (!inArray) {
            System.out.println(name + " is not ranked among the 1000 " + boyGirl + " names.");       
        }
    }
}