import java.util.*;
import java.util.function.Predicate;

public class NotificationFiltering {
    public static void main(String[] args) {
        List<String> alerts = Arrays.asList("High BP", "Normal", "Low Sugar", "Emergency");

        Predicate<String> filter = alert -> alert.contains("High") || alert.contains("Emergency");

        alerts.stream().filter(filter).forEach(System.out::println);
    }
}