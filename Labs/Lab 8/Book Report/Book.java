/**
 * <h2>Describes one of the books in my library of great books</h2>
 * <p>Descripiton:</p>
 * <ul>
 *   <li>Instance variables:
 *      <ul>
 *         <li>title (<code>String</code>) - the title of the book</li>
 *         <li>author (<code>String</code>) - who wrote it</li>
 *         <li>pages (<code>int</code>) - number of pages in the book</li>
 *      </ul>
 *   </li>
 * </ul>
 * <ul>
 *   <li>Methods:
 *     <ul>
 *        <li>constructor ("full" constructor takes all instance variables)</li>
 *        <li>all getters and setters</li>
 *        <li><code>equals</code></li>
 *        <li><code>toString</code></li>
 *     </ul>
 *  </li>
 * </ul>
 * @author Chris Merrill
 * @version Module 8, Lab 1
 */
public class Book {

    // Instance variables
    private String title = "(none)" ;
    private String author = "(unknown)" ;
    private int pages = 0 ;

   /** Full constructor
     * @param title the title of the book
     * @param author the name of the author of the book
     * @param pages the number of pages in the book
     */
    public Book(String title, String author, int pages) {
        setTitle(title) ;
        setAuthor(author) ;
        setPages(pages) ;
    }

   /**
    * Getter for the title of the book
    * @return the title of the book
    */
    public String getTitle() {
        return title ;
    }

   /**
    * @Getter for the author of the book
    * @return the name of the author of the book
    */
    public String getAuthor() {
        return author ;
    }

   /**
    * Getter for the number of pages in the book
    * @return the number of pages in the book
    */
    public int getPages() {
        return pages ;
    }

   /**
    * Setter for the title of the book
    * @param newTitle the new title for this book
    */
    public void setTitle(String newTitle) {
        title = newTitle ;
    }

   /**
    * Setter for the author of the book
    * @param newAuthor the new name of the author of the book
    */
    public void setAuthor(String newAuthor) {
        author = newAuthor ;
    }

   /**
    * Setter for the number of pages in the book
    * @param newPages the new number of pages in the book
    */
    public void setPages(int newPages) {
        pages = newPages ;
    }

   /**
     * Returns all of the information about this book
     * @returns a <code>String></code> with the title, author, and number of pages
     */
    public String toString() {
        return "Title: " + title + "  Author: " + author + "  Pages: " + pages ;
    }

   /**
    * Compares all instance variables as a test for equality between 2 books
    * @param another The book to be compared to this book
    * @return true if the calling Book object has the same title, author, and
    *        number of pages as the Book object passed as a parameter
    */
    public boolean equals(Book another) {
        return ((title.equals(another.title)) &&
                (author.equals(another.author)) &&
                (pages == another.pages)) ;
    }
}
