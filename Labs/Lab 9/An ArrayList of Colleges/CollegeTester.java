import java.util.ArrayList;

/**
 * CollegeTester.java: Tests ArrayList methods using the College class.
 *
 * @author Adolfo Sanpedro Gante
 * @version Lab, Module 9
 */
public class CollegeTester
{
    public static void main(String [] args) {
        //Creates 6 College Objects
        College Palomar = new College("Palomar", "San Marcos", 26000, 1943);
        College MiraCosta = new College("MiraCosta", "Oceanside ", 19000, 1943);
        College Grossmont = new College("Grossmont", "El Cajon", 18000, 1968);
        College Saddleback = new College("Saddleback", "Mission Viejo", 26000, 1943);
        College Mesa = new College("Mesa", "San Diego", 25000, 1958);
        College Southwestern = new College("Southwestern", "Chula Vista", 27000, 1961);

        //Creates an ArrayList of type College with initial size of 3 capacity 0
        ArrayList<College> schoolList = new ArrayList<College>(3);

        //Adds three College objects to schoolList ArrayList
        schoolList.add(Palomar);
        schoolList.add(MiraCosta);
        schoolList.add(Grossmont);

        //Adds 2 College objects to schoolList ArrayList to specific elements moving up the values in those elements
        schoolList.add(1, Saddleback);
        schoolList.add(2, Mesa);

        //Prints Colleges name,city,students and date est. in a neat report
        showSchools(schoolList);
        System.out.println();

        //Replaces Grossmont object in schoolList with Southwesetern object
        int gorssmontIndex = schoolList.indexOf(Grossmont);
        schoolList.set(gorssmontIndex, Southwestern);

        //Removes MiraCosta and Saddleback from schoolList
        schoolList.remove(MiraCosta);
        schoolList.remove(Saddleback);

        //Prints Colleges name,city,students and date est. in a neat report
        showSchools(schoolList);

        //Invokes the toString method to print schoolList arrayList elements
        System.out.println();
        System.out.println(schoolList);
        System.out.println();

        //clears the values form schoolList and trims the arrayList size down to capacity
        schoolList.clear();
        schoolList.trimToSize();

        //Prints Colleges name,city,students and date est. in a neat report
        showSchools(schoolList);

    }

    //Prints the contents of an ArrayList of type College in a neat report
    private static void showSchools(ArrayList<College> list){
        System.out.printf("College      City            Students      Date Est.\n");
        System.out.printf("--------     -------         ----------    ----------\n");
        for (College school : list ){
            System.out.printf("%-12s %-15s %,d %11d", school.getName(), school.getCity(), school.getStudents(), school.getEstablished());
            System.out.println();
        }
        System.out.println();
        System.out.println("Number of Colleges: " + list.size());
    }
}
