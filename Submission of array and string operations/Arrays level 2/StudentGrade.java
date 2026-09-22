import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[] physics = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        // Input marks
        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Physics marks: ");
            physics[i] = sc.nextDouble();

            System.out.print("Enter Chemistry marks: ");
            chemistry[i] = sc.nextDouble();

            System.out.print("Enter Maths marks: ");
            maths[i] = sc.nextDouble();

            // Validation
            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks. Enter positive values.");
                i--;
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < n; i++) {

            percentage[i] =
                    (physics[i] + chemistry[i] + maths[i]) / 3.0;

            if (percentage[i] >= 80) {
                grade[i] = "A";
            }
            else if (percentage[i] >= 70) {
                grade[i] = "B";
            }
            else if (percentage[i] >= 60) {
                grade[i] = "C";
            }
            else if (percentage[i] >= 50) {
                grade[i] = "D";
            }
            else if (percentage[i] >= 40) {
                grade[i] = "E";
            }
            else {
                grade[i] = "R";
            }
        }

        // Display result
        System.out.println("\nRESULTS");

        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));
            System.out.println("Physics = " + physics[i]);
            System.out.println("Chemistry = " + chemistry[i]);
            System.out.println("Maths = " + maths[i]);
            System.out.println("Percentage = " + percentage[i] + "%");
            System.out.println("Grade = " + grade[i]);
        }

        sc.close();
    }
}