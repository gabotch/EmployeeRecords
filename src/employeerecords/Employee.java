/*
 * Employee
 * Constructs the employee object
 * Gabrielle Otchet 
 * May 2, 2023
 * Last updated: May 8, 2023
 */

package employeerecords;

public class Employee {
    String employeeIdNumber, firstName, lastName, annualSalary, startDate;//strings to assign the employee oject properties
    
public Employee(String _employeeIdNumber, String _firstName, String _lastName, String _annualSalary, String _startDate){
    //employee object constructor 
    employeeIdNumber = _employeeIdNumber;
    firstName = _firstName;
    lastName = _lastName;
    annualSalary = _annualSalary;
    startDate = _startDate;
}
}
