package org.example.exercise1;

public class Main {
    public static void main(String[] args) {
        Store Kaufland = new Store();
        Kaufland.addProduct(new Product("Shampoo", 2.99, 10));
        Kaufland.addProduct(new Product("Soap", 1.99, 10));

        Customer customer1 = new Customer("Liza");
        customer1.addToCart(Kaufland.getProduct("Shampoo"));
        customer1.addToCart(Kaufland.getProduct("Soap"));

        Kaufland.processOrder(new Order(123,customer1.checkout()));

    }
}
