
/**
 * MoveFirstWord2Last.java - switches the first and last words of a line of text
 * Author:     Adolfo Sanpedro Gante
 * Module:     5
 * Project:    Homework
 * Problem Statement: Write a program that will read in a line of text as input from the user,
 *                    then output the line with the first word moved to the end of the line.
 *                    Use a  Scanner  object which uses the keyboard to read the line.
 *                     
 * Algorithm:
 *   1.  Create a scanner object that read input from the user
 *   2.  Use the method indexOf to find the first and last occureneces of a blank
 *   3.  Use substring method identify the first word, the last word and the remainder of the sentence
 *       a.   Use the value of the first and last occureneces of a blank
 *   4.  Create a new string with the substrings reversed
 *       a.   Use methods toUpperCase, toLowerCase and substring for proper capitalization
 *   5.  Print the new string with proper capitalization and the first and last words switched
 *
 */

import java.util.Scanner;

public class MoveFirstWord2Last
{
    public static void main (String[] args) {
        //Creates new Scanner object
        Scanner sc = new Scanner(System.in);
        
        //Asks user for line of text with no puctuation
        System.out.println("Enter a line of text. No puctuation please.");
        
        //saves users input as a string
        String userInput = sc.nextLine();
        
        //determines the first word of the users input
        int firstSpace = userInput.indexOf(" ");
        String firstWord = userInput.substring(0, firstSpace);
        
        //determines the last word of the users input
        int lastSpace = userInput.lastIndexOf(" ");
        String lastWord = userInput.substring(lastSpace + 1);
        
        //determines the words inbetween the first and last words
        String inbetweenSpaces = userInput.substring(firstSpace, lastSpace);
        
        //Switches the first and last word of the users input
        //capitalizes the last words first letter
        String rephrasedString = lastWord.substring(0,1).toUpperCase() + lastWord.substring(1)
                                 + inbetweenSpaces + " " + firstWord.toLowerCase();
    
        //Prints the new rephrased line of text
        System.out.println("I have rephrased that line to read:");
        System.out.println(rephrasedString);
    }
}
