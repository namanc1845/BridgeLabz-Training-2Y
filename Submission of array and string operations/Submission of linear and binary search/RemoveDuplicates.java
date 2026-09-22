import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {

    static String removeDuplicates(String text) {

        StringBuilder result = new StringBuilder();

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (!set.contains(ch)) {

                result.append(ch);

                set.add(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("After removing duplicates: "
                + removeDuplicates(text));

        sc.close();
    }
}