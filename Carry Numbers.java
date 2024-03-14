import java.util.Scanner;

public class AddWithoutCarry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers from the user
        System.out.println("Enter two integers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Calculate sum without carry
        int sumWithoutCarry = getSumWithoutCarry(num1, num2);

        // Print the sum without carry
        System.out.println("Sum without carry: " + sumWithoutCarry);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate sum without carry
    public static int getSumWithoutCarry(int num1, int num2) {
        int sum = 0;
        int carry = 0;
        int base = 1;

        while (num1 > 0 || num2 > 0) {
            // Calculate the digits at the current position
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;

            // Calculate the sum of digits at the current position
            int digitSum = digit1 + digit2 + carry;

            // Update carry
            carry = digitSum / 10;

            // Update sum without carry
            sum += (digitSum % 10) * base;

            // Move to the next position
            num1 /= 10;
            num2 /= 10;
            base *= 10;
        }

        return sum;
    }
}
