import java.util.Scanner;

public class UniqueCharacters {

    // Find length without using length()
    static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string
        }

        return count;
    }

    // Find unique characters
    static char[] uniqueCharacters(String text) {

        int length = findLength(text);
        char[] temp = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {

            char current = text.charAt(i);
            boolean isUnique = true;

            // Check previous characters
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // Create array of exact size
        char[] result = new char[uniqueCount];

        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] result = uniqueCharacters(text);

        System.out.print("Unique characters: ");

        for (char ch : result) {
            System.out.print(ch + " ");
        }

        sc.close();
    }
}