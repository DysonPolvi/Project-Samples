package PolviDyson_Project02;

/**
 * The "Person" class allows a person to have a unique identifier (in case two people have the same names), a first name, and a last name. The count variable is used because each ID needs to be unique, and it was not allowed to be static. 
 */
public class Person {

    static int count;
    public final int ID;
    public String givenName;
    public String surname;

    /**
     * Constructs a person, increments count and assigns the value to ID 
     */
    public Person() {
        this.ID = ++count;
    }

    /**
     * Constructs a person with a first and last name, increments count and assigns the value to ID 
     * @param givenName first name 
     * @param surname last name
     */
    public Person(String givenName, String surname) {
        this.givenName = givenName;
        this.surname = surname;
        this.ID = ++count;
    }

    /**
     * Prints the first name, last name, and ID of a person depending on which constructor was called, and prints leaves out first or last name if they were not entered
     */
    public String toString() {
        if ((givenName == null) && (surname == null)) {
            String personString = String.format("(#ID %04d)", ID);
            return personString;
        } else if (givenName == null) {
            String personString = String.format("%s (#ID %04d)", surname, ID);
            return personString;
        } else if (surname == null) {
            String personString = String.format("%s (#ID %04d)", givenName, ID);
            return personString;
        } else {
            String personString = String.format("%s %s (#ID %04d)", givenName, surname, ID);
            return personString;
        }
    }
}