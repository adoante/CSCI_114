/**
 * Employee.java: Records an Employee's name, birthdate, social Security number, and yearly salary.
 * 
 * @author Adolfo Sanpedro Gante
 * @version Module 13, Homework Project 3
*/
public class Employee {

  //Instance variables
  private String ssn = " ";          // Social Security Number
  private String salary = " ";         // Yearly Salary
  private Person person;          // Person Object

  /**
   * Full constructor sets all three instance variables
   * @param person Person Object with a Name, BirthDate and DeathDate
   * @param ssn     Social Security Number
   * @param salary  yearly salary
   */
  public Employee(Person person, String ssn, String salary) {
    this.ssn = ssn;
    this.salary = salary;
    this.person = new Person (person);
  }

  //Setters
  /**
   * Sets an Employee's Objects Social Security Number
   * @param ssn Social Security Number
   */
  public void setSSN(String ssn) {
    this.ssn = ssn;
  }
  /**
   * Sets an Employee's yearly salary
   * @param salary Yearly Salary
   */
  public void setSalary(String salary) {
    this.salary = salary;
  }

  /**
   * Sets an Employee's Person Obejct. The Person Object hold the Employee's
   * name, birth date and death date
   * @param person A Person Object
   */
  public void setPerson(Person person) {
    this.person = new Person (person);
  }

  //Getters
  /**
   * Gets an Employee's Social Security Number
   * @return Social Security Number
   */
  public String getSSN() {
    return this.ssn;
  }
  /**
   * Gets an Employee's yearly salary
   * @return yearly salary
   */
  public String getSalary() {
    return this.salary;
  }
  /**
   * Gets an Employee's Person
   * @return Name, birthdate, and/or deathdate
   */
  public String getPerson() {
    return this.person.toString();
  }
  /**
   * Gets an Employee's name
   * @return employee's name
   */
  public String getName() {
    return this.person.getName();
  }
/**
 * Gets an Employee's brithdate
 * @return employee's birhtdate
 */
  public Date getBirthDate() {
    return this.person.getBirthDate();
  }

  /**
   * Prints an Employee's Name, Birthdate, SSN, and Salary
   * @return employee's name, birthdate, ssn, and salary
   */
  public String toString() {
    return (person + " SSN: " + ssn + ", Salary: " + salary);
  }

  /**
   * Compares two Employee Objects
   * @param  anObject an Object of any type
   * @return          true or false
   */
  public boolean equals(Object anObject) {
      if (anObject == null || getClass() != anObject.getClass()) {
          return false ;
      }
      Employee otherEmployee = (Employee) anObject ;
      return (person.equals(otherEmployee) &&
              ssn == otherEmployee.getSSN() &&
              salary == otherEmployee.getSalary()) ;
  }

}
