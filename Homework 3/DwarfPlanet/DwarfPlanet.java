
/**
 * DwarfPlanet.java - Describes the highest mountain on a continent  
 * Author:     Adolfo Sanpedro Gante
 * Module:     3
 * Project:    Homework
 *
 * Instance variables:
 *   String name - the official name of the dwarf planet
 *   String discover - the discover of said dwarf planet
 *   int yearDiscovered - the year the dwarf planet was discovered
 *   double avgDiameter - the average diameter in km of the dwarf planet
 *   long average distance - the average distance away from the sun in km
 *
 * Methods:
 *   Full constructor
 *   All getters and setters
 *   toString
 */
public class DwarfPlanet
{
    //Instance Variables
    private String name = " ";
    private String discoverer = " ";
    private int yearDiscovered = 0;
    private double avgDiameter = 0.0;
    private long avgDistance = 0;

    //Constructors
    public DwarfPlanet() {

    }

    public DwarfPlanet(String newName,String newDiscoverer, int newYear,
    double newAvgDiameter, long newAvgDistance) {
        name = newName;
        discoverer = newDiscoverer;
        yearDiscovered = newYear;
        avgDiameter = newAvgDiameter;
        avgDistance = newAvgDistance;
    }

    //All getters
    public String getName() {
        return (name);
    }

    public String getDiscoverer() {
        return (discoverer);   
    }

    public int getYearDiscovered() {
        return (yearDiscovered);   
    }

    public double getAvgDiameter() {
        return (avgDiameter);   
    }

    public long getAvgDistance() {
        return (avgDistance);   
    }

    //All setters
    public void setName(String newName) {
        name = newName;
    }

    public void setDiscoverer(String newDiscoverer) {
        discoverer = newDiscoverer;   
    }

    public void setYearDiscovered(int newYear) {
        if (newYear > 2100 || newYear < 1800) {
            yearDiscovered = 1800;
        }
        else {
            yearDiscovered = newYear;
        }
    }

    public void setAvgDiameter(double newAvgDiameter) {
        if (newAvgDiameter < 0) {
            avgDiameter = 0;
        }
        else {
            avgDiameter = newAvgDiameter;   
        }
    }

    public void setAvgDistance(long newAvgDistance) {
        if (newAvgDistance < 0) {
            avgDistance = 0;
        }
        else {
            avgDistance = newAvgDistance;   
        }   
    }
    
    //prints the dwarf planets info 
    public String toString() {
        return ("The dwarf planet " + name + " discovered by " + discoverer + " in the year "
                + yearDiscovered + " had a diameter of " + avgDiameter + " (km) with a distance of "
                + avgDistance + "(km) away from the sun.");
    }

}
