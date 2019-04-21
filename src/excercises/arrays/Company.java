package excercises.arrays;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Lukasz", "Pociecha", 10_000);
        employees[1] = new Employee("Marta", "Zięba", 3700);
        employees[2] = new Employee("Karol", "Wojak", 4500);
    }
}
