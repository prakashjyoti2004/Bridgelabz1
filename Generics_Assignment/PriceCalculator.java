import java.util.List;
abstract class Product { abstract double getPrice(); }
class Mobile extends Product { private double price; Mobile(double p){price=p;} double getPrice(){return price;} public String toString(){return "Mobile:"+price;} }
class Laptop extends Product { private double price; Laptop(double p){price=p;} double getPrice(){return price;} public String toString(){return "Laptop:"+price;} }
public class PriceCalculator {
    public static double calculateTotal(List<? extends Product> items){
        double sum = 0;
        for(Product p : items) sum += p.getPrice();
        return sum;
    }
    public static void main(String[] args){
        java.util.List<Mobile> mobiles = java.util.Arrays.asList(new Mobile(10000), new Mobile(15000));
        System.out.println("Mobiles total: " + calculateTotal(mobiles));
        java.util.List<Laptop> laptops = java.util.Arrays.asList(new Laptop(50000));
        System.out.println("Laptops total: " + calculateTotal(laptops));
    }
}
