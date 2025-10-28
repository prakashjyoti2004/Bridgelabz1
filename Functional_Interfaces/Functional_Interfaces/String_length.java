import java.util.Scanner;
import java.util.function.Function;

public class String_length {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a message: ");
        String message = sc.nextLine();

        Function<String, Integer> lengthChecker = str -> str.length();

        int length = lengthChecker.apply(message);
        System.out.println("Message length: " + length);

        int limit = 20;
        if(length > limit){
            System.out.println("Message exceeds the limit of " + limit + " characters!");
        } else {
            System.out.println("Message is within the limit.");
        }

        sc.close();
    }
}
