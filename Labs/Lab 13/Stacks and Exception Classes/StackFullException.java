
/**
 * StackFullException.java: thrown when trying to add (or “push”) an object
 *                          onto the stack which already hasreached its maximum size.
 *
 * @author Adolfo Sanpedro Gante 
 * @version Module 13, Lab Project #2
 */
public class StackFullException extends Exception
{
    public StackFullException() {
        super("PersonStack is full - object not added.");   
    }
}
