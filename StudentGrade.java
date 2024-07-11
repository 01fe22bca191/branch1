import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter scores for homework, quiz, and exam
        System.out.print("Enter homework score (out of 100): ");
        double homeworkScore = scanner.nextDouble();

        System.out.print("Enter quiz score (out of 100): ");
        double quizScore = scanner.nextDouble();

        System.out.print("Enter exam score (out of 100): ");
        double examScore = scanner.nextDouble();

        // Calculate the weighted score using predefined weights
        double weightedScore = calculateWeightedScore(homeworkScore, quizScore, examScore);

        // Determine the letter grade based on the weighted score
        char grade = calculateGrade(weightedScore);

        // Output the final grade
        System.out.println("The final grade is: " + grade);

        scanner.close();
    }

    // Method to calculate the weighted score
    public static double calculateWeightedScore(double homeworkScore, double quizScore, double examScore) {
        // Weights for each category
        double homeworkWeight = 0.2;
        double quizWeight = 0.3;
        double examWeight = 0.5;

        // Calculate weighted score
        double weightedScore = (homeworkScore * homeworkWeight) +
                               (quizScore * quizWeight) +
                               (examScore * examWeight);

        return weightedScore;
    }

    // Method to calculate the letter grade based on the weighted score
    public static char calculateGrade(double weightedScore) {
        // Determine the letter grade
        if (weightedScore >= 90) {
            return 'A';
        } else if (weightedScore >= 80) {
            return 'B';
        } else if (weightedScore >= 70) {
            return 'C';
        } else if (weightedScore >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
