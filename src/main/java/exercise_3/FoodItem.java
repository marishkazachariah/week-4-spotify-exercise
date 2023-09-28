package exercise_3;

public class FoodItem {
    private String name;

    private double price;

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getDetails() {
        return name + " - € " + price;
    }
}
