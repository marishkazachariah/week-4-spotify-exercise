package exercise_3;

import java.util.ArrayList;
import java.util.List;

class Restaurant {
    private List<FoodItem> foodMenu;
    private List<Table> tables;
    private List<Order> orders;

    public Restaurant() {
        this.foodMenu = new ArrayList<>();
        this.tables = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addFoodItem(FoodItem item) {
        foodMenu.add(item);
    }

    public void addTable(Table table) {
        tables.add(table);
    }

    public void placeOrder(Table table, Order order) {
        if (table.isAvailable) {
            table.reserve();
            orders.add(order);
            System.out.println("Order placed for Table " + table.tableNumber + ". Order ID: " + order.getOrderID());
        } else {
            System.out.println("Table " + table.tableNumber + " is not available for ordering.");
        }
    }
}
