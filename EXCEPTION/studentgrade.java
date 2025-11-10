public class StudentGradeParser {
    public static void main(String[] args) {
        String[] grades = {"90", "A+", "85", "B", "100"};  // Example list of grades

        for (String grade : grades) {
            try {
                int numericGrade = Integer.parseInt(grade);  // Try to convert string to integer
                System.out.println("Valid grade: " + numericGrade);
            } catch (NumberFormatException e) {
                System.out.println("Invalid grade input: " + grade);
            }
        }
    }
}
