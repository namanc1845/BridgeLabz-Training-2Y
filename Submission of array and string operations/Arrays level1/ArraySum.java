import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {

            if (index == 10) {
                break;
            }

            System.out.print("Enter a number: ");
            double number = sc.nextDouble();

            if (number <= 0) {
                break;
            }

            numbers[index] = number;
            index++;
        }

        System.out.println("Entered numbers:");

        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total = total + numbers[i];
        }

        System.out.println("Total = " + total);

        sc.close();
    }
}