// Base setup including importing Scanner / initializing it with variable keyboard.
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Declare all math variables we need to track the mean calculation.
        double sum = 0;
        double count = 0;
        double average;
        while(true) {   // While loop will keep going UNTIL a condition is met (condition defined in () ). "true" will ALWAYS run, "false" will NEVER run.
            // Present input text to user to provide direction. Track the entered value as variable number.
            // System.out.print("Enter a double number. Enter 0 to calculate the average of all previous values. ");
            double number = keyboard.nextDouble();
            // If number DNE 0, then we need to do some actions.
            if (number != 0) {
                // Add inputted number to sum on top of existing sum value.
                sum += number;
                // Increase count variable by one.
                count++;
            }
            // If number DOES equal 0, then terminate loop and continue remaining code.
            else {
                break;  // "break" command will terminate whatever loop is running. This is set up so this will ONLY occur when number == 0.
            }
        }
        // AFTER while loop shenanigans, calculate double variable average.
        average = sum / count;
        // Use (int) Math.round() on variable average to give it a rounded integer. Then print that roundedAverage.
        int roundedAverage = (int) Math.round(average);
        System.out.println(roundedAverage);
    }
}