
/**
 * Transportation.java: Tests the methods in the Parent class Person, Child class Vehicle, and grandchild class Truck.
 * 
 * <p>
 * <b>Problem Statement</b>:<br/ b> Test your program by showing how each method in each class is used.
 * </p>
 * 
 * <p>
 * <b>Algorithum</b>:
 *    <ol>
 *         <li> Create a Person object. </li>
 *         <li> Use all methods in the Person class. </li>
 *         <li> Create a Vehicle object. </li>
 *         <li> Use all methods in the Vehicle class. </li>
 *         <li> Create a Truck Object. </li>
 *         <li> Use all methods in the Truck class </li>
 *    </ol>
 * </p>
 * 
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 11, Homework #2
 */
public class Transportation
{
    public static void main(String[] args) {
        //Tests the methods in Person class
        System.out.println("--- Person Class Methods ---");
        Person daBaby = new Person();
        daBaby.setName("Da Baby");
        System.out.println("Using getName() Method  -- " + daBaby.getName());
        System.out.println("Using toString() method -- " + daBaby);
        System.out.println("Using equals() Method   -- " + daBaby.equals(daBaby));
        
        System.out.println();
        System.out.println("--- Vehicle Class Methods ---");
        //Tests the methods in Vehicle class
        Vehicle car = new Vehicle();
        car.setOwner(daBaby);
        car.setCylinders(6);
        car.setManufacturer("Bruh");
        System.out.println("Using getOwner() Method         -- " + car.getOwner());
        System.out.println("Using getCylinders() Method     -- " + car.getCylinders());
        System.out.println("Using getManufacturer() Method  -- " + car.getManufacturer());
        System.out.println("Using toString() Method         -- " + car);
        System.out.println("Using equals() Method           -- " + car.equals(car));
        
        System.out.println();
        System.out.println("--- Truck Class Methods ---");
        //Tests the methods in Vehicle class
        Truck cyber = new Truck();
        cyber.setLoad(3.0);
        cyber.setTow(5.0);
        System.out.println("Using getLoad() Method  -- " + cyber.getLoad());
        System.out.println("Using getTow() Method   -- " + cyber.getTow());
        cyber.setVehicle(car);
        System.out.println("Using toString() Method -- " + cyber);
        System.out.println("Using equals() Method   -- " + cyber.equals(cyber));
        
    }
}
