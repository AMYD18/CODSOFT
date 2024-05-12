import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The marks for each subject (out of 100):");

        // Assuming there are 5 subjects
        System.out.println("Enter the total no. of subjects");
        int totalSubjects =scanner.nextInt();
        int totalMarks = 0;

        for (int i = 1; i <= totalSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / (totalSubjects * 100) * 100;

        // Calculate grade
        char grade;
        if (averagePercentage >= 85) {
            grade = 'A';
        } else if (averagePercentage >= 75) {
            grade = 'B';
        } else if (averagePercentage >=60) {
            grade = 'C';
        } else if (averagePercentage >= 55) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display Total Marks, Average Percentage & Grade.
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}
