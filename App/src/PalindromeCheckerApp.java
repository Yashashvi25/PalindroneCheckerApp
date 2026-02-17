public class PalindromeCheckerApp {
    // Application constants
    static final String APP_NAME = "Palindrome Checker App";
    static final String APP_VERSION = "Version 1.0";

    // Main method - Entry point of the application
    public static void main(String[] args) {


        String input = "radar"; // You can change this to test other words

        System.out.println("=====================================");
        System.out.println("Stack-Based Palindrome Checker - UC5");
        System.out.println("=====================================");
        System.out.println("Input String: " + input);

        // Stack-based approach
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push characters into the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop characters from the stack to form reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Check if original string equals reversed string
        boolean isPalindrome = input.equals(reversed);

        // Display result
        if (isPalindrome) {
            System.out.println("Result: It is a PALINDROME.");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }

        System.out.println("=====================================");
        System.out.println("Program Ended.");
    }
}

