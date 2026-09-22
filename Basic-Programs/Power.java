import java.util.Scanner;

class Power {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double base, exponent, result;

        System.out.print("Enter base: ");
        base = sc.nextDouble();

        System.out.print("Enter exponent: ");
        exponent = sc.nextDouble();

        result = Math.pow(base, exponent);

        System.out.println("Result = " + result);
    }
}
