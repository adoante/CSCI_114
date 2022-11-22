
/**
 * Mountain.java - Describes the highest mountain on a continent  
 * Author:     Adolfo Sanpedro Gante
 * Module:     3
 * Project:    Lab
 *
 * Instance variables:
 *   String name - the official name of the mountain
 *   String continent - the continent of the mountain
 *   int elevation - the elevation of the summit (in feet)
 *
 * Methods:
 *   Full constructor
 *   All getters and setters
 *   toString
 */
public class Mountain
{
    // Instance Variables
    private String name = " ";
    private String continent = " ";
    private int elevation = 0;

    //Constructors set the values of 3 instance variables.
    public Mountain(String newName, String newContinent, int newElevation) {
        name = newName;
        continent = newContinent;
        elevation = newElevation;
    }

    //All setters
    public void setName(String newName){
        name = newName;
    }

    public void setContinent(String newContinent){
        continent = newContinent;
    }

    public void setElevation(int newElevation){
        if (newElevation < 0){
            elevation = newElevation * -1;
        }
        else {
            elevation = newElevation;
        }
    }

    //All getters
    public String getName() {
        return (name);
    }
    public String getContinent() {
        return (continent);
    }
    public int getElevation() {
        return (elevation);
    }
    
    //return String with mountains name, continent and elevation (ft)
    public String toString(){
        return (name + " is the highest mountain in " + continent
            + " at " + elevation + " feet.");
    }
}

