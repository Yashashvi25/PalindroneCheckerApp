public class PalindromeCheckerApp {
    // Application constants
    static final String APP_NAME = "Palindrome Checker App";
    static final String APP_VERSION = "Version 1.0";

    // Main method - Entry point of the application
    public static void main(String[] args) {


        // Hardcoded string (String Literal)
        String word = "madam";

        System.out.println("=====================================");
        System.out.println("Palindrome Checker - UC2");
        System.out.println("=====================================");
        System.out.println("Given Word: " + word);

        // Reverse the string
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + word.charAt(i);
        }

        // Conditional Statement (if-else)
        if (word.equals(reversedWord)) {
            System.out.println("Result: The given word is a PALINDROME.");
        } else {
            System.out.println("Result: The given word is NOT a palindrome.");
        }

        System.out.println("=====================================");
        System.out.println("Program Ended.");
    }
}

