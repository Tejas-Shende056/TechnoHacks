// Tejas Shende-Task 4
import java.util.Scanner;

public class PalindromeChecker {
    // Function to check if a string is a palindrome
    static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Removing spaces and converting to lowercase for case-insensitive checking
        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Checking if the string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("The entered string is a Palindrome.");
        } else {
            System.out.println("The entered string is NOT a Palindrome.");
        }

        scanner.close();
    }
}