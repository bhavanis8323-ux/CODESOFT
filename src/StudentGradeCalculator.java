import java.util.Scanner;

    public class StudentGradeCalculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("📘 Student Grade Calculator");
            System.out.println("----------------------------");

            int subjects = 5;
            int totalMarks = 0;

            // Get marks from user
            for (int i = 1; i <= subjects; i++) {
                System.out.print("Enter marks for subject " + i + " (out of 100): ");
                int marks = sc.nextInt();
                totalMarks += marks;
            }

            double averagePercentage = totalMarks / (double) subjects;

            // Calculate grade
            String grade;
            if (averagePercentage >= 90) {
                grade = "A+";
            } else if (averagePercentage >= 80) {
                grade = "A";
            } else if (averagePercentage >= 70) {
                grade = "B";
            } else if (averagePercentage >= 60) {
                grade = "C";
            } else if (averagePercentage >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println("----------------------------");
            System.out.println("Total Marks: " + totalMarks + " / 500");
            System.out.println("Average Percentage: " + averagePercentage + "%");
            System.out.println("Grade: " + grade);
            System.out.println("----------------------------");

            sc.close();
        }
    }
