
/**
 * PersonStack.java: implements a stack containing an array of Person  objects.
 *
 * @author Adolfo Sanpedro Gante 
 * @version Module 13, Lab Project #2
 */
public class PersonStack
{
    //Constants
    public static final int STACK_SIZE = 4;
    //Implementes stack with capacity of 4 Persons
    private Person[] stack = new Person[STACK_SIZE];
    //variable is used to point to the “next available stack position” in the array
    private int nextAvailablePosition = 0;
    
    //No-arg constructor
    public PersonStack() {
        
    }
    
    public void push(Object anObject) throws StackFullException, IllegalObjectException{
        if (anObject == null || !(anObject instanceof Person)) {
            throw new IllegalObjectException();   
        }
        if (nextAvailablePosition >= STACK_SIZE) {
            throw new StackFullException();
        }
        stack[nextAvailablePosition++] = (Person) anObject; 
    }
    
    public Person pop() throws StackEmptyException {
        if (nextAvailablePosition <= 0) {
            throw new StackEmptyException();   
        }
        Person returnPerson = stack[nextAvailablePosition - 1];
        stack[--nextAvailablePosition] = null;
        return returnPerson;
    }
    
    public String toString() {
        String returnString = "Contents of stack: \n";
        if (nextAvailablePosition <= 0) {
            returnString += ("   (nothing)");
        }
        else {
            for (int i = 0; i < nextAvailablePosition; i++) {
                returnString += "   " + stack[i].toString() + "\n";
            }
        }
        return returnString;
    }

}
