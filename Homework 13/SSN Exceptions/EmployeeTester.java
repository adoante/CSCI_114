import java.util.Scanner;
import java.util.ArrayList;

/**
 * EmployeeTester.java: Tests the methods in the Employee Class.
 * <p>
 * <b>Problem Statement</b>:<br /> Write a program to enter employee data into an array, including each employee’s name,
 *                                 Social Security number, and salary.  The maximum number of employees is 100, but your
 *                                 program should work with any number of employees less than 100.
 * </p>
 * <p>
 * <b>Algorithm</b>:
 *    <ol>
 *        <li> Create instance variables for Employee, Person, and Date Objects. </li>
 *        <li> Create an instance variable for the running total of all salaries. </li>
 *        <li> Create an Array of 100 Employee Objects. </li>
 *        <li> Import Scanner and create a scanner to get user input. </li>
 *        <li> Ask for an Employee's name. </li>
 *        <li> Ask for an Employee's Birthdate. The format must be Month, day and year with no commas. (Ex, May 2 2001) </li>
 *        <li> Save the birthdate into a Date object. </li>
 *        <li> Using the name and Date object create a Person Object. Assume that the Person is alive. <code>deathDate = null;</code> </li>
 *        <li> Ask for a vaild Social Security Number (is 9 characters & is only integer digits). </li>
 *        <li> If userInput is invalid throw either SSNLengthException or SSNCharacterException accordingly. Loop untill a valid SSN is entered. </li>
 *        <li> Ask for a valid yearly salary (is only integer digits & is not negitive). </li>
 *        <li> If userInput is invalid throw either IllegalArgumentException or NumberFormatException accordingly. </li>
 *        <li> Next using the Person Object, SSN, and Salary create an Employee Object and add it to the array created earlier. </li>
 *        <li> Update the <code>cnt</code> variable. </li>
 *        <li> If the user enters 'X' or 'x' while being asked for a name exit the program and print the array in a report. </li>
 *    </ol>
 * </p>
 * @author Adolfo Sanpedro Gante
 * @version Module 13, Homework Project 3
 */

public class EmployeeTester {

