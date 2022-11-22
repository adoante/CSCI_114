/**
 * SSNLengthException.java: Custom Exception for a certain number of characters.
 *
 * <p>
 * Discription: The exception should be thrown when an employee objects social Security number
 * is more than 9 characters in length.
 * </p>
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 13, Homework Project 3
 */

public class SSNLengthException extends Exception {

  public SSNLengthException() {
    super("Social Security Number is not excatly nine characters.");
  }

}
