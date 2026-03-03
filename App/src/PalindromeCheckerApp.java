public class PalindromeCheckerApp {
    // Application constants
    static final String APP_NAME = "Palindrome Checker App";
    static final String APP_VERSION = "Version 1.0";

    // Main method - Entry point of the application
    public static void main(String[] args) {

        String input = "A man a plan a canal Panama"; // Change to test

        System.out.println("=====================================");
        System.out.println(APP_NAME + " - " + APP_VERSION);
        System.out.println("Case-Insensitive & Space-Ignored Palindrome - UC10");
        System.out.println("=====================================");
        System.out.println("Original Input: " + input);

        // Step 1: Normalize string
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        System.out.println("Normalized Input: " + normalized);

        // Step 2: Apply palindrome logic (two-pointer)
        boolean isPalindrome = true;
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Step 3: Display result
        if (isPalindrome) {
            System.out.println("Result: It is a PALINDROME.");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }

        System.out.println("=====================================");
        System.out.println("Program Ended.");
    }