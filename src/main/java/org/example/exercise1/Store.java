package org.example.exercise1;

import java.util.ArrayList;

public class Store {
    private ArrayList<Product> products;
    private ArrayList<Order> orders;

    public void addProduct(Product product){
        this.products.add(product);
    }

    public Store() {
        this.products = new ArrayList<Product>();
        this.orders = new ArrayList<Order>();
    }
    public Product getProduct(String prodName){
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equalsIgnoreCase(prodName)){
                return products.get(i);
            }
        }
        return null;
    }
    //TODO
    public void processOrder(Order order){
        System.out.println(order.generateInvoice());
    }
}
