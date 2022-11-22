
/**
 * Creates an Animal with a Name.
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 11, Lab
 */
public class Animal
{
    private String name = " ";

    public Animal (String name) {
        this.name = name;
        System.out.println("The Animal " + name + " has been created.");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name; 
    }

    public String sleep(){
        return ("The Animal " + name + " is asleep.");
    }

    public String makeNoise(){
        return ("The Animal " + name + " is making a noise.");
    }

    public String toString(){
        return ("The Animal " + name + ".");   
    }

    public boolean equals(Object anObject){
        if (anObject == null) {
            return false;   
        }
        if (getClass() != anObject.getClass()) {
            return false;   
        }
        Animal anotherAnimal = (Animal) anObject;
        return (getName().equals(anotherAnimal.getName()));   
    }
}
