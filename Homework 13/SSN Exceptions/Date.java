import java.util.Scanner ;

/**
 * <h2>Date.java - Stores month, day, and year of a date</h2>
 * <p>Instance variables:
 * <ul>
 *   <li><code><b>month</b></code> - the name of the month ("January", "February...")</li>
 *   <li><code><b>day</b></code> - the number of the day (1-31)</li>
 *   <li><code><b>year</b></code> - the 4-digit year number (1900-2100)</li>
 * </ul>
 * <p>Usage:</p>
 * <p style="margin-left: 25px;">To create <code><b>Date</b></code> objects, use the following:</p>
 * <p style="margin-left: 120px;"><code><b>new Date(m, d, y)</b></code></p>
 * <ul style="margin-left: 50px;">
 *   <li><code><b>m</b></code> is month number (1-12) or month name ("January", "February", "March"...)</li>
 *   <li><code><b>d</b></code> is the day number (1 to 31)</li>
 *   <li><code><b>y</b></code> is the year number (1900 to 2100)</li>
 * </ul>
 * <p style="margin-left: 25px;">If using the constructor which uses the month name, spell the month in full.</p>
 * <p style="margin-left: 25px;">To enter <code><b>Date</b></code> objects using <code><b>readInput</b></code>
 *      method, enter month name, day number, and year separated by spaces:</p>
 * <ul style="margin-left: 50px;">
 *   <li>January 18 1990</li>
 *   <li>September 25, 2005</li>
 *   <li>October 1 1931</li>
 *   <li>July 4, 2020</li>
 * </ul>
 * @author Chris Merrill
 * @version Module 11, Demonstration
 */

public class Date {

    private String month ; // "January", "February", "March"...
    private int day ;      // 1 to 31
    private int year ;     // a four digit number. (1900-2100)

    /**
     * No-argument constructor that sets the date to January 1, 1900
     */
    public Date( ) {
        month = "January" ;
        day = 1 ;
        year = 1900 ;
    }

    /**
     * Full constructor takes the month number.
     * @param monthInt the month number (1-12)
     * @param day the day of the month (1-31)
     * @param year the 4-digit year
     */
    public Date(int monthInt, int day, int year) {
        setDate(monthInt, day, year) ;
    }

    /**
     * Full constructor takes month name.
     * @param monthString the name of the month ("January", "February"...)
     * @param day the day of the month (1-31)
     * @param year the 4-digit year
     */
    public Date(String monthString, int day, int year) {
        setDate(monthString, day, year) ;
    }

    /**
     * Constructor that takes only the year (uses January 1).
     * @param year the 4-digit year
     */
    public Date(int year) {
        setDate(1, 1, year) ;
    }

    /**
     * Copy constructor.
     * @param aDate another <code>Date object to use as a template to copy.
     */
    public Date(Date aDate) {

        if (aDate == null) { //Not a real date.
            System.out.println("Fatal Error in Date(aDate) constructor") ;
            System.exit(0) ;
        }
        month = aDate.month ;
        day = aDate.day ;
        year = aDate.year ;
    }

    /**
     * Full setter that takes the month <i>number</i> (sets all three instance variables)
     * @param monthInt the number of the month (1-12)
     * @param day the day of the month (1-31)
     * @param year the 4-digit year
     */
    public void setDate(int monthInt, int day, int year) {

        if (dateOK(monthInt, day, year)) {
            this.month = monthString(monthInt) ;
            this.day = day ;
            this.year = year ;
        } else {
            System.out.println("Fatal Error in setDate") ;
            System.exit(0) ;
        }
    }

    /**
     * Full setter that takes the month <i>name</i>
     * @param monthString the name of the month ("January", "February", ...)
     * @param day the day of the month (1-31)
     * @param year the 4-digit year
     */
    public void setDate(String monthString, int day, int year) {
        if (dateOK(monthString, day, year)) {
            this.month = monthString ;
            this.day = day ;
            this.year = year ;
        } else {
            System.out.println("Fatal Error in setDate.") ;
            System.exit(0) ;
        }
    }

    /**
     * Full setter that takes only the year (uses January 1).
     * @param year the 4-digit year
     */
    public void setDate(int year) {
        setDate(1, 1, year) ;
    }

    /**
     * Setter for the year
     * @param year the 4-digit year
     */
    public void setYear(int year) {
        if ( (year < 1900) || (year > 2100) ) {
            System.out.println("Fatal Error in setYear") ;
            System.exit(0) ;
        }
        this.year = year ;
    }

    /**
     * Setter for the month using the month number
     * @param monthNumber the number of the month (1-12)
     */
    public void setMonth(int monthNumber) {
        if ((monthNumber <= 0) || (monthNumber > 12)) {
            System.out.println("Fatal Error in setMonth") ;
            System.exit(0) ;
        }
        else
            month = monthString(monthNumber) ;
    }

    /**
     * Setter for the month using the month name
     * @param monthName the name of the month ("January", "February", "March"...)
     */
    public void setMonth(String monthName) {
        if (!monthOK(monthName)) {
            System.out.println("Fatal Error in setMonth") ;
            System.exit(0) ;
        }
        month = monthName ;
    }

