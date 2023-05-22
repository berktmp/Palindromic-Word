import java.util.Scanner;

public class Main {
    // Checks if a string is a palindrome
    public static String isPalindrome(String str) {
        String reverse = "";

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        // Compare the original string with the reversed string
        if (str.equals(reverse)) {
            return "Palindrome word.";
        } else {
            return "Not a palindrome word.";
        }
    }

    public static void main(String[] args) {
        String value;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        value = input.nextLine();
        System.out.println("-------------------");
        System.out.println(isPalindrome(value));
    }
}
