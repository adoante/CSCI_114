
/**
 * Vehicle.java: Creates a Vehicle with manufacturer's name, number of cylinders in the engine, owner.
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 11, Homework #2
 */
public class Vehicle extends Person
{
    //Instance Variables
    private String manufacturer = " ";
    private int cylinders = 0;
    private Person owner;
    
    /**
     * <p>
     * No args Vehicle Constructor.
     * </p>
     */
    public Vehicle() {
        
    }
    
    /**
     * <p>
     * 3 arg Constructor
     * </p>
     * 
     * @param manufacturer The Vehicle manufacturer's name.
     * @param cylinders The number of cylinders in the Vehicle engine.
     * @param owner The Vehicle owner
     * 
     */
    public Vehicle(String manufacturer, int cylinders, Person owner){
        super();
        this.manufacturer = manufacturer;
        this.cylinders = cylinders;
        this.owner = owner;
    }

    /**
     * <p>
     * Mutates the manufacturer's name.
     * </p>
     * 
     * @param manufacturer A new manufacturer's name.
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;   
    }

    /**
     * <p>
     * Accesses the manufacturer's name.
     * </p>
     * 
     * @return The manufacturer's name.
     */
    public String getManufacturer() {
        return (manufacturer);
    }
    
    /**
     * <p>
     * Mutates the number of cylinders.
     * </p>
     * 
     * @param manufacturer A new number of cylinders.
     */
    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;   
    }

    /**
     * <p>
     * Accesses the number of cylinders.
     * </p>
     * 
     * @return The number of cylinders.
     */
    public int getCylinders() {
        return (cylinders);
    }
    
    /**
     * <p>
     * Mutates the Owner's name.
     * </p>
     * 
     * @param owner The new Owner's name.
     */
    public void setOwner(Person owner) {
        this.owner = owner;   
    }
    
    private Person getPerson(){
        return (owner);   
    }
    
    /**
     * <p>
     * Accesses the Owner's name.
     * </p>
     * 
     * @return The Owner's name.
     */
    public String getOwner() {
        return (owner.getName());   
    }
    
    /**
     * <p>
     * Prints the Manufactuer's name, the number of cylinders, and the owner's name.
     * </p>
     * 
     * @return The Manufactuer's name, the number of cylinders, and the owner's name.
     */
    public String toString() {
        return ("Manufacturer: " + manufacturer + ", Cylinders: " + cylinders + ", Owner: " + getOwner());
    }
    
    /**
     * <p>
     * Compares a Vehicle's manufacturer, number of cylinders, and owner.
     * </p>
     * 
     * @param anObject An Object of any class
     * @return either false or true
     */
    public boolean equals (Object anObject) {
        if (anObject == null) {
            return false;   
        }
        if (getClass() != anObject.getClass()) {
            return false;
        }
        Vehicle anotherVehicle = (Vehicle) anObject;
        return (owner.equals(anotherVehicle.getPerson()) && getManufacturer().equals(anotherVehicle.getManufacturer()) && (getCylinders() == anotherVehicle.getCylinders()));
    }
}
