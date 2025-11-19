import java.util.*;

public class InvoiceObjectCreation {
    static class Invoice {
        int id;
        Invoice(int id) { this.id = id; }
    }
    public static void main(String[] args) {
        List<Integer> ids = Arrays.asList(10, 20, 30);
        List<Invoice> invoices = ids.stream().map(Invoice::new).toList();

        invoices.forEach(i -> System.out.println("Invoice created: " + i.id));
    }
}