    public static void main(String[] args) {
        //Instance variables.
        Employee worker;                //This Employee Obejct wiill be used to write all Employee's in an array.
        Person person;                  //This Person Object will be used to help write all Employee's in an array.
        Date birthDate;                 //This Date Object will hold a Person/Employee's birthdate.
        int totalSalary = 0;            //The running total salary for all employee's.
        int cnt = 0;                    //Count used to update ArrayList index.
        String ssn = " ";               //Initializes SSN outside of where the Scanner asks for SSN b/c of scope.
        String salary = " ";            //Initializes Salary outside of where Scanner ask for Salary b/c of scope.

        //An array of 100 employee objects.
        ArrayList<Employee> crew = new ArrayList<Employee>(100);

        //Loops untill user inputs 'x' as an employee's name.
        while (true) {
            //Creates new Scanner object to get user input.
            Scanner userInput = new Scanner(System.in);

            //Gets employee's name from user.
            System.out.println("Entering info for Employee: #" + (cnt+1));
            System.out.printf("Enter employee name (or X to finish): ");
            String name = userInput.nextLine();

            //Exits the while loop
            if(name.equalsIgnoreCase("X")) {
                break;
            }

            //Gets employee's birth date from user.
            System.out.printf("Enter month name, day, year (no commas): ");
            String date = userInput.nextLine();
            birthDate = formatDate(date);

            //Sets persons name, birthDate, and deathDate (assumes deathDate is null).
            person = new Person (name, birthDate, null);

            //Gets an employee's Social Security number.
            //Loops utill a valid (is 9 characters & is only integer digits) SSN is entered.
            while (true) {
                //Try statement asks for a vaild SSN
                //If userInput is more or less than 9 characters, SSNLengthException is thrown
                //If userInput is anything but integer digits, SSNCharacterException is thrown
                try {
                    //Asks for a SSN
                    System.out.printf("Enter 9-digit SSN: ");
                    ssn = userInput.nextLine();

                    //String is parse to Int which can throw a NumberFormatException
                    //If NumberFormatException is thrown isNum = false;
                    //isNum used to check if userInput is only integers
                    boolean isNum = true;
                    try {
                        Integer ssnNum = Integer.parseInt(ssn);
                    }
                    catch (NumberFormatException e){
                        isNum = false;
                    }
                    if (!isNum) {
                        isNum = true;
                        throw new SSNCharacterException();
                    }

                    //Throws SSNLengthException if length does not equal exactly 9 characters
                    if (ssn.length() != 9) {
                        throw new SSNLengthException();
                    }

                    //Breaks out of loop if a valid SSN is entered.
                    if (ssn.length() == 9 && isNum){
                        break;
                    }
                }
                catch (SSNCharacterException e) {
                    System.out.println(e.getMessage());
                }
                catch (SSNLengthException e) {
                    System.out.println(e.getMessage());
                }
            }

            //Gets an employee's Salary from user.
            //Loops untill a vaild salary number (is only integer digits & is not negitive) is entered
            while (true) {
                //Try statement ask for valid salary
                //If userInput is anything other than integer digits, NumberFormatException is thrown
                //If userInput is negitive, IllegalArgumentException is thrown
                try {
                    //Asks for salary
                    System.out.printf("Enter employee's salary (no commas): ");
                    salary = userInput.nextLine();
                    //salary is parse to int which can throw NumberFormatException
                    Integer salaryNum = Integer.parseInt(salary);

                    //If salary is less than 0 aka negitive IllegalArgumentException is thrown
                    //Else update totalSalary and break out of Loop\
                    if (salaryNum < 0) {
                        throw new IllegalArgumentException("Salary cannot be negitive.");
                    }
                    else {
                        totalSalary += salaryNum;
                        break;
                    }
                }
                catch (NumberFormatException e) {
                    System.out.println("No commas and must be integer digits.");
                }
                catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            //Sets Employee Object worker's Person, SSN, and Salary.
            worker = new Employee(person, ssn, salary);

            //Adds worker to crew
            crew.add(cnt, worker);

            //Updates crew index for next worker
            cnt++;
        }

        //Prints out crew employee's in a nicely formated report
        System.out.println();
        employeeReport(crew, totalSalary);

    }

    /**
     * Prints a nicely formated report of Employee's Name, SSN, Birthdate, Salary, and if thier salary is over or under the avgerage salary
     * @param anArray     An array of Employee Objects
     * @param totalSalary The total salary of all employee's,
     */
    public static void employeeReport(ArrayList<Employee> anArray, int totalSalary) {
        //Calculates the avg salary
        int avgSalary = 0;
        if (totalSalary == 0) {
          System.out.println("NO EMPLOYEE'S WHERE ENTERD.");
        }
        else {
          avgSalary = totalSalary / anArray.size();
          //Top portion of the report
          System.out.println("The average salary is $" + avgSalary);
          System.out.println("No.       Employee-Name          SSN           Birth-date             Salary       to Avg");
          System.out.println("---   ---------------------   ---------   --------------------    ----------       ------");

          //Variable to update the "No." portion of the report
          int index = 1;

          //Trims the array to size to avoid NullPointerException
          anArray.trimToSize();

          //For Each loops through the array and prints
          //Employee's Name, SSN, Birthdate, Salary, and if thier salary is over or under the avgerage salary
          for (Employee i : anArray) {
              Integer salaryFormat = Integer.parseInt(i.getSalary());
              System.out.printf("%3d   %-23s %s   %-23s %,10d       %s\n", index,  i.getName(), i.getSSN(),
                                i.getBirthDate(), salaryFormat, OverUnder(salaryFormat, avgSalary));
              index++;
          }
        }
    }

    /**
     * Determines if an employee salary is over or under the avgerage salary amount
     * @param  salary    the employee's salary
     * @param  avgSalary the avg salary
     * @return           over, under, or Equal to Avg
     */
    public static String OverUnder(int salary, int avgSalary) {
        if (salary > avgSalary){
            return ("Over");
        }
        else if (salary < avgSalary){
            return ("Under");
        }
        return ("Equal to Avg");
    }
    /**
     * Helper method to get the Month, Day, and Year in a single line of userInput
     * @param  date the birthDate in a single line of userInput
     * @return      a Date object containing an employee's birthdate
     */
    public static Date formatDate(String date) {
        //Splits the String at space
        String splitted[] = date.split("\\s+");
        //Parse the day portion to an int
        int day = Integer.parseInt(splitted[1]);
        //Parse the year portion to an int
        int year = Integer.parseInt(splitted[2]);
        //Creates a new Date object containing the above variables respectively
        Date birthDate = new Date(splitted[0], day, year);
        return(birthDate);
    }

}
