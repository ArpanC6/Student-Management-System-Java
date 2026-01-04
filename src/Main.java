import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Update Makrs");
            System.out.println("4. Exit");
            System.out.println("Choose Option: ");

            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter ID: ");
                    int id = s.nextInt();
                    s.nextLine();

                    System.out.println("Enter Name: ");
                    String name = s.nextLine();

                    System.out.println("Enter Marks: ");
                    int marks = s.nextInt();

                    Student student = new Student(id,name,marks);
                    service.addStudent(student);
                    break;

                case 2:
                    service.viewStudents();
                    break;

                case 3:
                    System.out.println("Enter ID: ");
                    int sid = s.nextInt();

                    System.out.println("Enter new marks: ");
                    int newmarks = s.nextInt();

                    service.updateMarks(sid, newmarks);
                    break;

                case 4:
                    System.out.println("Thank You..");
                    return;

                default:
                    System.out.println("Invalid choice..");
            }
        }
    }
}