public class PalindromeCheckerApp {
    // Application constants
    static final String APP_NAME = "Palindrome Checker App";
    static final String APP_VERSION = "Version 1.0";

    // Main method - Entry point of the application
    public static void main(String[] args) {


        // Original string
        String original = "level";

        System.out.println("=====================================");
        System.out.println("Palindrome Checker - UC3");
        System.out.println("=====================================");
        System.out.println("Original String: " + original);

        // Reverse the string using for loop
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);   // String concatenation
        }

        System.out.println("Reversed String: " + reversed);

        // Compare original and reversed using equals()
        if (original.equals(reversed)) {
            System.out.println("Result: It is a PALINDROME.");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }

        System.out.println("=====================================");
        System.out.println("Program Ended.");
    }
}

