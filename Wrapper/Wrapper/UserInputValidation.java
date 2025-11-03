public class UserInputValidation {
    public static boolean isValidAge(String age) {
        try {
            int a = Integer.parseInt(age);
            return a >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] testAges = {"17", "18", "abc", "20"};
        for (String age : testAges)
            System.out.println("Age " + age + " valid: " + isValidAge(age));
    }
}