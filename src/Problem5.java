// Base setup including importing Scanner / initializing it with variable keyboard.
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Declare and assign all needed variables.
        // Create a String array of all weekday names.
        String[] allWeekdays = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
        // Obtain current weekday name, current date day number, and future date day number from the user.
        // System.out.print("Please enter the name of the current weekday: ");
        String cWeekdayName = keyboard.next();
        // System.out.print("Now enter the current date day number: ");
        int cDateNumber = keyboard.nextInt();
        // System.out.print("Finally, enter the future date day number: ");
        int fDateNumber = keyboard.nextInt();

        // Before we do anything else, let's make sure that the data was entered correctly.
            // Unknown how to check to see if cWeekdayName string is equal to a string within the array at this point, so we'll need to get creative later.
        // Setting parameters for current and future date number is an easy enough if statement.
        if(fDateNumber < cDateNumber || cDateNumber <= 0 || cDateNumber > 31 || fDateNumber > 31) {
            System.out.println("You've entered the numbers incorrectly. Please try again.");
            return;
        }
        // Now we need to take that information and calculate the future weekday name. First we'll figure out how many days have passed.
        int totalDaysPassed = fDateNumber - cDateNumber;
        // How do we simplify totalDaysPassed into a value used in calculating the weekday name? Modulo by 7!
            // The remainder given by totalDaysPassed % 7 will tell us how many weekday names forward we want to move within our allWeekdays array.
        // We also need to figure out the weekday name we're STARTING at before we move forward "x" amount of times.
            // Plug in cWeekdayName into function getStartingPosition to convert the starting date name into a position integer.
            // Add that to the previous math, and then modulo all of it by 7 to get the final weekday position.
        int fWeekdayPosition = (getStartingPosition(cWeekdayName, allWeekdays) + (totalDaysPassed % 7)) % 7;

        // After all that math, we just need to take that position and apply it to allWeekdays to get the associated weekday name.
        // Remember function getStartingPosition. If anything other than a weekday name was entered, fWeekdayPosition < 0.
            // We can use an if statement to determine what is outputted to the user based on that condition.
        if(fWeekdayPosition >=0) {
            System.out.println(allWeekdays[fWeekdayPosition]);
        }
        else {
            System.out.println("Invalid weekday name entered. Please try again.");
        }
    }
    // Take the entered current weekday name and use a function to calculate its position within array allWeekdays.
    public static int getStartingPosition(String cWeekdayName, String[] allWeekdays) {
        // Use a basic for loop to isolate the position of the entered current weekday name.
        for(int i=0; i<allWeekdays.length; i++) {
            // IF any of the String positions within the array are equal to the entered weekday name (regardless of casing), return that position number.
            if(allWeekdays[i].equalsIgnoreCase(cWeekdayName)) {
                return i;
            }
        }
        // If there's no match, the user entered incorrect data, and so we'll return -7 to ensure fWeekdayPosition is a negative value.
        return -7;
    }
}