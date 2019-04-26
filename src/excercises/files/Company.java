package excercises.files;

import excercises.files.Employee;

import java.io.Serializable;

public class Company implements Serializable {

    private static final int MAX_EMPS = 3;
    private Employee[] employees = new Employee[MAX_EMPS];
    int numberOfEmployees = 0;

    public void addEmployee(Employee employee) {
        if (numberOfEmployees >= MAX_EMPS) {
            System.out.println("Brak miejsca");

        } else {
            employees[numberOfEmployees] = employee;
            numberOfEmployees++;
        }
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {

        StringBuilder result= new StringBuilder();

        for (Employee employee : employees) {

            result.append(employee.getFirstName() + " " + employee.getLastName() + " salary : "
                    + employee.getSalary() + "\n");

        }

        return result.toString();
    }
}
