import java.util.Scanner;

class Average {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        int average;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.print("Enter third number: ");
        c = sc.nextInt();

        average = (a + b + c) / 3;

        System.out.println("Average = " + average);
    }
}
