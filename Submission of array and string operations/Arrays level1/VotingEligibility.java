import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];

        System.out.println("Enter age of 10 students:");

        for (int i = 0; i < age.length; i++) {
            age[i] = sc.nextInt();
        }

        for (int i = 0; i < age.length; i++) {

            if (age[i] < 0) {
                System.out.println("Invalid age");
            }
            else if (age[i] >= 18) {
                System.out.println("The student with age " + age[i] + " can vote.");
            }
            else {
                System.out.println("The student with age " + age[i] + " cannot vote.");
            }
        }

        sc.close();
    }
}