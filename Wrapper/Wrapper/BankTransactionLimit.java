public class BankTransactionLimit {
    public static double getRemainingLimit(Double limit) {
        if (limit == null) return 0.0;
        return limit - 1000.0;
    }

    public static void main(String[] args) {
        Double limit1 = 5000.0;
        Double limit2 = null;
        System.out.println("Remaining limit 1: " + getRemainingLimit(limit1));
        System.out.println("Remaining limit 2: " + getRemainingLimit(limit2));
    }
}