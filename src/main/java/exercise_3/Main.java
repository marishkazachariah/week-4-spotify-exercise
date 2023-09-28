package exercise_3;

public class Main {
    public static void main(String[] args) {
        // Create instances of FoodItem, Table, and Restaurant
        FoodItem burger = new FoodItem("Burger", 8.99);
        FoodItem pizza = new FoodItem("Pizza", 12.99);

        Table table1 = new Table(1);
        Table table2 = new Table(2);

        Restaurant restaurant = new Restaurant();
        restaurant.addFoodItem(burger);
        restaurant.addFoodItem(pizza);
        restaurant.addTable(table1);
        restaurant.addTable(table2);

        // Simulate a restaurant experience
        Order order1 = new Order(2);
        order1.addFoodItem(burger);
        order1.addFoodItem(pizza);

        restaurant.placeOrder(table1, order1);

        Table table3 = new Table(3);
        Order order2 = new Order(2);
        order2.addFoodItem(pizza);

        restaurant.placeOrder(table3, order2);
    }
}
