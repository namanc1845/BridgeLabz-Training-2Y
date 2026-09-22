import java.util.Scanner;

public class SearchWord {

    static String searchWord(
            String[] sentences, String word) {

        for (int i = 0; i < sentences.length; i++) {

            if (sentences[i].contains(word)) {

                return sentences[i];
            }
        }

        return "Not Found";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Enter number of sentences: ");

        int n = sc.nextInt();

        sc.nextLine();

        String[] sentences = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.print(
                    "Enter sentence " + (i + 1) + ": ");

            sentences[i] = sc.nextLine();
        }

        System.out.print("Enter word to search: ");

        String word = sc.nextLine();

        System.out.println(
                "Result: "
                + searchWord(sentences, word));

        sc.close();
    }
}