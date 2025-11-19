import java.util.ArrayList;
import java.util.List;
class Vehicle { String id; Vehicle(String i){id=i;} public String toString(){return id;} }
class Truck extends Vehicle { Truck(String i){super(i);} }
class Bike extends Vehicle { Bike(String i){super(i);} }
public class GenericFleetManager<T extends Vehicle> {
    private final List<T> fleet = new ArrayList<>();
    public void addVehicle(T v){ fleet.add(v); }
    public void showFleet(){ fleet.forEach(System.out::println); }
    public static void main(String[] args){
        GenericFleetManager<Truck> trucks = new GenericFleetManager<>();
        trucks.addVehicle(new Truck("T1"));
        trucks.addVehicle(new Truck("T2"));
        System.out.println("Trucks:"); trucks.showFleet();

        GenericFleetManager<Bike> bikes = new GenericFleetManager<>();
        bikes.addVehicle(new Bike("B1"));
        System.out.println("Bikes:"); bikes.showFleet();
    }
}
