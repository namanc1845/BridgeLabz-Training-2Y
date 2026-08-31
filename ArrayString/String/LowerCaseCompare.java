import java.util.Scanner;

public class LowerCaseCompare {

    public static String convertToLowerCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            result = result + ch;
        }

        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String result1 = convertToLowerCase(text);
        String result2 = text.toLowerCase();

        System.out.println("User-defined method result: " + result1);
        System.out.println("toLowerCase() method result: " + result2);

        boolean result = compareStrings(result1, result2);

        System.out.println("Both results are equal: " + result);
    }
}
