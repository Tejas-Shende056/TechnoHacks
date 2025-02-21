import java.util.Scanner;
public class Fibonacciseries {
    public static void generateFibonacci(int limit) {
        int first = 0, second = 1;

        System.out.println("Fibonacci sequence up to " + limit + ":");
        while (first <= limit) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the upper limit for Fibonacci sequence: ");
        int limit = scanner.nextInt();

        generateFibonacci(limit);

        scanner.close();

    }
}
