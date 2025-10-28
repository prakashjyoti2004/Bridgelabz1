import java.util.Scanner;

public class Temperature_alert {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature: ");
        double x = sc.nextDouble();

        double threshold = 50.00;

        Ialert alert = temp ->{
                if(temp>=threshold){
                    // System.out.println("ALERT!!!");
                    return true;
                }
                else{
                    // System.out.println("Normal");
                    return false;
                }
            };

        alert.temp_alert(x);
        sc.close();
    }
}

interface Ialert {
    boolean temp_alert(double temp);
}

