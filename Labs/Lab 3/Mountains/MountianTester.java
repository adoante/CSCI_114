
/**
 * MountainTester.java - Test the Mountain class with 6 summits
 * Author:     Adolfo Sanpedro Gante
 * Module:     3
 * Project:    Lab
 * Problem Statement:  Create a Mountain class which tracks the  
 *    mountain's name, the continent with the mountain, and the
 *    elevation at its peak (in feet).  Create 6 Mountain objects  
 *    for the largest mountain on each continent and display.
 *
 * Algorithm:
 *   1. Create Mountain objects for each of the tallest mountain
 *      summits using a constructor.  Use incorrect data for
 *      Aconcagua.
 *
 *         --Continent--    -----Name---  Elevation
 *         North America    Denali           20,310
 *         South America    Aconcagua        22,831
 *         Africa           Kilimanjaro      19,340
 *         Europe        Mt. Elbrus       18,510
 *         Asia             Mt. Everest      29,035
 *         Australia        Kosciuszko        7,310
 *
 *   2.  Use toString to display the values for all six mountains
 *   3.  Use setters to correct the values for Aconcagua
 *   4.  Use getters to display the corrected values
 */
public class MountianTester
{
    public static void main(String[] args) {
        //Creates a mountain object for each mountain
        Mountain denali = new Mountain("Denali", "North America", 20310);
        Mountain aconcagua = new Mountain("Aconcagua", "Mars", -500);
        Mountain kilimanjaro = new Mountain("Kilimanjaro", "Africa", 19340);
        Mountain elbrus = new Mountain("Mt. Elbrus", "Europe", 18510);
        Mountain everest = new Mountain("Mt. Everest", "Asia", 29035);
        Mountain kosciuszko = new Mountain("Kosciuszko", "Australia", 7310);
        
        // Prints the mountains information using 
        //the Mountains Class toString Method
        System.out.println(denali.toString());
        System.out.println(aconcagua);
        System.out.println(kilimanjaro);
        System.out.println(elbrus);
        System.out.println(everest);
        System.out.println(kosciuszko);
        
        //Correct the values for Aconcagua
        aconcagua.setContinent("South Africa");
        aconcagua.setElevation(-22821);
        
        System.out.println("The new value of " + aconcagua.getName()
                            + " in " + aconcagua.getContinent()
                            + " is " + aconcagua.getElevation() + " feet.");
    }
}