// Custom Exception Class
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// ATM Class
class ATM {
    private int balance = 10000; // Initial balance ₹10,000

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Error: Insufficient funds! Available balance: ₹" + balance);
        } else if (amount <= 0) {
            throw new InsufficientFundsException("Error: Invalid amount! Please enter a positive value.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! Amount withdrawn: ₹" + amount);
            System.out.println("Remaining balance: ₹" + balance);
        }
    }
}

// Main Class
public class ATMWithdrawal {
    public static void main(String[] args) {
        ATM atm = new ATM();
        int amountToWithdraw = 12000; // Example amount

        try {
            atm.withdraw(amountToWithdraw);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
