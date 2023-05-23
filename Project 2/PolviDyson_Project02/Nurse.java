package PolviDyson_Project02;

/**
 * The "Nurse" class is a subclass of Employee, which is a subclass of Person. It creates 3 different shifts and sets yearly incomes to each of them, assings that shift to a general shift variable
 */
public class Nurse extends Employee {

    public static int SHIFT_A = 1;
    public static int SHIFT_B = 2;
    public static int SHIFT_C = 3;
    private int shift;
    public static int nurseTotalSalary;

    /**
     * constructs a Nurse, assigns a first and last name from Employee then from Person
     * @param unit place of work, inherited from Employee
     * @param givenName first name, inherited from Employee then Person
     * @param surname last name, inherited from Employee then Person
     */
    public Nurse(String unit, String givenName, String surname) {
        super.unit = unit; 
        super.givenName = givenName;
        super.surname = surname;
        setShift(SHIFT_A);
        nurseTotalSalary += annualSalary; 
    }

    /**
     * sets the general shift variable to the Nurse's alphabetical shift, then assigns an income to each shift
     * @param shift the general shift that is assigned to a Nurse, represented by int 1 2 or 3
     */
    public void setShift(int shift) {
        if (shift == 1) {
            this.shift = SHIFT_A;
            super.annualSalary = 80000;
        } else if (shift == 2) {
            this.shift = SHIFT_B;
            super.annualSalary = 85000;
        } else if (shift == 3) {
            this.shift = SHIFT_C;
            super.annualSalary = 90000;
        }
    }

    /**
     * returns the shift of the Nurse, which is set in the setShift method
     * @return shift, gets set to A, B, or C
     */
    public int getShift() {
        return this.shift;
    }

    /**
     * Nurse toString calls the superclass toString and adds the place of work (unit), and the assigned shift
     */
    @Override
    public String toString() {
        String nurseString = String.format("%s (%s, shift %s)", super.toString(), this.unit, getShift());
        return nurseString;
    }
}
