import java.util.Scanner;

public class SplitText {

    public static int findLength(String text) {
        int count = 0;

        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        return count;
    }

    public static String[] splitWords(String text) {

        int length = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int index = 0;
        String word = "";

        for (int i = 0; i < length; i++) {

            if (text.charAt(i) == ' ') {
                words[index] = word;
                index++;
                word = "";
            } else {
                word = word + text.charAt(i);
            }
        }

        words[index] = word;

        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] userWords = splitWords(text);
        String[] builtInWords = text.split(" ");

        System.out.println("Both results are same: "
                + compareArrays(userWords, builtInWords));

        sc.close();
    }
}