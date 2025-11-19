import java.util.*;

public class NameUppercasing {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rahul", "Sneha", "Amit");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}