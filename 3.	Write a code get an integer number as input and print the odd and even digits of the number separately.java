import java.util.Scanner;

public class OddEvenDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the integer number from the user
        System.out.println("Enter an integer:");
        int number = scanner.nextInt();

        // Print the odd and even digits separately
        System.out.println("Even digits:");
        System.out.println(getEvenDigits(number));
        System.out.println("Odd digits:");
        System.out.println(getOddDigits(number));

        // Close the scanner
        scanner.close();
    }

    // Method to get the even digits of a number
    public static String getEvenDigits(int number) {
        StringBuilder evenDigits = new StringBuilder();
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenDigits.insert(0, digit + " ");
            }
            number /= 10;
        }
        return evenDigits.toString().trim();
    }

    // Method to get the odd digits of a number
    public static String getOddDigits(int number) {
        StringBuilder oddDigits = new StringBuilder();
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                oddDigits.insert(0, digit + " ");
            }
            number /= 10;
        }
        return oddDigits.toString().trim();
    }
}
