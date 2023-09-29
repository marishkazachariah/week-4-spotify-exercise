import java.util.Scanner;

public class JavaProgram {
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello :)\nWhat is your name?");
		String name = sc.nextLine();
		System.out.println("Welcome, " + name + "!");
	}
}

