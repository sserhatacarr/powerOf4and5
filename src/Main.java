import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize variables to store the limit number and counters for 4's and 5's powers.
        int limitNumber;
        int counter4 = 0;
        int counter5 = 0;
        int powerOf4 = 1;
        int powerOf5 = 1;

        // Prompt the user to enter a limit number.
        System.out.print("Please enter a limit number : ");
        Scanner input = new Scanner(System.in);
        limitNumber = input.nextInt();

        // Use a while loop to calculate and print powers of 4 and 5 until they exceed the limit.
        while (powerOf4 <= limitNumber || powerOf5 <= limitNumber) {
            // Check if the power of 4 is within the limit and print it.
            if (powerOf4 <= limitNumber) {
                System.out.println("4^" + counter4 + " = " + powerOf4);
                counter4++;
                powerOf4 *= 4;
            }

            // Check if the power of 5 is within the limit and print it.
            if (powerOf5 <= limitNumber) {
                System.out.println("5^" + counter5 + " = " + powerOf5);
                counter5++;
                powerOf5 *= 5;
            }
        }
    }
}
