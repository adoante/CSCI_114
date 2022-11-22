
/**
 * IllegalObjectException.java: thrown when trying to add an object to the stack that
 *                              is not an instance of the correct type of object which the stack can hold.
 *
 * @author Adolfo Sanpedro Gante 
 * @version Module 13, Lab Project #2
 */
public class IllegalObjectException extends Exception
{
    public IllegalObjectException() {
        super("Object is not a Person - object not pushed.");   
    }
}
