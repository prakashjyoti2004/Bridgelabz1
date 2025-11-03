public class SensorDataLogger {
    public static void logData(Double data) {
        System.out.println("Wrapper input logged: " + data);
    }

    public static void logData(double data) {
        System.out.println("Primitive input logged: " + data);
    }

    public static void main(String[] args) {
        double temp1 = 36.6;
        Double temp2 = 37.5;
        logData(temp1);
        logData(temp2);
    }
}