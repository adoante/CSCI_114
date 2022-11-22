/**
 * <h2>Person.java - Simple Person class with a name an occupation.</h2>
 * <p>Description: Represents a person with their name and occupation</p>
 * <p>Instance variables:</p>
 * <ul>
 *   <li>(String) name</li>
 *   <li>(String) occupation</li>
 * </ul>
 * <p>Class Invariant: All objects have a name (a <code>String</code>) and an occupation.
 *    A name of "No name" indicates no real name specified yet.  An occupation of "(none)"
 *    indicates the occupation is unknown.</p>
 * <p>For this lab, you will need to use the <code>toString</code> method and a constructor.  A
 *    sample use of the constructor:</p>
 * <pre>
Person MickJagger = new Person("Mick Jagger", "Rock Star") ;
 * </pre>
 * @author Chris Merrill
 * @version Module 13, Lab Project 2
 */

public class Person {

    // Instance Variables
    private String name ;
    private String occupation ;

    /**
     * Full constructor that takes the person's name and birth date
     * <br />
     * Precondition: Neither theName nor theDate is null.
     * @param theName the name of the person
     * @param theDate the birthdate of the person
     */
    public Person(String newName, String newOccupation) {
        name = newName ;
        occupation = newOccupation ;
    }

    /**
     * Copy constructor takes another <code>Person</code> as a template.
     * @param originalPerson which serves as the source of properties to copy
     */
    public Person(Person originalPerson) {
        name = originalPerson.name ;
        occupation = originalPerson.occupation ;
    }

    /**
     * Getter for the name of the person
     * @return the name of the person
     */
    public String getName( ) {
        return name ;
    }

    /**
     * Getter for the occupationn of the person
     * @return the (String) occupation of the person
     */
    public String getOccupation( ) {
        return occupation ;
    }

    /**
     * Setter for occupation of this person
     * @param newOccupation the current occupation of the person
     */
    public void setName(String newName) {
        if (newName == null) {
            System.out.println("Fatal Error setting person's name.") ;
            System.exit(0) ;
        }
        name = newName ;
    }

    /**
     * Setter for the occupation of the person
     * @param newOccupation the new occupation of the person
     */
    public void setOccupation(String newOccupation) {
        occupation = newOccupation ;
    }

    /**
     * Returns a <code>String</code> with the name and occupation of the person
     * @return the name and birth date of the person
     */
    public String toString( ) {
        return ("Name: " + name + "  Occupation: " + occupation) ;
    }

    /**
     * Returns true if the date and occupation of this <code>Person</code> are the same as those
     * of the <code>Person</code> object passed as a parameter.
     * @return true if this person's name and occupation are the same as those of the parameter.
     */
    public boolean equals(Object anObject) {
        if (anObject == null || getClass() != anObject.getClass()) {
            return false ;
        }
        Person otherPerson = (Person) anObject ;
        return (name.equals(otherPerson.name) &&
            occupation.equals(otherPerson.occupation)) ;
    }
}