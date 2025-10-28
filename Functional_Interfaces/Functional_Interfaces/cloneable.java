class Car implements Cloneable {
    String brand;
    int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    Car getClone() {
        try {
            return (Car) this.clone();
        } catch (CloneNotSupportedException e) {
            return null; 
        }
    }

    void display() {
        System.out.println("Car: " + brand + ", Year: " + year);
    }
}

public class cloneable {

    public static void main(String[] args) {
        Car car1 = new Car("Tesla", 2025);
        System.out.println("Original Car:");
        car1.display();

        Car car2 = car1.getClone();
        System.out.println("Cloned Car:");
        car2.display();
    }
}
