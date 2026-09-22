import java.util.Scanner;

public class WordsWithLength {

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

        String word = "";
        int index = 0;

        for (int i = 0; i < length; i++) {

            if (text.charAt(i) == ' ') {
                words[index] = word;
                index++;
                word = "";
            } else {
                word += text.charAt(i);
            }
        }

        words[index] = word;

        return words;
    }

    public static String[][] getWordsAndLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] result = getWordsAndLength(words);

        System.out.println("\nWord\tLength");

        for (int i = 0; i < result.length; i++) {
            int length = Integer.parseInt(result[i][1]);

            System.out.println(result[i][0] + "\t" + length);
        }

        sc.close();
    }
}