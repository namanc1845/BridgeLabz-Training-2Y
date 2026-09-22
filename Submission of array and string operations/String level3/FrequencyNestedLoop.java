import java.util.Scanner;

public class FrequencyNestedLoop {

    static String[] findFrequency(String text) {

        char[] characters = text.toCharArray();
        int[] frequency = new int[characters.length];

        // Find frequency using nested loops
        for (int i = 0; i < characters.length; i++) {

            if (characters[i] == '0') {
                continue;
            }

            frequency[i] = 1;

            for (int j = i + 1; j < characters.length; j++) {

                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0';
                }
            }
        }

        // Count unique characters
        int count = 0;

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                count++;
            }
        }

        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < characters.length; i++) {

            if (characters[i] != '0') {
                result[index] =
                        characters[i] + " : " + frequency[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] result = findFrequency(text);

        System.out.println("Character Frequencies:");

        for (String value : result) {
            System.out.println(value);
        }

        sc.close();
    }
}