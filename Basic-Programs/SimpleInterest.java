import java.util.Scanner;

class SimpleInterest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int p, r, t, si;

        System.out.print("Enter Principal: ");
        p = sc.nextInt();

        System.out.print("Enter Rate: ");
        r = sc.nextInt();

        System.out.print("Enter Time: ");
        t = sc.nextInt();

        si = (p * r * t) / 100;

        System.out.println("Simple Interest = " + si);
    }
}
