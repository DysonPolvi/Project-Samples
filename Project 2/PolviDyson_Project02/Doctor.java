package PolviDyson_Project02;

/**
 * The "Doctor" class is a subclass of Employee, which is a subcalss of Person. It creates a Doctor object with a department of work, a special field of medicine, first and last names inherited from Person, and sets the Doctors yearly income to $250,000. Also tracks how many patients have been assigned to each doctor with the numerical "hasDoctor#" variables
 */
public class Doctor extends Employee {
    
    public String specialty;
    public static int doctorTotalSalary;
    static int hasDoctor1 = 0;
    static int hasDoctor2 = 0;
    static int hasDoctor3 = 0;

    /**
     * constructs a Doctor with work field, a work area inherited from Employee, a firstname and lastname from Employee, which inherits them from Person
     * @param unit location of work, inherited from Employee
     * @param specialty field of work
     * @param givenName first name, inherited from Employee then Person
     * @param surname last name, inherited from Employee then Person
     */
    public Doctor(String unit, String specialty, String givenName, String surname) {
        super.unit = unit;
        this.specialty = specialty;
        super.givenName = givenName;
        super.surname = surname;
        super.annualSalary = 250000;
        doctorTotalSalary += annualSalary;
    }

    /**
     * Overrides toString from Employee, prefixes the output with a Dr. honorific, and adds the specific field of work - removes the Dr. prefix if both names are null
     */
    @Override
    public String toString() {
        if (super.givenName == null && super.surname == null) {
            String doctorString = String.format("%s (%s)", super.toString(), specialty);
            return doctorString;
        } else { String doctorString = String.format("Dr. %s (%s)", super.toString(), specialty);
        return doctorString; }
    }
}
