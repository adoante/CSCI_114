
/**
 * DwarfPlanetTester.java - tests the Element Class with 4 elements
 * Author:     Adolfo Sanpedro Gante
 * Module:     3
 * Project:    Homework
 * Problem Statement: Create a class called DwarfPlanet with the following 
 *                    properties: name, discoverer, year of discovery,
 *                    average diameter in km, average distance from the sun in km
 *                
 *                    
 * Algorithm:
 *    1. Create dawrf planet objects using the DwarfOPlanet constructor
 *    2. Create all 5 dwarf planets in the givin table
 *    3. Create getters and setters
 *    4. Setters diameter and distance cannot be negative (set to 0 otherwise)
 *    5. Setter year of discovery must be between 1800 and 2100 (set to 1800 otherwise)
 *    6. Create a nicely formated columnar using printf formating methods
 */
public class DwarfPlanetTester
{
    public static void main(String[] args) {
        //creates new dwarf planets and stores information
        DwarfPlanet ceres = new  DwarfPlanet ("Ceres", "Piazzi", 1801, 952.4, 413700000);
        DwarfPlanet pluto = new DwarfPlanet ("Pluto", "Tombaugh", 1930, 2302.0, 5874000000L);
        DwarfPlanet haumea = new DwarfPlanet ("Haumea", "Brown", 2004, 1220.0, 6452000000L);
        DwarfPlanet makemake = new DwarfPlanet ("Makemake", "Brown", 2005, 1424.0, 6850000000L);
        DwarfPlanet eris = new DwarfPlanet ("Eris", "Brown", 2003, 2326.0, 10125000000L);
        
        //prints out all the information for all created dwarf planets
        System.out.println(ceres);
        System.out.println(pluto);
        System.out.println(haumea);
        System.out.println(makemake);
        System.out.println(eris);
        
        //prints a nicely-formated (columnar) report similar to the table above
        System.out.println("Name     Discovered by    Year     Diameter(km)     Distance(km)");
        System.out.println("-----   ---------------  ------   --------------   -------------");
        String format = ("%-10s %-8s %10d %14.2f %,18d %n");
        
        System.out.printf(format, ceres.getName(), ceres.getDiscoverer(), 
                                  ceres.getYearDiscovered(), ceres.getAvgDiameter(),
                                  ceres.getAvgDistance());
                                  
        System.out.printf(format, pluto.getName(), pluto.getDiscoverer(), 
                                  pluto.getYearDiscovered(), pluto.getAvgDiameter(),
                                  pluto.getAvgDistance());
                                  
        System.out.printf(format, haumea.getName(), haumea.getDiscoverer(), 
                                  haumea.getYearDiscovered(), haumea.getAvgDiameter(),
                                  haumea.getAvgDistance());
                                  
        System.out.printf(format, makemake.getName(), makemake.getDiscoverer(), 
                                  makemake.getYearDiscovered(), makemake.getAvgDiameter(),
                                  makemake.getAvgDistance());
                                  
        System.out.printf(format, eris.getName(), eris.getDiscoverer(), 
                                  eris.getYearDiscovered(), eris.getAvgDiameter(),
                                  eris.getAvgDistance());
    }
}
