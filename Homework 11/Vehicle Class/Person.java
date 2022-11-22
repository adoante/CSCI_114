
/**
 * Person.java: Creates a Person with a name;
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 11, Homework #2
 */
public class Person
{
    //Instance Variables
    private String name = " ";
    
    /**
     * <p>
     * No Arg Constructor.
     * </p>
     * 
     */
    public Person() {
        
    }
    
    /**
     * <p>
     * One arg constructor.
     * </p>
     * 
     * @param theName A Person's name.
     */
    public Person (String theName) {
        this.name = theName;
    }
    
    /**
     * <p>
     * Accesses a Person's name.
     * </p>
     * 
     * @return A Person's name.
     */
    public String getName(){
        return name;   
    }
    
    /**
     * <p>
     * Mutates a Person's name.
     * </p>
     * 
     * @param theName A Person's new name.
     */
    public void setName(String theName){
        this.name = theName;   
    }
    
    /**
     * <p>
     * Prints a Person's name.
     * </p>
     * 
     * @return A Person's name.
     */
    public String toString() {
        return ("Person's name: " + name);   
    }
    
    /**
     * <p>
     * Compares a Person's name.
     * </p>
     * 
     * @param anObject An Object of any class
     * @return either false or true
     */
    public boolean equals(Object anObject) {
        if (anObject == null) {
            return false;   
        }
        if (getClass() != anObject.getClass()) {
            return false;
        }
        Person anotherPerson = (Person) anObject;
        return (name.equals(anotherPerson.getName()));
    }
}
