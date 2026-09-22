import java.util.Scanner;

public class StringBufferConcatenate {

    static String concatenate(String[] words) {

        StringBuffer result = new StringBuffer();

        for (int i = 0; i < words.length; i++) {

            result.append(words[i]);

            if (i != words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();

        sc.nextLine();

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter string " + (i + 1) + ": ");

            words[i] = sc.nextLine();
        }

        System.out.println("Concatenated String: "
                + concatenate(words));

        sc.close();
    }
}