public class PalindromeCheckerApp {
    // Application constants
    static final String APP_NAME = "Palindrome Checker App";
    static final String APP_VERSION = "Version 1.0";

    // Main method - Entry point of the application
    public static void main(String[] args) {

        String input = "radar"; // Change input to test other words

        System.out.println("=====================================");
        System.out.println(APP_NAME + " - " + APP_VERSION);
        System.out.println("Object-Oriented Palindrome Service - UC11");
        System.out.println("=====================================");
        System.out.println("Input String: " + input);

        // Create service object (Encapsulation)
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        // Call method
        boolean isPalindrome = palindromeChecker.checkPalindrome(input);

        // Display result
        if (isPalindrome) {
            System.out.println("Result: It is a PALINDROME.");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }

        System.out.println("=====================================");
        System.out.println("Program Ended.");
    }