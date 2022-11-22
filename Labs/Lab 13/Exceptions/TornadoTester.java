
/**
 * TornadoTester.java: Tests the exception class TornadoException.
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 13, Lab
 */
public class TornadoTester
{
    public static void main(String[] args) {
        // Try the no-arg constructor
        System.out.println("Use no-arg constructor.");
        try {
            throw new TornadoException();
        }
        catch (TornadoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        
        // Try the constructor that takes an int
        System.out.println("Use one-arg constructor.");
        try {
            throw new TornadoException(50);
        }
        catch (TornadoException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
