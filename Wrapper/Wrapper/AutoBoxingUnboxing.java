import java.util.ArrayList;

public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) numbers.add(i * 10 + i); // 11, 22, 33, 44, 55
        int sum = 0;
        for (Integer num : numbers) sum += num;
        System.out.println("Sum of numbers = " + sum);
    }
}