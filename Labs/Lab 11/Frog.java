
/**
 * Creates a Frog with a name.
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 11, Lab
 */
public class Frog extends Animal
{
    public Frog (String name) {
        super(name);
        setName(name);
        System.out.println("A Frog " + name + " has been created.");
    }

    public String makeNoise(){
        return ("A Frog " + getName() + " is ribbiting.");   
    }

    public String toString() {
        return ("The Frog " + getName() + ".");
    }
}
