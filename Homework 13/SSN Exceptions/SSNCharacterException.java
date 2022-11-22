/**
 * SSNCharacterException.java: Custom Exception for illegal characters.
 *
 * <p>
 * Discription: The exception should be thrown when an employee objects social Security number
 * is anything other than integer digits.
 * </p>
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 13, Homework Project 3
 */

public class SSNCharacterException extends Exception {

  public SSNCharacterException() {
    super("All characters must be an interger digit.");
  }

}
