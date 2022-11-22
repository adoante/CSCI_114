import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

/**
 * Lab12.java: Tests PrintWriter class and the methods in Stock class.
 * 
 * <p>
 * <b>Problem Statement</b>:<br/ b> Manipulate a text file containing information about company
 *                                  stocks (company name, stock symbol, and stock price).
 * 
 * <b>Algorithm</b>:
 *    <ol>
 *         <li> Create a text file containing the company name (for example, “Apple”), its stock
 *              symbol (“APPL”), and the price of its stock for several companies on a stock exchange. </li>
 *         <li> Create a class named  Stock  with instance variables to hold the company name, the stock
 *              symbol, and the stock’s price for each company in the text file </li>
 *         <li> In a separate class, create a  main  method. </li>
 *         <li> In  main,  create an array which can hold (up to) 100  Stock  objects </li>
 *         <li> Create a method which uses a  Scanner  to read a text file containing a list of stock names,
 *              symbols, and prices into an array of  Stock  object. </li>
 *         <li> Decrease all of the stock prices by 1/3. </li>
 *         <li> Write another method which uses a  PrintWriter  to write the same data onto a second text file. </li>
 *         <li> Clear the array of  Stock  objects. </li>
 *         <li> Use the same method from step 5 above to read the data just written (with the decreased prices)
 *              into the array of  Stock  objects again. </li>
 *         <li> Increase the prices of the stocks back to their original values (plus or minus a penny). </li>
 *         <li> Use the method from step 7 to write them back onto a third text file. </li>
 *    </ol>
 *                                  
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 12, Lab
 */
public class Lab12
{
    public static void main(String[] args) throws Exception {
        //Array of 100 Stock objects
        Stock[] portfolio = new Stock[100];
        
        //Reads a txt file and prints it contents
        readStocksWithScanner("stocks1.txt", portfolio);
        
        //updates and prints the stocks prices by a multiplier
        System.out.println();
        updateStockPrices((1.0 / 3.0), portfolio);
        
        //writes a Stock array to a new txt
        writeStocks("stocks2.txt", portfolio);
        
        //Sets all elements to null
        for(int i = 0; i < portfolio.length; i++) {
            portfolio[i] = null;
        }
        
        //repopulates the array with stocks2.txt
        System.out.println();
        readStocksWithScanner("stocks2.txt", portfolio);
        
        //Restores the price of each stock back to its original value
        //Multiplier is 3.0 because it is the inverse of 1/3
        System.out.println();
        updateStockPrices(3.0 , portfolio);
        
        //writes a Stock array to a new txt
        writeStocks("stocks3.txt", portfolio);
    }
    
    public static void readStocksWithScanner(String fileName, Stock[] anArray) throws Exception {
        Scanner fileIn = new Scanner (new File(fileName));

        int index = 0;
        while (fileIn.hasNextLine()){
            fileIn.useDelimiter(",");
            String name = fileIn.next();
            String symbol = fileIn.next();
            fileIn.useDelimiter("[,\\s]");
            double price = fileIn.nextDouble();
            fileIn.nextLine();

            anArray[index] = new Stock(name, symbol, price);
            System.out.println(anArray[index]);
            index++;
        }
        
        fileIn.close();
    }
    
    public static void updateStockPrices(double multiplier, Stock[] anArray) throws Exception {
        for (Stock i : anArray) {
            if (i == null) {
                continue;
            }
            else {
                i.setPrice(Math.round( (i.getPrice() * multiplier) * 100.0 ) / 100.0 );
                System.out.println("Updated " + i.getSymbol() + " to $" + i.getPrice());
            }
        }   
    }
    
    public static void writeStocks(String fileName, Stock[] anArray) throws Exception {
        PrintWriter writer = new PrintWriter(fileName);
        
        for (Stock i : anArray) {
            if (i == null) {
                continue;
            }
            else {
                writer.println(i.getName() + "," + i.getSymbol() + "," + i.getPrice());
            }
        }
        
        writer.close();
    }
    
}
