package org.example.exercise1;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Product> cart;

    public Customer(String name) {
        this.name = name;
        this.cart = new ArrayList<>();
    }
    public void addToCart(Product product){
        cart.add(product);
    }
    public ArrayList<Product> checkout(){
        return this.cart;
    }
}
