import java.util.ArrayList;
import java.util.List;
abstract class Fruit { String name; Fruit(String n){name=n;} public String toString(){return name;} }
class Apple extends Fruit { Apple(){super("Apple");} }
class Mango extends Fruit { Mango(){super("Mango");} }
// Uncommenting the following will show why non-fruit can't be added:
// class Car {}
public class FruitStorage<T extends Fruit> {
    private final List<T> fruits = new ArrayList<>();
    public void add(T f){ fruits.add(f); }
    public void display(){ fruits.forEach(System.out::println); }
    public static void main(String[] args){
        FruitStorage<Apple> appleBox = new FruitStorage<>();
        appleBox.add(new Apple());
        // appleBox.add(new Mango()); // compile error: Mango is not Apple
        FruitStorage<Fruit> mixed = new FruitStorage<>();
        mixed.add(new Apple());
        mixed.add(new Mango());
        System.out.println("Mixed fruits:");
        mixed.display();
        // Car c = new Car();
        // mixed.add(c); // won't compile because Car is not a Fruit
    }
}
