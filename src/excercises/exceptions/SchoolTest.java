package excercises.exceptions;

public class SchoolTest {

    public static void main(String[] args) {


        Student student1 = new Student("Lukasz", "Pociecha", "1");
        Student student2 = new Student("Marta", "Pociecha", "1");
        Student student3 = new Student("Michal", "Pociecha", "1");

        School school = new School();

        try {
            school.addStudent(student1);
            school.addStudent(student2);
            school.addStudent(student3);
        } catch (NoMoreSpaceException e){
            System.out.println(e.getMessage());
        }


        try {
            Student newStudent = school.find("Lukasz", "Sieuśmiecha");
            System.out.println(newStudent.toString());
        } catch (NoElementFoundException e){
            System.out.println(e.getMessage());
        }



    }
}
