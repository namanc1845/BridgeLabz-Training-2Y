import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        number = Math.abs(number);

        // Count number of digits
        int temp = number;
        int count = 0;

        if (number == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                count++;
                temp = temp / 10;
            }
        }

        // Array to store digits
        int[] digits = new int[count];

        temp = number;

        // Store digits in array
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        // Frequency array for digits 0 to 9
        int[] frequency = new int[10];

        // Count frequency
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency
        System.out.println("Digit Frequencies:");

        for (int i = 0; i < frequency.length; i++) {

            if (frequency[i] > 0) {
                System.out.println(i + " = " + frequency[i]);
            }
        }

        sc.close();
    }
}