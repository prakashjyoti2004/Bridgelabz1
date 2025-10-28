public class vehicle {

    public static void main(String[] args) {
        
        Ivehicle car = new Cars();
        Ivehicle bike = new Bikes();
        Ivehicle bus = new Buses();

        car.rent();
        car.returnvehicle();
        bike.rent();
        bike.returnvehicle();
        bus.rent();
        bus.returnvehicle();
    }

}

interface Ivehicle {
    void rent();
    void returnvehicle();}

class Cars implements Ivehicle {
    public void rent() {
        System.out.println("The car is rented.");
    }

    public void returnvehicle() {
        System.out.println("The car has been returned.");
    }
}
class Bikes implements Ivehicle {
    public void rent() {
    System.out.println("The bike is rented.");
    }

    public void returnvehicle() {
        System.out.println("The bike has been returned.");
    }
}
class Buses implements Ivehicle {
    public void rent() {
        System.out.println("The bus is rented.");
    }

    public void returnvehicle() {
        System.out.println("The bus has been returned.");
    }
}


