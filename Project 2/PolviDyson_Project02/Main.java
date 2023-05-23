package PolviDyson_Project02;

/**
 * The "Main" class contains the main method, as well as a method which generates 20 randomly named patients, with randomly assigned doctors
 */
public class Main {

    public static void main(String[] args) {

        //creates 3 Doctor instances
        Doctor doctor1 = new Doctor("Oncology", "Neurology", "James", "Clear");
        System.out.println(doctor1.toString());
        Doctor doctor2 = new Doctor("Pediatry", "Family Practice", "Dale", "Carnegie");
        System.out.println(doctor2.toString());
        Doctor doctor3 = new Doctor("Cardiology", "Surgery", "Timmothy", "Gallwey");
        System.out.println(doctor3.toString());
        //displays total Doctor cost
        System.out.println("The total annual cost to employ all doctors is: $" + Doctor.doctorTotalSalary);

        //creates an array of the 3 above doctor instances
        Doctor[] doctorArray = {doctor1, doctor2, doctor3};

        //creates 3 Nurse instances all assigned to different shifts
        Nurse nurse1 = new Nurse("Emergency", "Beverly", "Crusher");
        nurse1.setShift(1);
        System.out.println(nurse1.toString());
        Nurse nurse2 = new Nurse("Human Resources", "Leonard", "McCoy");
        nurse2.setShift(2);
        System.out.println(nurse2.toString());
        Nurse nurse3 = new Nurse("Radiology", "Julian", "Bashir");
        nurse3.setShift(3);
        System.out.println(nurse3.toString());
        //displays total Nurse cost
        System.out.println("The total annual cost to employ all nurses is: $" + Nurse.nurseTotalSalary);

        //creates 3 Patient instances
        Patient patient1 = new Patient("Diego", "Armando", doctor1);
        System.out.println(patient1.toString());
        Patient patient2 = new Patient("Maya", "Fey", doctor2);
        System.out.println(patient2.toString());
        Patient patient3 = new Patient("Miles", "Edgeworth", doctor3);
        System.out.println(patient3);

        // source: https://nameberry.com/unisex-names
        String[] givenNames = {
            "Avery", "Riley", "Jordan", "Angel", "Peyton",
            "Quinn", "Hayden", "Taylor", "Alexis", "Rowan",
            "Charlie", "Emerson", "Finley", "River", "Emery",
            "Morgan", "Elliot", "London", "Eden", "Elliott",
            "Karter", "Dakota", "Reese", "Remington", "Payton",
            "Amari", "Phoenix", "Kendall", "Harley", "Rylan",
            "Marley", "Dallas", "Skyler", "Spencer", "Sage",
            "Kyrie", "Ellis", "Rory", "Remi", "Justice",
            "Ali", "Haven", "Tatum", "Arden", "Linden",
            "Devon", "Rebel", "Rio", "Ripley", "Frankie"
        };

        // source: http://www.locatemyname.com/topsurnames.php?country=canada
        String[] surnames = {
            "Smith", "Brown", "Tremblay", "Martin", "Roy",
            "Wilson", "Macdonald", "Gagnon", "Johnson", "Taylor",
            "Cote", "Campbell", "Anderson", "Leblanc", "Lee",
            "Jones", "White", "Williams", "Miller", "Thompson",
            "Gauthier", "Young", "Van", "Morin", "Bouchard",
            "Scott", "Stewart", "Belanger", "Reid", "Pelletier",
            "Moore", "Lavoie", "King", "Robinson", "Levesque",
            "Murphy", "Fortin", "Gagne", "Wong", "Clark",
            "Johnston", "Clarke", "Ross", "Walker", "Thomas",
            "Boucher", "Landry", "Kelly", "Bergeron", "Davis"
        };

        //creates the array of patients using the patientGenerator method, prints patient zero
        Patient[] randomPatientArray = patientGenerator(givenNames, surnames, doctorArray);
        System.out.println("Patient zero is: " + randomPatientArray[0]);

    }
    
    /**
     * Increments through a for loop to create and return an Array of 20 patient objects, called patientArray. Uses random numbers to select a random index from the array of first and last names and doctors, assigns them to patientArray. Prints the doctors assigned to each patient, and tracks how many times they have been assigned
     * @param givenNames array of first names of the patient
     * @param surnames array of last names of the patient
     * @param doctorArray array of doctors, one of them gets assigned to the patient
     * @return array of patients with a first name, last name, and doctor
     */
    private static Patient[] patientGenerator(String[] givenNames, String[] surnames, Doctor[] doctorArray) {
        Patient[] randomPatientArray = new Patient[20];
        for (int i = 0; i < 20; i++) {
            int doctorIndex = (int)(Math.random()*3);
            if (doctorArray[doctorIndex].ID == 1) {
                Doctor.hasDoctor1++; 
            } else if (doctorArray[doctorIndex].ID == 2) {
                Doctor.hasDoctor2++;
            } else if (doctorArray[doctorIndex].ID == 3) {
                Doctor.hasDoctor3++; }
            int namesIndex = (int)(Math.random()*50);
            randomPatientArray[i] = new Patient(givenNames[namesIndex], surnames[namesIndex], doctorArray[doctorIndex]);
            String doctorPatientString = String.format("%s %s (#ID %04d)", randomPatientArray[i], "- Dr. ID:", doctorArray[doctorIndex].ID);
            System.out.println(doctorPatientString);
        }
        System.out.println(Doctor.hasDoctor1 + " patients have Doctor (#ID 0001)");
        System.out.println(Doctor.hasDoctor2 + " patients have Doctor (#ID 0002)");
        System.out.println(Doctor.hasDoctor3 + " patients have Doctor (#ID 0003)");
        return randomPatientArray;
    }    
}
