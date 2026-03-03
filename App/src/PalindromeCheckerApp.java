public class PalindromeCheckerApp {
    // Application constants
    static final String APP_NAME = "Palindrome Checker App";
    static final String APP_VERSION = "Version 1.0";

    // Main method - Entry point of the application
    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";
        input = input.replaceAll("\\s+", "").toLowerCase();

        System.out.println("=====================================");
        System.out.println(APP_NAME + " - " + APP_VERSION);
        System.out.println("Performance Comparison - UC13");
        System.out.println("=====================================");
        System.out.println("Input String: " + input);
        System.out.println();

        // -------- Stack Strategy --------
        PalindromeStrategy stackStrategy = new StackStrategy();
        long startStack = System.nanoTime();
        boolean stackResult = stackStrategy.checkPalindrome(input);
        long endStack = System.nanoTime();
        long stackTime = endStack - startStack;

        // -------- Deque Strategy --------
        PalindromeStrategy dequeStrategy = new DequeStrategy();
        long startDeque = System.nanoTime();
        boolean dequeResult = dequeStrategy.checkPalindrome(input);
        long endDeque = System.nanoTime();
        long dequeTime = endDeque - startDeque;

        // -------- Recursive Strategy --------
        PalindromeStrategy recursiveStrategy = new RecursiveStrategy();
        long startRec = System.nanoTime();
        boolean recResult = recursiveStrategy.checkPalindrome(input);
        long endRec = System.nanoTime();
        long recTime = endRec - startRec;

        // -------- Display Results --------
        System.out.println("Stack Strategy Result: " + stackResult);
        System.out.println("Execution Time (ns): " + stackTime);
        System.out.println();

        System.out.println("Deque Strategy Result: " + dequeResult);
        System.out.println("Execution Time (ns): " + dequeTime);
        System.out.println();

        System.out.println("Recursive Strategy Result: " + recResult);
        System.out.println("Execution Time (ns): " + recTime);
        System.out.println();

        System.out.println("=====================================");
        System.out.println("Program Ended.");
    }