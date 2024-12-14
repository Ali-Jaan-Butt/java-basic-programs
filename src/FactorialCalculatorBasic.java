import java.util.Scanner;

public class FactorialCalculatorBasic {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive integer to calculate its factorial:");
        int number = input.nextInt(); // Read user input

        if (number < 0) {
            // Handle negative input
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial
            int factorial = 1;
            int i = 1; // Loop counter
            while (i <= number) {
                factorial = factorial * i; // Multiply to calculate factorial
                i = i + 1; // Increment loop counter
            }

            // Display the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        // Close the scanner
        input.close();
    }
}
