package org.example.exercise1;

import java.util.ArrayList;

public class Order {
    private int orderID;
    private ArrayList<Product> products;
    private double totalPrice;
    public String generateInvoice(){
        double sum = 0.0;
        if (products!=null){
            for (int i = 0; i < products.size(); i++) {
                sum+=products.get(i).getPrice();
            }
            return "Order ID: " + orderID + "\nTotal Cost: " + sum;
        }else return "No orders available.";

    }

    public Order(int orderID, ArrayList<Product> products) {
        this.orderID = orderID;
        this.products = products;
    }
}
