package excercises.polimorphism;

public class Nurse extends Person {

    private double overtime;

    public Nurse(String firstName, String lastName, double salary, double overtime) {
        super(firstName, lastName, salary);
        this.overtime = overtime;
    }

    public double getOvertime() {
        return overtime;
    }

    @Override
    public String toString() {
        return super.toString() + ", overtime: " + this.getOvertime();
    }
}
