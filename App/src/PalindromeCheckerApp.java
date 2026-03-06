
import java.util.*;


public class PalindromeCheckerApp {

    public static boolean iterativeCheck(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean recursiveCheck(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return recursiveCheck(str, start + 1, end - 1);
    }

    public static boolean stackCheck(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Palindrome Checker App Management System");
        System.out.print("Enter a string to check palindrome: ");

        String input = scanner.nextLine();
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        long startTime, endTime;

        startTime = System.nanoTime();
        boolean iterativeResult = iterativeCheck(input);
        endTime = System.nanoTime();
        long iterativeTime = endTime - startTime;

        startTime = System.nanoTime();
        boolean recursiveResult = recursiveCheck(normalized, 0, normalized.length() - 1);
        endTime = System.nanoTime();
        long recursiveTime = endTime - startTime;

        startTime = System.nanoTime();
        boolean stackResult = stackCheck(input);
        endTime = System.nanoTime();
        long stackTime = endTime - startTime;

        System.out.println();
        System.out.println("Results:");
        System.out.println("Iterative: " + iterativeResult + " | Time: " + iterativeTime + " ns");
        System.out.println("Recursive: " + recursiveResult + " | Time: " + recursiveTime + " ns");
        System.out.println("Stack: " + stackResult + " | Time: " + stackTime + " ns");

        scanner.close();
    }
}