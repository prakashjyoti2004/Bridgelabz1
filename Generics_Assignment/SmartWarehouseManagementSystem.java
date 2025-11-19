import java.util.ArrayList;
import java.util.List;
abstract class WarehouseItem { String id; WarehouseItem(String id){this.id=id;} public String toString(){return getClass().getSimpleName()+":"+id;} }
class Electronics extends WarehouseItem { Electronics(String id){super(id);} }
class Groceries extends WarehouseItem { Groceries(String id){super(id);} }
class Furniture extends WarehouseItem { Furniture(String id){super(id);} }
public class SmartWarehouseManagementSystem<T extends WarehouseItem> {
    private final List<T> storage = new ArrayList<>();
    public void add(T item){ storage.add(item); }
    public List<T> list(){ return storage; }
    public static void displayAll(List<? extends WarehouseItem> items){
        items.forEach(System.out::println);
    }
    public static void main(String[] args){
        SmartWarehouseManagementSystem<Electronics> eStore = new SmartWarehouseManagementSystem<>();
        eStore.add(new Electronics("E100"));
        eStore.add(new Electronics("E101"));
        System.out.println("Electronics in storage:"); displayAll(eStore.list());

        SmartWarehouseManagementSystem<Furniture> fStore = new SmartWarehouseManagementSystem<>();
        fStore.add(new Furniture("F200"));
        System.out.println("Furniture in storage:"); displayAll(fStore.list());
    }
}
