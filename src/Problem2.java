// Base setup including importing Scanner / initializing it with variable keyboard.
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Enter string to provide user with direction when inputting data.
        // System.out.print("Please enter five integers to calculate the sum: ");
        // Declare our "sum" variable and set equal to starting value zero.
        int sum = 0;
        // For loop needed to accept five integer entries from user, and add them one by one to variable "sum".
        for(int i=0; i<5; i++) {
            int input = keyboard.nextInt();
            sum += input; // Another reminder from Python, "+=" is the same as "sum = input + sum"
        }
        // Finally, need to print out variable sum after 5 integers have been added to it.
        System.out.println(sum);
    }
}