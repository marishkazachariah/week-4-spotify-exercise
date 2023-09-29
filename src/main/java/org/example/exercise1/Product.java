package org.example.exercise1;

public class Product {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    private int stock;
    public String getDetails(){
        return "Name: " + this.name + "\n"
                + "Price: " + this.price + "\n"
                + "Stock: " + this.stock;
    }
    // TODO
    public void updateStock(){
        this.stock--;
    }

    public double getPrice() {
        return price;
    }

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}
