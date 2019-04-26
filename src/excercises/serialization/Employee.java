package excercises.serialization;

import java.io.Serializable;

public class Employee extends Person implements Serializable {


    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }
}
