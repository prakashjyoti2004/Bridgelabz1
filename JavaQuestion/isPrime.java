import java.util.*;

public class isPrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("1");
            return;
        }

        if (n == 2) {
            System.out.println("2");
            return;
        }

        int x = 0;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                x = 1;
                break;
            }
        }

        if (x == 0)
            System.out.println("2");
        else
            System.out.println("1");
    }
}