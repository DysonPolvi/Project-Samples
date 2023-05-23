package PolviDyson_Project02;

/**
 * The "Employee" class is a subclass of the Person class which creates an employee with a first name and last name inherited from Person, as well as adding a unit which represents the place of work, and an annualSalary which represents the income per calendar year
 */
public class Employee extends Person {

    public String unit;
    protected int annualSalary;

    /**
     * Constructs an employee with an inherited first name, and inherited last name
     */
    public Employee() {
        super.givenName = givenName;
        super.surname = surname;
    }
    
    /**
     * Constructs an employee with an inherited first name, and inherited last name, and place of work
     * @param unit department or area where the Employee works
     * @param givenName first name of the Employee, and is inherited from Person 
     * @param surname last name of the Employee, and is inherited from Person
     */
    public Employee(String unit, String givenName, String surname) {
        super.givenName = givenName;
        super.surname = surname;
        this.unit = unit;
    }
    
    /**
     * returns the yearly income of the Employee 
     * @return yearly income
     */
    public int getAnnualSalary() {
        return this.annualSalary;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
