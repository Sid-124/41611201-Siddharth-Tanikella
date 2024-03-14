import java.util.Scanner;

public class PrintIntegerNTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read integer A and N from the user
        System.out.println("Enter integer A and N:");
        int A = scanner.nextInt();
        int N = scanner.nextInt();

        // Print integer A, N times in separate lines
        for (int i = 0; i < N; i++) {
            System.out.println(A);
        }

        // Close the scanner
        scanner.close();
    }
}
