package exercise_3;

public class Table {
    private int tableNumber;
    private boolean isAvailable;

    public Table(int tableNumber) {
        this.tableNumber = tableNumber;
        this.isAvailable = true;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void reserve(){
        isAvailable = false;
    }

    public void release(){
        isAvailable = true;
    }
}
