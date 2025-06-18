package main.java.com.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String id;
    private int itemCount;
    private double itemCost;
    private double shippingCost;
    private double discount;
    private List<OrderObserver> observers;
    
    public Order(String id) {
        this.id = id;
        this.itemCount = 0;
        this.itemCost = 0.0;
        this.shippingCost = 10.0; // Default shipping cost
        this.discount = 0.0;
        this.observers = new ArrayList<>();
    }
    
    public void attach(OrderObserver observer) {
        observers.add(observer);
    }
    
    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }
    
    public void addItem(double price) {
        this.itemCount++;
        this.itemCost += price;
        notifyObservers();
    }
    
    public double getTotalPrice() {
        return itemCost + shippingCost - discount;
    }
    
    public int getCount() {
        return itemCount;
    }
    
    @Override
    public String toString() {
        return String.format("Order ID: %s, Items: %d, Item Cost: $%.2f, Shipping: $%.2f, Discount: $%.2f, Total: $%.2f",
                id, itemCount, itemCost, shippingCost, discount, getTotalPrice());
    }
    
    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }
    
    // Getters and setters
    public String getId() { return id; }
    public int getItemCount() { return itemCount; }
    public double getItemCost() { return itemCost; }
    public double getShippingCost() { return shippingCost; }
    public double getDiscount() { return discount; }
    public void setShippingCost(double shippingCost) { this.shippingCost = shippingCost; }
    public void setDiscount(double discount) { this.discount = discount; }
}