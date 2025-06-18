package com.ecommerce;

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
        // Constructor signature
    }
    
    public void attach(OrderObserver observer) {
        // Method signature
    }
    
    public void detach(OrderObserver observer) {
        // Method signature
    }
    
    public void addItem(double price) {
        // Method signature
    }
    
    public double getTotalPrice() {
        // Method signature
        return 0.0;
    }
    
    public int getCount() {
        // Method signature
        return 0;
    }
    
    public String toString() {
        // Method signature
        return "";
    }
    
    private void notifyObservers() {
        // Method signature
    }
    
    // Getters and setters signatures
    public String getId() { return id; }
    public int getItemCount() { return itemCount; }
    public double getItemCost() { return itemCost; }
    public double getShippingCost() { return shippingCost; }
    public double getDiscount() { return discount; }
    public void setShippingCost(double shippingCost) { this.shippingCost = shippingCost; }
    public void setDiscount(double discount) { this.discount = discount; }
}