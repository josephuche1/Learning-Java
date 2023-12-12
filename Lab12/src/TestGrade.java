import java.util.Scanner;

public class TestGrade {
    public static void main(String[] args) {
        // Predefined array of at least 10 student ID numbers
        int[] studentIDs = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Arrays to store student grades
        char[] grades = new char[studentIDs.length];

        // Get grades from the user and handle exceptions
        for (int i = 0; i < studentIDs.length; i++) {
            System.out.print("Enter grade for student " + studentIDs[i] + ": ");
            try {
                char grade = getValidGrade(scanner.next().charAt(0));
                grades[i] = grade;
            } catch (GradeException e) {
                System.out.println("Error: " + e.getMessage() + " Setting grade to 'I' for student " + studentIDs[i]);
                grades[i] = 'I';
            }
        }

        // Display student IDs and grades
        System.out.println("\nStudent IDs and Grades:");
        for (int i = 0; i < studentIDs.length; i++) {
            System.out.println("Student " + studentIDs[i] + ": " + grades[i]);
        }

        // Close the scanner
        scanner.close();
    }

    // Validate and return a valid grade
    private static char getValidGrade(char inputGrade) throws GradeException {
        for (char validGrade : GradeException.grades) {
            if (inputGrade == validGrade) {
                return inputGrade;
            }
        }
        throw new GradeException("Invalid grade entered: " + inputGrade);
    }
}
