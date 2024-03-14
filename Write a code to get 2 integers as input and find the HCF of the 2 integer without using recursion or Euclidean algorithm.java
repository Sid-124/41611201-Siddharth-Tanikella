import java.util.Scanner;

public class HCFWithoutRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers from the user
        System.out.println("Enter two integers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Find the HCF of the two integers
        int hcf = findHCF(num1, num2);

        // Print the HCF
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);

        // Close the scanner
        scanner.close();
    }

    // Method to find the HCF of two integers
    public static int findHCF(int num1, int num2) {
        int hcf = 1;
        // Find the minimum of the two numbers
        int min = Math.min(num1, num2);
        // Iterate from 1 to the minimum of the two numbers
        for (int i = 1; i <= min; i++) {
            // Check if i divides both num1 and num2
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i; // Update HCF if i is a common factor
            }
        }
        return hcf;
    }
}
