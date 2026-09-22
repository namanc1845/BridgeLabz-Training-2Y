import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountWord {

    static int countWord(String fileName, String target) {

        int count = 0;

        try {

            FileReader fr = new FileReader(fileName);

            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {

                String[] words = line.split("\\s+");

                for (String word : words) {

                    if (word.equalsIgnoreCase(target)) {
                        count++;
                    }
                }
            }

            br.close();

        }
        catch (IOException e) {

            System.out.println("Error reading file.");
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word to search: ");
        String word = sc.nextLine();

        int result = countWord("data.txt", word);

        System.out.println("Word occurs " + result + " times.");

        sc.close();
    }
}