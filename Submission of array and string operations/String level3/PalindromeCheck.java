import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Compare start and end characters
    static boolean palindromeLogic1(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {

            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    // Logic 2: Recursion
    static boolean palindromeLogic2(String text, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return palindromeLogic2(text, start + 1, end - 1);
    }

    // Reverse string using charAt()
    static char[] reverseString(String text) {

        char[] reverse = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            reverse[i] = text.charAt(text.length() - 1 - i);
        }

        return reverse;
    }

    // Logic 3: Character arrays
    static boolean palindromeLogic3(String text) {

        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {

            if (original[i] != reverse[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        boolean result1 = palindromeLogic1(text);

        boolean result2 =
                palindromeLogic2(text, 0, text.length() - 1);

        boolean result3 = palindromeLogic3(text);

        System.out.println("Logic 1: " + result1);
        System.out.println("Logic 2: " + result2);
        System.out.println("Logic 3: " + result3);

        if (result1 && result2 && result3) {
            System.out.println(text + " is a Palindrome.");
        } else {
            System.out.println(text + " is not a Palindrome.");
        }

        sc.close();
    }
}