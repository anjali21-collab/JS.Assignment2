import java.util.InputMismatchException;
import java.util.Scanner;
public class CalculatorApp {
    static class Calculator {
        public int add(int a, int b) {
            return a + b;
        }
        public double add(double a, double b) {
            return a + b;
        }
        public int add(int a, int b, int c) {
            return a + b + c;
        }
        public int subtract(int a, int b) {
            return a - b;
        }
        public double multiply(double a, double b) {
            return a * b;
        }
        public double divide(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed!");
            }
            return (double) a / b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int choice;

        do {
            System.out.println("\n=== Calculator Application ===");
            System.out.println("1. Add Numbers");
            System.out.println("2. Subtract Numbers");
            System.out.println("3. Multiply Numbers");
            System.out.println("4. Divide Numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.println("\nSelect addition type:");
                        System.out.println("1. Add two integers");
                        System.out.println("2. Add two doubles");
                        System.out.println("3. Add three integers");
                        System.out.print("Enter your choice: ");
                        int addChoice = scanner.nextInt();
                        switch (addChoice) {
                            case 1 -> {
                                System.out.print("Enter first integer: ");
                                int a = scanner.nextInt();
                                System.out.print("Enter second integer: ");
                                int b = scanner.nextInt();
                                System.out.println("Result: " + calculator.add(a, b));
                            }
                            case 2 -> {
                                System.out.print("Enter first double: ");
                                double x = scanner.nextDouble();
                                System.out.print("Enter second double: ");
                                double y = scanner.nextDouble();
                                System.out.println("Result: " + calculator.add(x, y));
                            }
                            case 3 -> {
                                System.out.print("Enter first integer: ");
                                int p = scanner.nextInt();
                                System.out.print("Enter second integer: ");
                                int q = scanner.nextInt();
                                System.out.print("Enter third integer: ");
                                int r = scanner.nextInt();
                                System.out.println("Result: " + calculator.add(p, q, r));
                            }
                            default -> System.out.println("Invalid choice!");
                        }
                    }
                    case 2 -> {
                        System.out.print("\nEnter first integer: ");
                        int a = scanner.nextInt();
                        System.out.print("Enter second integer: ");
                        int b = scanner.nextInt();
                        System.out.println("Result: " + calculator.subtract(a, b));
                    }
                    case 3 -> {
                        System.out.print("\nEnter first double: ");
                        double a = scanner.nextDouble();
                        System.out.print("Enter second double: ");
                        double b = scanner.nextDouble();
                        System.out.println("Result: " + calculator.multiply(a, b));
                    }
                    case 4 -> {
                        try {
                            System.out.print("\nEnter numerator: ");
                            int a = scanner.nextInt();
                            System.out.print("Enter denominator: ");
                            int b = scanner.nextInt();
                            System.out.println("Result: " + calculator.divide(a, b));
                        } catch (ArithmeticException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    case 5 -> System.out.println("Exiting... Thank you!");
                    default -> System.out.println("Invalid choice! Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter numbers only.");
                scanner.nextLine();
                choice = 0;
            }
        } while (choice != 5);

        scanner.close();
    }
}
    
