class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class PrimitiveVsReference {

    public static void main(String[] args) {
        // Primitive Data Types
        int num = 10;             // Integer
        double price = 19.99;     // Floating-point
        char grade = 'A';         // Character
        boolean isAvailable = true; // Boolean

        // Display values of primitive types
        System.out.println("Primitive Data Types:");
        System.out.println("Integer value: " + num);
        System.out.println("Double value: " + price);
        System.out.println("Character value: " + grade);
        System.out.println("Boolean value: " + isAvailable);

        // Modify primitive values
        int anotherNum = num;     // Copy the value of num
        anotherNum = 20;          // Change the copy
        System.out.println("\nOriginal num: " + num + " (unchanged after modifying anotherNum)");
        System.out.println("Modified anotherNum: " + anotherNum);

        // Reference Data Types
        Person person1 = new Person("Alice"); // Create an object
        Person person2 = person1;            // Copy the reference
        person2.name = "Bob";                // Modify the object using the second reference

        // Display values of reference types
        System.out.println("\nReference Data Types:");
        System.out.println("Person1's name: " + person1.name); // Changed because person1 and person2 point to the same object
        System.out.println("Person2's name: " + person2.name);

        // Memory Storage Explanation
        System.out.println("\nExplanation:");
        System.out.println("Primitive types store values directly in memory.");
        System.out.println("Reference types store memory addresses of objects, not the actual object itself.");
    }
}
