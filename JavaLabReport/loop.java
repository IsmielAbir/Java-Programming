//4.	Write the java program based on the following instructions:
//a)	Take input continuously from an infinite loop and store them in a 1-D array. 0 (Zero) to exit from the infinite loop.
//b)	Display only those numbers that are greater than the arithmetic mean (average) of the array.

package JavaLabReport;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[100]; // Assuming a maximum of 100 numbers

        int count = 0;
        int sum = 0;

        while (true) {
            System.out.print("Enter a number (0 to exit): ");
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            }

            numbers[count] = input;
            sum += input;
            count++;
        }

        if (count == 0) {
            System.out.println("No numbers entered.");
        } else {
            double mean = (double) sum / count;

            System.out.println("Numbers greater than the mean:");

            for (int i = 0; i < count; i++) {
                if (numbers[i] > mean) {
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}
