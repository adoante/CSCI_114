
/**
 * TornadoException.java: a class that notifies the user of a tornado approaching.
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 13, Lab
 */
public class TornadoException extends Exception
{
    public TornadoException() {
        super ("Tornado! Please take cover!");   
    }
    
    public TornadoException(int m) {
        super ("Tornado is " + m + " miles away and headed this way!");   
    }
    
    
}