    /**
     * Setter for the day number
     * @param day the day of the month (1-31)
     */
    public void setDay(int day) {
        if ((day <= 0) || (day > 31)) {
            System.out.println("Fatal Error in setDay") ;
            System.exit(0) ;
        }
        this.day = day ;
    }

    /**
     * Getter for the month number (1-12)
     * @return the month number (1-12)
     */
    public int getMonth( ) {
        if (month.equals("January"))
            return 1 ;
        else if (month.equalsIgnoreCase("February"))
            return 2 ;
        else if (month.equalsIgnoreCase("March"))
            return 3 ;
        else if (month.equalsIgnoreCase("April"))
            return 4 ;
        else if (month.equalsIgnoreCase("May"))
            return 5 ;
        else if (month.equalsIgnoreCase("June"))
            return 6 ;
        else if (month.equalsIgnoreCase("July"))
            return 7 ;
        else if (month.equalsIgnoreCase("August"))
            return 8 ;
        else if (month.equalsIgnoreCase("September"))
            return 9 ;
        else if (month.equalsIgnoreCase("October"))
            return 10 ;
        else if (month.equalsIgnoreCase("November"))
            return 11 ;
        else if (month.equalsIgnoreCase("December"))
            return 12 ;
        else {
            System.out.println("Fatal Error in getMonth") ;
            System.exit(0) ;
            return 0 ; //Needed to keep the compiler happy
        }
    }

    /**
     * Getter for the day of the month
     * @return the day number (1-31)
     */
    public int getDay( ) {
        return day ;
    }

    /**
     * Getter for the year
     * @return the 4-digit year
     */
    public int getYear( ) {
        return year ;
    }

    /**
     * Returns the month name, day, and year in a <code>String</code> (mmm dd, yyyy)
     * @return the month name, day, and year (mmm dd, yyyy)
     */
    public String toString( ) {
        return (month + " " + day + ", " + year) ;
    }

    /**
     * Returns <code>true</code> if this <code>Date</code> object is the same as another
     * <code>Date</code> object
     * @return <true> if this <code>Date</code> object is the same as another <code>Date</code> object
     */
    public boolean equals(Date otherDate) {
        return ( (month.equals(otherDate.month)) &&
            (day == otherDate.day) &&
            (year == otherDate.year) ) ;
    }

    /**
     * Returns <code> if this date precedes another <code>Date</code> object submitted as a parameter.
     */
    public boolean precedes(Date otherDate) {
        return ( (year < otherDate.year) ||
            (year == otherDate.year && getMonth( ) < otherDate.getMonth( )) ||
            (year == otherDate.year && month.equals(otherDate.month)
                && day < otherDate.day) ) ;
    }

    /**
     * Reads the date from the user and stores in this object (entered in "mmm dd year" format)
     */
    public void readInput( ) {
        boolean tryAgain = true ;
        Scanner keyboard = new Scanner(System.in) ;
        while (tryAgain) {
            System.out.println("Enter month name, day, and year: ") ;
            String monthInput = keyboard.next( )
                .replace(",", "") ;
            int dayInput = Integer.parseInt(keyboard.next( )
                    .replace(",", "")) ;
            int yearInput = keyboard.nextInt( ) ;
            if (dateOK(monthInput, dayInput, yearInput) ) {
                setDate(monthInput, dayInput, yearInput) ;
                tryAgain = false ;
            }
            else
                System.out.println("Illegal date. Reenter input.") ;
        }
    }

    private boolean dateOK(int monthInt, int dayInt, int yearInt) {
        return ( (monthInt >= 1) && (monthInt <= 12) &&
            (dayInt >= 1) && (dayInt <= 31) &&
            (yearInt >= 1900) && (yearInt <= 2100) ) ;
    }

    private boolean dateOK(String monthString, int dayInt, int yearInt) {
        return ( monthOK(monthString) &&
            (dayInt >= 1) && (dayInt <= 31) &&
            (yearInt >= 1900) && (yearInt <= 2100) ) ;
    }

    private boolean monthOK(String month) {
        return (month.equals("January") || month.equals("February") ||
            month.equals("March") || month.equals("April") ||
            month.equals("May") || month.equals("June") ||
            month.equals("July") || month.equals("August") ||
            month.equals("September") || month.equals("October") ||
            month.equals("November") || month.equals("December") ) ;
    }

    private String monthString(int monthNumber) {
        switch (monthNumber) {
            case 1:
            return "January" ;
            case 2:
            return "February" ;
            case 3:
            return "March" ;
            case 4:
            return "April" ;
            case 5:
            return "May" ;
            case 6:
            return "June" ;
            case 7:
            return "July" ;
            case 8:
            return "August" ;
            case 9:
            return "September" ;
            case 10:
            return "October" ;
            case 11:
            return "November" ;
            case 12:
            return "December" ;
            default:
            System.out.println("Fatal Error in monthNumber") ;
            System.exit(0) ;
            return "Error" ; //to keep the compiler happy
        }
    }
}
