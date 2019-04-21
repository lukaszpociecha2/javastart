package excercises.staticFields;

public class Student {

    private static int studentsNumber = 0;

    public Student() {
        studentsNumber++;
    }

    public void setStudentsNumber(int studentsNumber) {
        this.studentsNumber = studentsNumber;
    }

    public static int getStudentsNumber() {
        return studentsNumber;
    }
}
