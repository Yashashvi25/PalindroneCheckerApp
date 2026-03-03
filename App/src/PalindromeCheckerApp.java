public class PalindromeCheckerApp {
    // Application constants
    static final String APP_NAME = "Palindrome Checker App";
    static final String APP_VERSION = "Version 1.0";

    // Main method - Entry point of the application
    public static void main(String[] args) {

        String input = "radar"; // Change to test
        String selectedStrategy = "stack"; // Change to "deque" to test another strategy

        System.out.println("=====================================");
        System.out.println(APP_NAME + " - " + APP_VERSION);
        System.out.println("Strategy Pattern - Palindrome Checker (UC12)");
        System.out.println("=====================================");
        System.out.println("Input String: " + input);
        System.out.println("Selected Strategy: " + selectedStrategy);

        // Strategy reference (Polymorphism)
        PalindromeStrategy strategy;

        // Inject strategy at runtime
        if (selectedStrategy.equalsIgnoreCase("stack")) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        // Execute selected algorithm
        boolean isPalindrome = strategy.checkPalindrome(input);

        // Display result
        if (isPalindrome) {
            System.out.println("Result: It is a PALINDROME.");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }

        System.out.println("=====================================");
        System.out.println("Program Ended.");
    }