
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class PalindromeCheckerApp{
    public static void main(String[] args){
        System.out.print("Welcome to Palindrome Checker App Management System\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check palindrome: ");
        String input = scanner.nextLine();


        input = input.toLowerCase();


        Queue<Character> queue = new LinkedList<>();


        Stack<Character> stack = new Stack<>();


        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                queue.add(c);
                stack.push(c);
            }
        }


        boolean isPalindrome = true;


        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }


        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }
        scanner.close();
    }
}