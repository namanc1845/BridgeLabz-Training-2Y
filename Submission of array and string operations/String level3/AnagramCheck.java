import java.util.Scanner;

public class AnagramCheck {

    static boolean areAnagrams(String text1, String text2) {

        // Check lengths
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        // Find frequencies
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        // Compare frequencies
        for (int i = 0; i < 256; i++) {

            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        if (areAnagrams(text1, text2)) {
            System.out.println("The texts are Anagrams.");
        } else {
            System.out.println("The texts are not Anagrams.");
        }

        sc.close();
    }
}