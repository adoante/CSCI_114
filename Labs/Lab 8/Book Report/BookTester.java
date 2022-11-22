
/**
 * BookTester.java: Tests the methods in the Book class
 *
 * @author Adolfo Sanpedro Gante
 * @version Lab, Module 8
 */
public class BookTester
{
    static public void main(String [] args) {
        //Instance Variables
        int totalPages = 0;       //Used to total the amount of pages

        Book[] books = new Book[5];   //Creates an array of Book elements with size of 5

        //Creates 5 different books elements
        books[0] = new Book("The Great Gatsby", "F. Scott Fitzgerald", 182);
        books[1] = new Book("Catch-22", "Joseph Heller", 116);
        books[2] = new Book("The Catcher in the Rye", "J. D. Salinger", 196);
        books[3] = new Book("Beloved", "Toni Morrison", 345);
        books[4] = new Book("Ulysses", "James Joyce", 542);

        //Prints Report
        System.out.printf("       Title                    Author               Pages\n");
        System.out.printf("-------------------      ---------------------    -----------\n");

        for (int i = 0; i < books.length; i++) {
            System.out.printf("%-25s %-19s %11d \n",books[i].getTitle(), books[i].getAuthor(), books[i].getPages());
        }
        
        //Totals all pages
        for (int i = 0; i < books.length; i++) {
            totalPages = totalPages + books[i].getPages();
        }

        System.out.printf("                                                  =======\n");
        System.out.printf("                                         Total: %,9d", totalPages);
    }
}




/*
 * List of books I found on google
 * 
 * The Great Gatsby, F. Scott Fitzgerald, 182
 * Catch-22, Joseph Heller, 116
 * The Catcher in the Rye, J. D. Salinger, 196
 * Beloved, Toni Morrison, 345
 * Ulysses, James Joyce, 542
 */
