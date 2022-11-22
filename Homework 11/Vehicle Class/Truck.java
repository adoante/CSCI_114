
/**
 * Truck.java: Creates a Truck with load capacity, towing capacity.
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 11, Homework #2
 */
public class Truck extends Vehicle
{
    //Instance Variables
    private double loadCapacity = 0.0;
    private double towCapacity = 0.0;
    private Vehicle truck;

    /**
     * <p>
     * No args Truck Constructor.
     * </p>
     */
    public Truck() {

    }

    /**
     * <p>
     * Creates a Truck with Vehicle properites, load capacity, and towing capacity.
     * </p>
     * 
     * @param truck Vehicle properites (manufacturer,cylinders,owner)
     * @param load The Load Capacity of the Truck
     * @param tow The Tow Capacity of the Truck
     */
    public Truck(Vehicle truck, double load, double tow){
        super();
        this.loadCapacity = load;
        this.towCapacity = tow;
        this.truck = truck;
    }

    /**
     * <p>
     * Mutates the load capacity of a Truck
     * </p>
     * 
     * @param load The new load capacity for a Truck
     */
    public void setLoad(double load) {
        this.loadCapacity = load;
    }

    /**
     * <p>
     * Mutates the tow capacity of a Truck
     * </p>
     * 
     * @param tow The new tow capacity for a Truck
     */
    public void setTow(double tow) {
        this.towCapacity = tow;   
    }

    /**
     * <p>
     * Accesses the load capacity of a Truck
     * </p>
     * 
     * @return The load capacity for a Truck
     */
    public double getLoad() {
        return (loadCapacity);
    }

    /**
     * <p>
     * Accesses the tow capacity of a Truck
     * </p>
     * 
     * @return The tow capacity for a Truck
     */
    public double getTow() {
        return (towCapacity);   
    }

    /**
     * <p>
     * Mutates the Truck's vehicle propertires
     * </p>
     * 
     * @param truck New Truck's vehicle propertires
     */
    public void setVehicle(Vehicle truck) {
        this.truck = truck;
    }

    private Vehicle getVehicle() {
        return (truck);
    }

    /**
     * <p>
     * Prints the Truck Manufactuer's name, the number of cylinders, the owner's name, tow capcity, and load capacity.
     * </p>
     * 
     * @return The Truck Manufactuer's name, the number of cylinders, the owner's name, tow capcity, and load capacity.
     */
    public String toString() {
        return ("Manufacturer: " + truck.getManufacturer() + ", Cylinders: " + truck.getCylinders() + ", Owner: " + truck.getOwner() + ", Tow Capcity: " + towCapacity + ", Load Capcity: " + loadCapacity);
    }

    /**
     * <p>
     * Compares a Truck's manufacturer, number of cylinders, the owner's name, tow capcity, and load capacity.
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
        Truck anotherTruck = (Truck) anObject;
        return (truck.equals(anotherTruck.getVehicle()) && towCapacity == anotherTruck.getTow() && loadCapacity == anotherTruck.getLoad());
    }
}

