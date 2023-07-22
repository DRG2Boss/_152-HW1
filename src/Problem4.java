// Base setup including importing Scanner / initializing it with variable keyboard.
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // First we need to have the user identify the two integers used in the GCD calculation, save each as an integer variable.
        // System.out.print("Please enter the first integer: ");
        int oneNum = keyboard.nextInt();
        // System.out.print("Please enter the second integer: ");
        int twoNum = keyboard.nextInt();
        // Then we need to take those two integers and plug them into the calculateGCD function.
        // The result will be assigned to GCD.
        int GCD = calculateGCD(oneNum, twoNum);
        // Finally, print the value represented by GCD.
        System.out.println(GCD);
    }
    // The calculateGCD function will take the two variables as parameters and plug them into an equation used to calculate the greatest common denominator.
    public static int calculateGCD(int oneNum, int twoNum) {
        while(twoNum!=0) {
            int result = twoNum;
            twoNum = oneNum % twoNum;
            oneNum = result;
        }
        // When math is done, return result assigned to oneNum.
        return oneNum;
    }
}