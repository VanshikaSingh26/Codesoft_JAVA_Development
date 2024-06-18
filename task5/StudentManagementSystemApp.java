import java.util.Scanner;

public class StudentManagementSystemApp {
    private static Scanner scanner = new Scanner(System.in);
    private static Student_management_system sms = new Student_management_system();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nStudent Management System:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    add_student();
                    break;
                case 2:
                    remove_student();
                    break;
                case 3:
                    search_student();
                    break;
                case 4:
                    sms.display_all_students();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void add_student() {
        System.out.print("Enter name: ");
        String name_of_student = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int roll_number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter grade: ");
        String grade_obtained = scanner.nextLine();
        System.out.print("Enter email: ");
        String email_id = scanner.nextLine();

        if (name_of_student.isEmpty() || grade_obtained.isEmpty() || email_id.isEmpty()) {
            System.out.println("All fields are required.");
            return;
        }

        Student student = new Student(name_of_student, roll_number, grade_obtained, email_id);
        sms.add_student(student);
        System.out.println("Student added successfully.");
    }

    private static void remove_student() {
        System.out.print("Enter roll number to remove: ");
        int roll_number = scanner.nextInt();
        scanner.nextLine();

        sms.remove_student(roll_number);
        System.out.println("Student removed successfully.");
    }

    private static void search_student() {
        System.out.print("Enter roll number to search: ");
        int roll_number = scanner.nextInt();
        scanner.nextLine();

        Student student = sms.search_student(roll_number);
        if (student != null) {
            System.out.println("Student found: " + student);
        } else {
            System.out.println("Student not found.");
        }
    }
}
