
/**
 * Elements.java - Stores elements information  
 * Author:     Adolfo Sanpedro Gante
 * Module:     3
 * Project:    Lab 3, Project #2
 *
 * Instance variables:
 *   String name - the official name of the element
 *   int  atomicNumber - the atomic number of the element
 *   boolean isNatural - whether the element occurs naturally or not
 *
 * Methods:
 *   No-Arg constructor
 *   Full constructor
 *   All getters and setters
 *   toString
 */
public class Element {
    // Set initial values for the three properties  
    private String name = "(unknown)" ;
    private int atomicNumber = 0 ;
    private boolean isNatural = true ;
    
    //Provides no-arg constructor and full constructors
    public Element (){
        
    }
    
    public Element(String newName, int newNumber, boolean newIsNatural) {
        name = newName;
        atomicNumber = newNumber;
        isNatural = newIsNatural;
    }
    
    //All getters
    public String getName(){
        return (name);
    }
    public int getAtomicNumber(){
        return (atomicNumber);
    }
    public boolean getIsNatural(){
        return (isNatural);
    }
    
    //All setters
    //setter prohibits negetive value for atomicNumber
    public void setName(String newName){
        name = newName;
    }
    public void setAtomicNumber(int newAtomicNumber){
        atomicNumber = newAtomicNumber;
    }
    public void setIsNatural(boolean newIsNatural){
        isNatural = newIsNatural;
    }
    
    //toString method returns a String with the elements name,atomicNumber
    // and whether or not its natural or synthetic
    public String toString() {
        return (name + " has atomic number " + atomicNumber + " and is "
                + (isNatural ? "natural." : "synthetic.") );
    }
}
