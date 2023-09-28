package exercise_3;

public class Table {
    int tableNumber;
    boolean isAvailable;

    public Table(int tableNumber) {
        this.tableNumber = tableNumber;
        this.isAvailable = true;
    }

    public void reserve(){
        isAvailable = false;
    }

    public void release(){
        isAvailable = true;
    }
}
