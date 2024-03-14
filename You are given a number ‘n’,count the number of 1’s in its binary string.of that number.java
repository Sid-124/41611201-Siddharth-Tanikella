import java.util.Scanner;

public class CountOnesInBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number 'n' from the user
        System.out.println("Enter a number:");
        int n = scanner.nextInt();

        // Convert the number to binary string
        String binaryString = Integer.toBinaryString(n);

        // Count the number of 1's in the binary string
        int countOnes = countOnesInBinary(binaryString);

        // Print the count of 1's
        System.out.println("Count of 1's in binary string: " + countOnes);

        // Close the scanner
        scanner.close();
    }

    // Method to count the number of 1's in a binary string
    public static int countOnesInBinary(String binaryString) {
        int count = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
