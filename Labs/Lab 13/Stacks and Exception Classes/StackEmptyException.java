
/**
 * StackEmptyException.java: thrown when trying to remove (or “pop”) an object from the
 *                           stack when the stack is empty.  The default constructor saves the message.
 *
 * @author Adolfo Sanpedro Gante 
 * @version Module 13, Lab Project #2
 */
public class StackEmptyException extends Exception
{
    public StackEmptyException() {
        super("PersonStack is empty - no object to return.");   
    }
}
