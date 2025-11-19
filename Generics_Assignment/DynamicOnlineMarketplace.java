import java.util.ArrayList;
import java.util.List;
abstract class ProductCategory {}
class BookCategory extends ProductCategory {}
class ClothingCategory extends ProductCategory {}
class ProductGeneric<T extends ProductCategory> {
    private final String name; private double price; private final T category;
    public ProductGeneric(String name, double price, T category){this.name=name;this.price=price;this.category=category;}
    public double getPrice(){return price;}
    public String toString(){return name+"("+price+")";}
}
public class DynamicOnlineMarketplace {
    public static <T extends ProductGeneric<?>> void applyDiscount(T product, double percentage){
        // naive approach: reflectively adjust price is not ideal; instead show discounted value
        double discounted = product.getPrice() * (1 - percentage/100.0);
        System.out.println("Discounted price for " + product + " -> " + discounted);
    }
    public static void main(String[] args){
        ProductGeneric<BookCategory> book = new ProductGeneric<>("Java Book", 500, new BookCategory());
        ProductGeneric<ClothingCategory> cloth = new ProductGeneric<>("Shirt", 800, new ClothingCategory());
        applyDiscount(book, 10);
        applyDiscount(cloth, 15);
    }
}
