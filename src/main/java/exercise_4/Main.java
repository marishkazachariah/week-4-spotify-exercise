package exercise_4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        College yale = new College();
        System.out.println("New student added");
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello :)\nWhat is your name?");
        String name = sc.nextLine();
        System.out.println("Welcome, " + name + "!");
    }
}
