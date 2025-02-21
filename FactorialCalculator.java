//Tejas Shende-Task 3
import java.util.Scanner;

public class FactorialCalculator {

    // Method to calculate factorial using iteration
    static long factorialIterative(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to calculate factorial using recursion
    static long factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial (Iterative): " + factorialIterative(num));
            System.out.println("Factorial (Recursive): " + factorialRecursive(num));
        }

        scanner.close();
    }
}