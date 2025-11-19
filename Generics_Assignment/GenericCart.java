import java.util.ArrayList;
import java.util.List;
public class GenericCart<T> {
    private final List<T> items = new ArrayList<>();
    public void addItem(T item){ items.add(item); }
    public void removeItem(T item){ items.remove(item); }
    public void displayItems(){ items.forEach(System.out::println); }
    public static class Electronics { String name; Electronics(String n){name=n;} public String toString(){return "Electronics:"+name;} }
    public static class Clothing { String name; Clothing(String n){name=n;} public String toString(){return "Clothing:"+name;} }
    public static void main(String[] args){
        GenericCart<Electronics> eCart = new GenericCart<>();
        eCart.addItem(new Electronics("Phone"));
        eCart.addItem(new Electronics("Headphones"));
        eCart.displayItems();

        GenericCart<Clothing> cCart = new GenericCart<>();
        cCart.addItem(new Clothing("T-Shirt"));
        cCart.displayItems();
    }
}
