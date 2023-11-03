import java.util.Scanner;

public class studentgradeexception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the student's roll number: ");
        String rollNumber = scanner.nextLine();

        double totalMarks = 0;

        for (int i = 1; i <= 3; i++) {
            double subjectMarks = 0;
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Enter marks for subject " + i + ": ");
                    String input = scanner.nextLine();
                    subjectMarks = Double.parseDouble(input);
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                }
            }
            totalMarks += subjectMarks;
        }

        double percentage = (totalMarks / 300) * 100;

        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
