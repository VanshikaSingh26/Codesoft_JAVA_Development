import java.io.Serializable;

public class Student implements Serializable {
    private String name_of_student;
    private int roll_number;
    private String grade_obtained;
    private String email_id;

    public Student(String name_of_student, int roll_number, String grade_obtained, String email_id) {
        this.name_of_student = name_of_student;
        this.roll_number = roll_number;
        this.grade_obtained = grade_obtained;
        this.email_id = email_id;
    }

    public String get_name() {
        return name_of_student;
    }

    public int get_roll_number() {
        return roll_number;
    }

    public String get_grade() {
        return grade_obtained;
    }

    public String get_email() {
        return email_id;
    }

    public void set_name(String name_of_student) {
        this.name_of_student = name_of_student;
    }

    public void set_roll_number(int roll_number) {
        this.roll_number = roll_number;
    }

    public void set_grade(String grade_obtained) {
        this.grade_obtained = grade_obtained;
    }

    public void set_email(String email_id) {
        this.email_id = email_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "=name_of_student'" + name_of_student + '\'' +
                ", roll_number=" + roll_number +
                ", grade_obtained='" + grade_obtained + '\'' +
                ", email_id='" + email_id + '\'' +
                '}';
    }
}

