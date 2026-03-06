//version 4.0
//author akhilmattay
//use case4: Character Array Based Palindrome Check
import java.util.*;
//version 6.0
//author akhilmattay
//useCase 6:Queue + Stack Based Palindrome Check

public class PalindromeCheckerApp{
    public static void main(String[] args){
        System.out.print("Welcome to Palindrome Checker App Management System\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check palindrome: ");
        String input = scanner.nextLine().toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                deque.addLast(c);
            }
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
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