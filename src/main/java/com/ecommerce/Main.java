package main.java.com.ecommerce;


public class Main {
    public static void main(String[] args) {
        // Create observers
        PriceObserver priceObserver = new PriceObserver();
        QuantityObserver quantityObserver = new QuantityObserver();
        
        // Create order and attach observers
        Order order1 = new Order("ORD-001");
        order1.attach(priceObserver);
        order1.attach(quantityObserver);
        
        System.out.println("=== Testing Order 1 ===");
        System.out.println("Initial order: " + order1);
        
        // Add items to trigger observers
        System.out.println("\nAdding items...");
        order1.addItem(50.0);
        System.out.println("After adding $50 item: " + order1);
        
        order1.addItem(75.0);
        System.out.println("After adding $75 item: " + order1);
        
        order1.addItem(100.0);
        System.out.println("After adding $100 item (total > $200): " + order1);
        
        // Add more items to test quantity observer
        order1.addItem(25.0);
        order1.addItem(15.0);
        order1.addItem(30.0);
        System.out.println("After adding 3 more items (total > 5 items): " + order1);
        
        // Test another order
        System.out.println("\n=== Testing Order 2 ===");
        Order order2 = new Order("ORD-002");
        order2.attach(priceObserver);
        order2.attach(quantityObserver);
        
        order2.addItem(300.0); // Should trigger price discount
        System.out.println("Order 2 with $300 item: " + order2);
    }
}