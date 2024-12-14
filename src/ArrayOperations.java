import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Initialize an array
        System.out.print("Enter the number of elements in the array: ");
        int size = input.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        // Step 2: Display the original array
        System.out.print("Original array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Step 3: Find the sum of the elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);

        // Step 4: Find the maximum and minimum values
        int max = numbers[0];
        int min = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

        // Step 5: Display the array in reverse order
        System.out.print("Array in reverse order: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        input.close();
    }
}
