// Base setup including importing Scanner / initializing it with variable keyboard.
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        // Create an array "numbers" to contain the 5 integers the user inputs.
        int[] numbers = new int[5];
        Scanner keyboard = new Scanner(System.in);
        // Use String data to direct user to input data.
        // System.out.print("Enter 5 integers between 0 and 20: ");
        // Use a for loop to store each entered integer as an element in the array until a length of 5 is reached (remember, start at 0 not 1).
        for(int i=0; i<5; i++) {
            numbers[i] = keyboard.nextInt();
        }
        for(int i=0; i<5; i++) {
            // Now we use a nested for loop to print out a * based off of how big each integer is within the array.
            for(int j=0; j<numbers[i]; j++) {
                System.out.print("*");
            }
            // Finally, we need a println in place to ensure each fragment of "*"s are on their own line.
            System.out.println();
        }
    }
}