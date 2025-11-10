import java.util.Random;

// Custom Exception: Negative Amount
class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

// Custom Exception: Insufficient Funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Custom Exception: Network Failure
class NetworkFailureException extends Exception {
    public NetworkFailureException(String message) {
        super(message);
    }
}

// Bank Account Class
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Transaction Method
    public void makeTransaction(double amount)
            throws NegativeAmountException, InsufficientFundsException, NetworkFailureException {

        // Check for negative amount
        if (amount <= 0) {
            throw new NegativeAmountException("⚠️ Invalid transaction: Negative or zero amount not allowed!");
        }

        // Check for sufficient balance
        if (amount > balance) {
            throw new InsufficientFundsException("❌ Transaction failed: Insufficient balance!");
        }

        // Randomly simulate network failure
        Random random = new Random();
        boolean networkIssue = random.nextBoolean(); // 50% chance
        if (networkIssue) {
            throw new NetworkFailureException("🌐 Network error: Please try again later!");
        }

        // Transaction successful
        balance -= amount;
        System.out.println("✅ Transaction successful! Amount: ₹" + amount);
        System.out.println("💰 Remaining balance: ₹" + balance);
    }
}

// Main Class
public class BankingTransactionSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000); // Initial balance ₹10,000

        try {
            System.out.println("🔁 Processing your transaction of ₹6000...");
            account.makeTransaction(6000);
        }
        catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        }
        catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        catch (NetworkFailureException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("🏦 Thank you for banking with Java Bank!");
        }
    }
}
