import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Student_management_system {
    private List<Student> students;
    private static final String FILE_NAME = "students.dat";

    public Student_management_system() {
        students = new ArrayList<>();
        load_students();
    }

    public void add_student(Student student) {
        students.add(student);
        save_students();
    }

    public void remove_student(int roll_number) {
        students.removeIf(student -> student.get_roll_number() == roll_number);
        save_students();
    }

    public Student search_student(int roll_number) {
        for (Student student : students) {
            if (student.get_roll_number() == roll_number) {
                return student;
            }
        }
        return null;
    }

    public void display_all_students() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private void save_students() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void load_students() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            students = (List<Student>) ois.readObject();
        } catch (FileNotFoundException e) {
            // File not found, create a new list
            students = new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
