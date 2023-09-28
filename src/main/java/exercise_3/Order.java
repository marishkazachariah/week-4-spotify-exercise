package exercise_3;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderID;
    private List<FoodItem> foodItems;
    private double totalPrice;

    public Order(int orderID) {
        this.orderID = orderID;
        this.foodItems = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public int getOrderID() {
        return orderID;
    }

    public void addFoodItem(FoodItem item) {
        foodItems.add(item);
        totalPrice += item.getPrice();
    }

    public double calculateTotal() {
        return totalPrice;
    }
}
