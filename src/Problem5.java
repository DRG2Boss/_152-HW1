// Base setup including importing Scanner / initializing it with variable keyboard.
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Obtain current weekday name, current date day number, and future date day number from the user.
        // Assign them all to variables of correct type.
        // System.out.print("Please enter the name of the current weekday: ");
        String cWeekdayName = keyboard.nextLine();
        // System.out.print("Now enter the current date day number: ");
        int cDateNumber = keyboard.nextInt();
        // System.out.print("Finally, enter the future date day number: ");
        int fDateNumber = keyboard.nextInt();
        // Now we need to take that information and calculate the future weekday name.
    }
}