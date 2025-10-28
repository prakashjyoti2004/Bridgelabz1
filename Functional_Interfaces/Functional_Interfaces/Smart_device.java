public class Smart_device {

    public static void main(String[] args) {
        
        SD mainlight = new Light();
        SD mainac = new AC();
        SD maintv = new TV();

        mainlight.turnOn();
        mainac.turnOn();
        maintv.turnOn();
    }

}

interface SD {
    void turnOn();
    void turnOff();}

class Light implements SD {
    public void turnOn() {
        System.out.println("The light is now ON.");
    }

    public void turnOff() {
        System.out.println("The light is now OFF.");
    }
}
class AC implements SD {
    public void turnOn() {
    System.out.println("The AC is now ON.");
    }

    public void turnOff() {
        System.out.println("The AC is now OFF.");
    }
}
class TV implements SD {
    public void turnOn() {
        System.out.println("The TV is now ON.");
    }

    public void turnOff() {
        System.out.println("The TV is now OFF.");
    }
}


