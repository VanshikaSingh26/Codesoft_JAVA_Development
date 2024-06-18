import java.util.Scanner;

public class task2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        int number_of_subjects = scanner.nextInt();
        int total_marks = 0;
        for(int i = 1; i <= number_of_subjects; i++){
            System.out.println("Enter the marks obtaines in the " + i + "th  subject : ");
            int marks_obtained = scanner.nextInt();
            total_marks = total_marks + marks_obtained;
        }

        System.out.println("Total Marks Obtained By The Student Is : " + total_marks);

        double average_percentage = (double) total_marks / number_of_subjects;
        System.out.println("Average percentage of the student : " + average_percentage);

        char grade_of_the_student;
        if (average_percentage >= 90){
            grade_of_the_student = 'A';
        }
        else if (average_percentage >= 80){
            grade_of_the_student = 'B';
        }
        else if (average_percentage >= 70){
            grade_of_the_student = 'C';
        }
        else if (average_percentage >= 60){
            grade_of_the_student = 'D';
        }
        else if (average_percentage >= 50){
            grade_of_the_student = 'E';
        }
        else{
            grade_of_the_student = 'F';
        }

        System.out.println("Grade of the student : " + grade_of_the_student);
        scanner.close();
    }
}
