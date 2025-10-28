import java.util.Scanner;

public class Digital_payment {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x = 2000;

        Ipay useUPI = amount ->{
                System.out.println("The of Rs."+ amount + " amount has been paid through UPI.");
            };
        Ipay useCreditCard = amount ->{   
                System.out.println("The of Rs."+ amount + " amount has been paid through UPI.");
            };
        Ipay useWallet = amount ->{
                System.out.println("The of Rs."+ amount + " amount has been paid through UPI.");
        };

        useUPI.pay(x);
        useCreditCard.pay(x);
        useWallet.pay(x);
    }

}

interface Ipay {
    void pay(int amount);
}

// class UPI implements Ipay {
//     public void pay(int amount) {
//         System.out.println("The of Rs."+ amount + " amount has been paid through UPI.");
//     }
// }
// class CreditCard implements Ipay {
//     public void pay(int amount) {
//         System.out.println("The of Rs."+ amount + " amount has been paid through Credit Card.");
//     }
// }

// class Wallet implements Ipay {
//     public void pay(int amount) {
//         System.out.println("The of Rs."+ amount + " amount has been paid through Wallet.");
//     }
// }



