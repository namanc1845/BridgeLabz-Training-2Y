import java.util.Scanner;

public class CharacterFrequency {

    static String[][] findFrequency(String text) {

        int[] frequency = new int[256];

        // Count frequency
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Count unique characters
        int count = 0;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                count++;
            }
        }

        String[][] result = new String[count][2];
        boolean[] stored = new boolean[256];

        int index = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (!stored[ch]) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(frequency[ch]);

                stored[ch] = true;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] result = findFrequency(text);

        System.out.println("Character\tFrequency");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }

        sc.close();
    }
}

