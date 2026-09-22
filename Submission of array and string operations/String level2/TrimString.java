import java.util.Scanner;

public class TrimString {

    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1};
    }

    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static boolean compareStrings(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] indexes = findTrimIndexes(text);

        String userTrim =
                createSubstring(text, indexes[0], indexes[1]);

        String builtInTrim = text.trim();

        System.out.println("User-defined trim: " + userTrim);
        System.out.println("Built-in trim: " + builtInTrim);

        System.out.println("Both are same: "
                + compareStrings(userTrim, builtInTrim));

        sc.close();
    }
}