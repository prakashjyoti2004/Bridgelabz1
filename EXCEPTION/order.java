import java.util.Random;

class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}


class PaymentFailedException extends Exception {
    public PaymentFailedException(String message) {
        super(message);
    }
}

class Order {
    public void placeOrder() throws OutOfStockException, PaymentFailedException {
        Random random = new Random();
        int result = random.nextInt(3); // 0, 1, or 2

        if (result == 0) {
            throw new OutOfStockException("❌ Product is out of stock!");
        } else if (result == 1) {
            throw new PaymentFailedException("💳 Payment failed! Please try again.");
        } else {
            System.out.println("✅ Order placed successfully! Thank you for shopping with us.");
        }
    }
}


public class OnlineOrderProcessing {
    public static void main(String[] args) {
        Order order = new Order();

        try {
            order.placeOrder();
        } 
        catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        } 
        catch (PaymentFailedException e) {
            System.out.println(e.getMessage());
        } 
        finally {
            System.out.println("🛒 Thank you for visiting our store!");
        }
    }
}
