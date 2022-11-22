
/**
 * PersonStackTester.java: Tests the methods in PersonStack.
 *
 * @author Adolfo Sanpedro Gante 
 * @version Module 13, Lab Project #2
 */
public class PersonStackTester
{
    public static void main(String[] args) {
        PersonStack stack = new PersonStack();

        Person gus = new Person("Gustavo", "Vet Tech");
        Person josh = new Person("Joshua", "Student");
        Person gabe = new Person("Gabriel", "Marine");
        Person ado = new Person("Adolfo", "Student");

        try {
            System.out.println("Just added four people to the stack.");
            stack.push(gus);
            stack.push(josh);
            stack.push(gabe);
            stack.push(ado);

            System.out.println("Here is the contents of the stack:");
            System.out.println(stack);

            System.out.println("Trying to push one more onto the stack:");
            stack.push(gus);
        }
        catch (StackFullException e) {
            System.out.println(e.getMessage());        
        }
        catch (IllegalObjectException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        try {
            System.out.println("Popping the contents of the stack plus one.");
            stack.pop();
            System.out.println("Popped: " + gus);
            stack.pop();
            System.out.println("Popped: " + josh);
            stack.pop();
            System.out.println("Popped: " + gabe);
            stack.pop();
            System.out.println("Popped: " + ado);

            System.out.println();
            System.out.println("Tring to add an Object object to the stack:");
            stack.pop();
        }
        catch (StackEmptyException e) {
            System.out.println(e.getMessage());   
        }
        
        System.out.println();

        try {
            String superMonkey = new String();
            System.out.println("Trying to push anObject of String type.");
            stack.push(superMonkey);
        }
        catch (IllegalObjectException e){
            System.out.println(e.getMessage());   
        }
        catch (StackFullException e) {
            System.out.println(e.getMessage());        
        }
    }
}
