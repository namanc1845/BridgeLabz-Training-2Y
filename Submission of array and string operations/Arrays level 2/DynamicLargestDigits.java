import java.util.Scanner;

public class DynamicLargestDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        int index = 0;

        while (number != 0) {

            // Increase array size
            if (index == maxDigit) {

                maxDigit = maxDigit + 10;

                int[] temp = new int[maxDigit];

                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp;
            }

            int digit = (int)(number % 10);

            digits[index] = digit;

            index++;

            number = number / 10;
        }

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {

                secondLargest = largest;
                largest = digits[i];

            } else if (digits[i] > secondLargest &&
                       digits[i] != largest) {

                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit = " + largest);
        System.out.println("Second largest digit = " + secondLargest);

        sc.close();
    }
}