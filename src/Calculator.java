import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Display menu to the user
        System.out.println("Simple Calculator");
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        // Get the user's choice
        System.out.print("Enter your choice (1-4): ");
        int choice = input.nextInt();

        // Get the numbers from the user
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        // Perform the chosen operation
        if (choice == 1) {
            System.out.println("Result: " + (num1 + num2));
        } else if (choice == 2) {
            System.out.println("Result: " + (num1 - num2));
        } else if (choice == 3) {
            System.out.println("Result: " + (num1 * num2));
        } else if (choice == 4) {
            if (num2 != 0) { // Check for division by zero
                System.out.println("Result: " + (num1 / num2));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid choice! Please select a valid operation.");
        }

        // Close the scanner
        input.close();
    }
}
