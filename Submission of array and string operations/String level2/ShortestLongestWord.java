import java.util.Scanner;

public class ShortestLongestWord {

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
        int count = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }

        String[] words = new String[count];

        String word = "";
        int index = 0;

        for (int i = 0; i < length; i++) {

            if (text.charAt(i) == ' ') {
                words[index++] = word;
                word = "";
            } else {
                word += text.charAt(i);
            }
        }

        words[index] = word;

        return words;
    }

    public static String[][] getWordsAndLength(String[] words) {

        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }

        return data;
    }

    public static int[] findShortestLongest(String[][] data) {

        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < data.length; i++) {

            int currentLength = Integer.parseInt(data[i][1]);
            int shortLength = Integer.parseInt(data[shortest][1]);
            int longLength = Integer.parseInt(data[longest][1]);

            if (currentLength < shortLength) {
                shortest = i;
            }

            if (currentLength > longLength) {
                longest = i;
            }
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] data = getWordsAndLength(words);

        int[] result = findShortestLongest(data);

        System.out.println("Shortest word: " + data[result[0]][0]);
        System.out.println("Longest word: " + data[result[1]][0]);

        sc.close();
    }
}