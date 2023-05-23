package PolviDyson_Project02;


import java.util.Scanner;
/**
 * The "testingClasses" class is where I create tests for the objects I have made, it is comprised of a method for testing the objects of each specific class
 */
public abstract class testingClasses {

    private static void personTesting() {
        Person person1 = new Person("Dyson", "Polvi");
        Person person2 = new Person(null, "White");
        Person person3 = new Person("Jesse", null);
        Person person4 = new Person(null, null);
        System.out.println("This should display the name \"Dyson Polvi\" with an ID of #0001");
        System.out.println(person1.toString());
        System.out.println("This should display the name \"Walter\" with an ID of #0002");
        System.out.println(person2.toString());
        System.out.println("This should display the name \"Pinkman\" with an ID of #0003");
        System.out.println(person3.toString());
        System.out.println("This should display no name with an ID of #0004");
        System.out.println(person4.toString());
    }
    
    private static void employeeTesting() {
        Employee employee1 = new Employee("Photographer", "Lotta", "Hart");
        Employee employee2 = new Employee("Police", null, "Byrde");
        Employee employee3 = new Employee("Security", "Larry", null);
        Employee employee4 = new Employee("Prison", null, null);
        System.out.println("This should display the name \"Lotta Hart\" with an ID of #0001");
        System.out.println(employee1.toString());
        System.out.println("This should display the name \"Byrde\" with an ID of #0002");
        System.out.println(employee2.toString());
        System.out.println("This should display the name \"Larry\" with an ID of #0003");
        System.out.println(employee3.toString());
        System.out.println("This should display no name with an ID of #0004");
        System.out.println(employee4.toString());
    }

    private static void nurseTesting() {
        Nurse nurse1 = new Nurse("Emergency", "Beverly", "Crusher");
        Nurse nurse2 = new Nurse("Human Resources", null, "McCoy");
        nurse2.setShift(1);
        Nurse nurse3 = new Nurse("Radiology", "Julian", null);
        nurse3.setShift(2);
        Nurse nurse4 = new Nurse("Dentistry", null, null);
        nurse4.setShift(3);
        System.out.println("This should display the name \"Beverly Crusher\" with an ID of #0001, a unit of \"Emergency\", and a shift of 1");
        System.out.println(nurse1.toString());
        System.out.println("This should display the name \"McCoy\" with an ID of #0002, a unit of \"Human Resources\", and a shift of 1");
        System.out.println(nurse2.toString());
        System.out.println("This should display the name \"Julian\" with an ID of #0003, a unit of \"Radiology\", and a shift of 2");
        System.out.println(nurse3.toString());
        System.out.println("This should display no name with an ID of #0004, a unit of \"Dentistry\", and a shift of 3");
        System.out.println(nurse4.toString());
    }

    private static void doctorTesting() {
        Doctor doctor1 = new Doctor("Oncology", "Neurology", "James", "Clear");
        Doctor doctor2 = new Doctor("Pediatry", "Family Practice", "Dale", null);
        Doctor doctor3 = new Doctor("Cardiology", "Surgery", null, "Gallwey");
        Doctor doctor4 = new Doctor("Emergency", "Operations", null, null);
        System.out.println("This should display the name \"James Clear\" with a prefix of Dr., an ID of #0001, and a specialty of \"Neurology\"");
        System.out.println(doctor1.toString());
        System.out.println("This should display the name \"Dale\" with a prefix of Dr., an ID of #0002, and a specialty of \"Family Practice\"");
        System.out.println(doctor2.toString());
        System.out.println("This should display the name \"Gallwey\" with a prefix of Dr., an ID of #0003, and a specialty of \"Surgery\"");
        System.out.println(doctor3.toString());
        System.out.println("This should display no name with a prefix of Dr., an ID of #0001, and a specialty of \"Operations\"");
        System.out.println(doctor4.toString());
    }
    
    private static void patientTesting() {
        Doctor doctor1 = new Doctor("Oncology", "Neurology", "James", "Clear");
        Doctor doctor2 = new Doctor("Pediatry", "Family Practice", "Dale", null);
        Doctor doctor3 = new Doctor("Cardiology", "Surgery", null, "Gallwey");
        Doctor doctor4 = new Doctor("Emergency", "Operations", null, null);
        Patient patient1 = new Patient("Diego", "Armando", doctor1);
        Patient patient2 = new Patient(null, "Fey", doctor2);
        Patient patient3 = new Patient("Miles", null, doctor3);
        Patient patient4 = new Patient(null, null, doctor4);
        System.out.println("This should display the name \"Diego Armando\" with an ID of #0005");
        System.out.println(patient1.toString());
        System.out.println("This should display the name \"Fey\" with an ID of #0006");
        System.out.println(patient2.toString());
        System.out.println("This should display the name \"Miles\" with an ID of #0007");
        System.out.println(patient3.toString());
        System.out.println("This should display no name with an ID of #0008");
        System.out.println(patient4.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 if you would like to run personTesting");
        System.out.println("Press 2 if you would like to run employeeTesting");
        System.out.println("Press 3 if you would like to run nurseTesting");
        System.out.println("Press 4 if you would like to run doctorTesting");
        System.out.println("Press 5 if you would like to run patientTesting");
        int userTestChoice = scanner.nextInt();
        while (userTestChoice > 5 || userTestChoice < 1) {
            System.out.println("Please enter a valid number");
            userTestChoice = scanner.nextInt();
        }
        if (userTestChoice == 1) {
            personTesting();
            System.out.println("--- You have reached the end of personTesting ---");
        } else if (userTestChoice == 2) {
            employeeTesting();
            System.out.println("--- You have reached the end of employeeTesting ---");
        } else if (userTestChoice == 3) {
            nurseTesting();
            System.out.println("--- You have reached the end of nurseTesting ---");
        } else if (userTestChoice == 4) {
            doctorTesting();
            System.out.println("--- You have reached the end of doctorTesting ---");
        } else if (userTestChoice == 5) {
            patientTesting();
            System.out.println("--- You have reached the end of patientTesting ---");
        } 
        scanner.close();
    }
}