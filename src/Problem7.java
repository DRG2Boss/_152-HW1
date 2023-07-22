// Base setup including importing Scanner / initializing it with variable keyboard.
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // First we need to have the user identify the integer we want to list all the factors for.
        // System.out.print("Please enter an integer: ");
        // Save inputted data as integer variable number.
        int number = keyboard.nextInt();
        // To determine if a number is a factor, use a for loop starting at "1" until you hit the inputted number.
        for(int i=1; i<=number; i++) {
            // If inputted value has no remainder when divided by i, then it is a factor. Print that number.
            if(number % i == 0) {
                System.out.println(i);
            }
        }
    }
}