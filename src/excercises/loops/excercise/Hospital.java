package excercises.loops.excercise;

import org.omg.IOP.TAG_RMI_CUSTOM_MAX_STREAM_FORMAT;

public class Hospital {

    private final int MAX_PATIENTS = 2;
    private Patient[] patients = new Patient[MAX_PATIENTS];
    private int currentPatients = 0;


    public void addPatient(Patient patient) {
        if (currentPatients < patients.length) {
            patients[currentPatients] = patient;
            currentPatients++;
            System.out.println("Dodano pacjenta: " + patient.getFirstName() + " " + patient.getLastName());
        } else {
            System.out.println("Brak miejsc");
            System.out.println("Nie dodano pacjenta: " + patient.getFirstName() + " " + patient.getLastName());
        }
    }

    public int freeSpots () {
        return patients.length - currentPatients;
    }

    public void printAllPatients(){
        for (int i = 0; i < currentPatients; i++) {
            System.out.println(patients[i].getFirstName() + " " + patients[i].getLastName());
        }
    }

}