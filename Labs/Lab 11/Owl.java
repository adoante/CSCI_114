
/**
 * Creates an Owl with a name and breed
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 11, Lab
 */
public class Owl extends Animal
{
    private String breed = " ";

    public Owl(String name, String breed)
    {
        super(name);
        setName(name);
        this.breed = breed;
        System.out.println("An Owl " + getName() + " of breed " + breed + " has been created.");
    }

    public String getBreed(){
        return (breed);   
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String toString() {
        return ("The Owl " + getName() + " of breed " + breed + "."); 
    }
    
    public String makeNoise() {
        return ("The Owl " + getName() + " is hooting.");
    }
    
    public boolean equals(Object anObject) {
        if (anObject == null) {
            return false;   
        }
        if (getClass() != anObject.getClass()) {
         return false;   
        }
        Owl anotherOwl = (Owl) anObject;
        return (getName().equals(anotherOwl.getName()) && getBreed().equals(anotherOwl.getBreed()));
    }
}
