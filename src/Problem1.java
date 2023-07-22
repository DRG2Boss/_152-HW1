// Base setup including importing Scanner / initializing it with variable keyboard.
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Enter string to provide user with direction when inputting data.
        // System.out.print("Please enter your name: ");
        // Save inputted data as String variable name, then print it back to user.
        String name = keyboard.nextLine();
        System.out.println("Hello, " + name);
    }
}