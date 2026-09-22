import java.util.Scanner;

public class ReverseString {

    static String reverse(String text) {

        StringBuilder sb = new StringBuilder();

        sb.append(text);

        sb.reverse();

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("Reversed String: " + reverse(text));

        sc.close();
    }
}