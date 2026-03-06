//version 4.0
//author akhilmattay
//use case4: Character Array Based Palindrome Check
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp{
    public static void main(String[] args){
        System.out.print("Welcome to Palindrome Checker App Management System\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        for (char c : input.toCharArray()) {

            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
        scanner.close();
    }
}