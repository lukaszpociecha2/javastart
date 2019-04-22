package excercises.polimorphism;

public class HospitalApp {

    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Doctor doctor = new Doctor("Lukasz", "Pociecha", 5000, 1000);
        Nurse nurse1 = new Nurse("Bożena", "Pociecha", 4000, 20);
        Nurse nurse2 = new Nurse("Marta", "Pociecha", 3000, 25);

        hospital.getStaff()[0] = doctor;
        hospital.getStaff()[1] = nurse1;
        hospital.getStaff()[2] = nurse2;

        /*for (Person person:hospital.getStaff()
             ) {
            System.out.println(person.toString());
        }*/

        System.out.println(hospital);



    }
}
