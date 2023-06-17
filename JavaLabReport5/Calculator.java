package JavaLabReport5;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1: Continue 0: Exit");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Enter First Number:");
                double num1 = scanner.nextDouble();

                System.out.println("Enter Second Number:");
                double num2 = scanner.nextDouble();

                System.out.println("Select an operation:");
                System.out.println("1. Addition 2. Subtraction 3. Multiplication 4. Division");
                int operation = scanner.nextInt();

                switch (operation) {
                    case 1:
                        System.out.println("Result: " + add(num1, num2));
                        break;
                    case 2:
                        System.out.println("Result: " + subtract(num1, num2));
                        break;
                    case 3:
                        System.out.println("Result: " + multiply(num1, num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Result: " + divide(num1, num2));
                        } else {
                            System.out.println("Divided by zero is not possible");
                        }
                        break;
                    default:
                        System.out.println("Incorrect input. Select an operation again.");
                        break;
                }
            }
        } while (choice != 0);

        System.out.println("Terminated..........");
        scanner.close();
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
}
