
/**
 * Tests the methods in the superClass Animal and subClasses Owl/Frog
 * <p>
 * <b>Alogrithm</b>:
 *    <ol>
 *         <li> Create an Animal object with a name “Oscar” </li>
 *         <li> Create a Owl object with a name “Errol” and a breed “Great Grey” </li>
 *         <li> Create a Frog object with a name “Kermit” </li>
 *         <li> Uses the toString method to print Oscar, Errol, and Kermit </li>
 *         <li> Cause Oscar, Errol, and Kermit each to make a noise </li>
 *         <li> Cause Oscar, Errol, and Kermit each to go to sleep </li>
 *    </ol>
 * </p>
 * 
 * <p>
 * <b>Lab Questions</b>:
 *    <ol>
 *         <li> The base class name is Animal. </li>
 *         <li> The derived class names are Frog and Owl. </li>
 *         <li> The Animal class like all classes are decendents of the Object class. </li>
 *         <li> The toString method is overridden. The makeNoise method is overridden. The sleep method is
 *              not overridden. </li>
 *         <li> It doesn't make sense because ones a frog and the other is an animal but it will work. </li>
 *         <li> I must override the equals method in hte Owl class beacuse Owl has a second parameter, breed,
 *              that needs to be compared. </li>
 *         <li> Yes, I can. It comes out to false. </li>
 *         <li> I don't believe any of my classes belong to a package. </li>
 *         <li> No, I wouldn't necessarily need getters or setters to access them. </li>
 *    </ol>
 * </p>
 * 
 * @author Adolfo Sanpedro Gante
 * @version Module 11, Lab
 */
public class Lab11
{
    public static void main(String[] args) {
        //Creates three objects of Animal,Owl, and Frog
        Animal oscar = new Animal("Oscar");
        Animal errol = new Owl("Errol", "Great Grey");
        Frog kermit = new Frog("Kermit");
        
        System.out.println();
        //Prints out name for all three objects
        //Also prints breed for errol
        System.out.println(oscar);
        System.out.println(errol);
        System.out.println(kermit);
        
        System.out.println();
        //Prints a noise for all three
        System.out.println(oscar.makeNoise());
        System.out.println(errol.makeNoise());
        System.out.println(kermit.makeNoise());
        
        System.out.println();
        //Puts all three to sleep
        System.out.println(oscar.sleep());
        System.out.println(errol.sleep());
        System.out.println(kermit.sleep());
        
        System.out.println(oscar.equals(errol));
    }
}
