import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the integer number from the user
        System.out.println("Enter an integer:");
        int number = scanner.nextInt();

        // Calculate the sum of the digits
        int sum = getSumOfDigits(number);

        // Print the sum of the digits
        System.out.println("Sum of the digits: " + sum);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate the sum of digits of a number
    public static int getSumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
