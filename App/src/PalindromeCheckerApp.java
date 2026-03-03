public class PalindromeCheckerApp {
    // Application constants
    static final String APP_NAME = "Palindrome Checker App";
    static final String APP_VERSION = "Version 1.0";

    // Main method - Entry point of the application
    public static void main(String[] args) {

        String input = "radar"; // Change this to test other words

        System.out.println("=====================================");
        System.out.println(APP_NAME + " - " + APP_VERSION);
        System.out.println("Queue + Stack Based Palindrome Check");
        System.out.println("=====================================");
        System.out.println("Input String: " + input);

        input = input.toLowerCase();

        // Create Queue (FIFO)
        java.util.Queue<Character> queue = new java.util.LinkedList<>();

        // Create Stack (LIFO)
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);   // Enqueue (FIFO)
            stack.push(ch);  // Push (LIFO)
        }

        // Compare Dequeue vs Pop
        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();  // Dequeue
            char fromStack = stack.pop();     // Pop

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Display Result
        if (isPalindrome) {
            System.out.println("Result: It is a PALINDROME.");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }

        System.out.println("=====================================");
        System.out.println("Program Ended.");
    }