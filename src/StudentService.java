import java.util.ArrayList;

public class StudentService {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully..");
    }

    public void viewStudents(){
        if (students.isEmpty()) {
            System.out.println("No students found..");
            return;
        }

        for (Student s : students) {
            System.out.println(
                    s.getId() + " | " +
                            s.getName() + " | " +
                            s.getMarks() + " | Grade: " +
                            s.calculateGrade()
            );
        }
    }
    public void updateMarks(int id, int newMarks) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setMarks(newMarks);
                System.out.println("Marks updated successfully..");
                return;
            }
        }
        System.out.println("Student not found..");
    }
}