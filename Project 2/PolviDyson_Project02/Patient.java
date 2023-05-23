package PolviDyson_Project02;

/**
 * The "Patient" class is a subclass of Person, inherits the first and last names, and also assigns a Doctor object to the patient
 */
public class Patient extends Person{
   
    public Doctor physician;

    /**
     * Constructs a Patient, assigns it a first name and last name inherited from person, as well as a doctor object
     * @param givenName first name of the patient   
     * @param surname last name of the patient
     * @param physician doctor assigned to the patient
     */
    public Patient(String givenName, String surname, Doctor physician) {
        super.givenName = givenName;
        super.surname = surname;
        this.physician = physician;
    }
}
