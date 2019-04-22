package excercises.polimorphism;

public class Hospital {

    private static Person[] staff = new Person[3];

    public Person[] getStaff() {
        return staff;
    }

    @Override
    public String toString() {
        String result = "";
        for (Person person: staff
             ) {
            result = result + person.toString() + "\n";
        }

        return result;

    }
}
