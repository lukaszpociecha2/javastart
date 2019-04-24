package excercises.exceptions;


public class School {

    private final static int MAX_STUDENTS = 2;
    private Student[] students = new Student[MAX_STUDENTS];
    private static int numberOfStudents = 0;

    public void addStudent(Student student) throws NoMoreSpaceException {
        if (numberOfStudents < MAX_STUDENTS) {
            students[numberOfStudents] = student;
            numberOfStudents++;
        } else {
            throw new NoMoreSpaceException("Brak miejsc.");
        }
    }

    public Student[] getStudents() {
        return students;
    }

    public Student find(String firstName, String lastName) throws NoElementFoundException {
        Student student = null;

        for (Student student1 : students) {
            if (student1.getFirstName().equals(firstName) && student1.getLastName().equals(lastName)){
                student = student1;
                break;
            } else {
                throw new NoElementFoundException("Nie znaleziono.");
            }
        }

        return student;
    }
}
