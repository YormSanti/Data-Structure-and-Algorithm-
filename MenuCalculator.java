
import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {
        int choice;
        double num1, num2, result;

        try (Scanner scanner = new Scanner(System.in)) {
            do {
                // Display menu
            System.out.println("==== Calculator ====");
            System.out.println("     1. Add");
            System.out.println("     2. Subtract");
            System.out.println("     3. Multiply");
            System.out.println("     4. Divide");
            System.out.println("     5. Exit");
            System.out.print("Choose an option (1-5): ");
            choice = scanner.nextInt();

            // Process choice
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();

                switch (choice) {
                    case 1 -> {
                        result = num1 + num2;
                        System.out.println("Result: " + result);
                    }
                    case 2 -> {
                        result = num1 - num2;
                        System.out.println("Result: " + result);
                    }
                    case 3 -> {
                        result = num1 * num2;
                        System.out.println("Result: " + result);
                    }
                    case 4 -> {
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Result: " + result);
                        } else {
                            System.out.println("Error: Cannot divide by zero.");
                        }
                    }
                }
            } else if (choice != 5) {
                System.out.println("Invalid choice. Please choose between 1-5.");
            }
            System.out.println(); // Blank line for spacing
        } while (choice != 5);

        System.out.println("Calculator closed.");
        }
    }
}
