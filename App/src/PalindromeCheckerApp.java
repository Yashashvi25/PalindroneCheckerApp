public class PalindromeCheckerApp {
    // Application constants
    static final String APP_NAME = "Palindrome Checker App";
    static final String APP_VERSION = "Version 1.0";

    // Main method - Entry point of the application
    public static void main(String[] args) {

        String input = "radar"; // Change this to test other strings

        System.out.println("=====================================");
        System.out.println(APP_NAME + " - " + APP_VERSION);
        System.out.println("Deque-Based Optimized Palindrome Checker");
        System.out.println("=====================================");
        System.out.println("Input String: " + input);

        input = input.toLowerCase(); // Optional normalization

        // Insert characters into deque
        java.util.Deque<Character> deque = new java.util.LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i)); // Insert at rear
        }

        // Compare front and rear until deque is empty
        boolean isPalindrome = true;
        while (deque.size() > 1) { // Compare until 0 or 1 character remains
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result: It is a PALINDROME.");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }

        System.out.println("=====================================");
        System.out.println("Program Ended.");
    }