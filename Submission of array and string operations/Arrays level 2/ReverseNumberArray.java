import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        // Count digits
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        int[] digits = new int[count];

        temp = number;

        // Store digits
        for (int i = count - 1; i >= 0; i--) {

            digits[i] = temp % 10;

            temp = temp / 10;
        }

        int[] reverse = new int[count];

        // Store in reverse order
        for (int i = 0; i < count; i++) {
            reverse[i] = digits[count - 1 - i];
        }

        System.out.print("Reversed Number: ");

        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i]);
        }

        sc.close();
    }
}