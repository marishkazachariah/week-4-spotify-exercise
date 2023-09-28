package exercise_3;

public class FoodItem {
    String name;
    double price;

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getDetails() {
        return name + " - € " + price;
    }
}
