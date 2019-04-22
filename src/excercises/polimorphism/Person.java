package excercises.polimorphism;

public class Person {

    private String firstName;
    private String lastName;
    private double salary;

    public Person(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public String toString(){
        return "First name: " + this.getFirstName() + ", last name: " + this.getLastName() + ", salary: "
                + this.getSalary();
    }

}
