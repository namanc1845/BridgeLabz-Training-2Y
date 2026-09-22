import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        // Arrays
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Taking input
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Person " + (i + 1));

            System.out.print("Enter weight in kg: ");
            weight[i] = sc.nextDouble();

            System.out.print("Enter height in meters: ");
            height[i] = sc.nextDouble();
        }

        // Calculate BMI and status
        for (int i = 0; i < n; i++) {

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            }
            else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            }
            else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            }
            else {
                status[i] = "Obese";
            }
        }

        // Display result
        System.out.println("\nBMI RESULTS");

        for (int i = 0; i < n; i++) {

            System.out.println("\nPerson " + (i + 1));
            System.out.println("Height = " + height[i] + " m");
            System.out.println("Weight = " + weight[i] + " kg");
            System.out.println("BMI = " + bmi[i]);
            System.out.println("Status = " + status[i]);
        }

        sc.close();
    }
}