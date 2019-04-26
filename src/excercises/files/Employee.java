package excercises.files;

import java.io.Serializable;

public class Employee extends Person {

    private int salary;

    public Employee(String firstName, String lastName, int salary) {
        this.salary = salary;
        setFirstName(firstName);
        setLastName(lastName);
    }

    public int getSalary() {
        return salary;
    }
}
