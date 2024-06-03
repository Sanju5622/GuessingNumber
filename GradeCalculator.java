import java.util.Scanner;
public class GradeCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int subjects = sc.nextInt();

        int[] marks = new int[subjects];

        for (int i = 0; i < subjects; i++) {
            System.out.println("Enter marks obtained in subjects" + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();
        }
        int totalmarks = 0;
        for (int mark : marks) {
            totalmarks += mark;
        }
        double average = (double) totalmarks / subjects;

        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'D';
        } else if (average >= 60) {
            grade = 'E';
        } else {
            grade = 'F';

        }
        System.out.println("TotalMarks:" + totalmarks);
        System.out.println("Average:" + average);
        System.out.println("Grade:" + grade);
    }
}
