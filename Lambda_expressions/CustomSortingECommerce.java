import java.util.*;

public class CustomSortingECommerce {
    static class Product {
        String name;
        double price;
        double rating;
        double discount;

        Product(String name, double price, double rating, double discount) {
            this.name = name;
            this.price = price;
            this.rating = rating;
            this.discount = discount;
        }
    }

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Shoes", 1200, 4.5, 10),
            new Product("Bag", 900, 4.0, 5),
            new Product("Watch", 2500, 4.8, 20)
        );

        products.sort((a, b) -> Double.compare(a.price, b.price));
        System.out.println("Sorted by price:");
        products.forEach(p -> System.out.println(p.name + " - " + p.price));
    }
}