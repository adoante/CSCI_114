
/**
 * VendingMachine.java - Determines the change to be dispensed from a vending machine.
 * Author:     Adolfo Sanpedro Gante
 * Module:     5
 * Project:    Homework
 * Problem Statement: Write a program that determines the change to be dispensed from a vending machine. 
 *                    An item in the machine can cost between 5 cents and 1 dollar,in 5-cent increments
 *                    (5, 10, 15, 20, . . . 95, or 100), and the machine accepts only a single dollar bill
 *                    to pay for the item.
 * Algorithm:
 *    1.   Prompt user to enter items price using Scanner method
 *    2.   Calculate the difference ( change = $1.00 - item price)
 *    3.   What is the largest coin that can “fit” into “change”?
 *    4.   Declare variables int Quarter, Dime, Nickel, Penny
 *    5.   If change is larger than 25/10/5/1 cents do (change = change - 25/10/5/1 cents)
 *    6.   Update coin variables if their respective if statement is true
 *    7.   When change reaches “0” dispense coins bases on coin variables\
 *
 */

import java.util.Scanner;

public class VendingMachine
{
    public static void main(String [] args) {
        //Instance Variables
        int change = 0;
        int qrt = 0;
        int dime = 0;
        int nickel = 0;
        
        //Creates Scanner Object
        Scanner sc = new Scanner(System.in);

        //Prompts user to imput item amount
        System.out.println("Enter item price (from 5 cents to $1, in 5-cent increments): ");

        //int variables saves users input
        int itemPrice = sc.nextInt();
        //Calculates change amount
        change = 100 - itemPrice;

        //tells user amount of change and item cost
        System.out.println("Your item costs " + itemPrice +
                           " cents. From $1, your change is " + change + " cents: ");

        //determines the amount of each coin needed
        while (change > 0) {
            if (change >= 25) {
                change = change - 25;
                qrt++;
            }
            else if (change >= 10 && change < 25) {
                change = change - 10;
                dime++;
            }
            else if (change >= 5 && change < 10) {
                change = change - 5;
                nickel++;
            }
        }

        //Prints out the amount of each coin needed for the change dispensed
        System.out.printf(qrt + " quarters,\n" + dime + " dimes, and\n" + nickel + " nickels.\n");
    }
}
