import java.util.Scanner;

public class BMIProgram {

    // Method to calculate BMI and status
    static String[] calculateBMI(double weight, double heightCm) {

        // Convert height from cm to meter
        double heightMeter = heightCm / 100.0;

        // BMI formula
        double bmi = weight / (heightMeter * heightMeter);

        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        }
        else if (bmi <= 24.9) {
            status = "Normal";
        }
        else if (bmi <= 39.9) {
            status = "Overweight";
        }
        else {
            status = "Obese";
        }

        String[] result = new String[2];

        result[0] = String.format("%.2f", bmi);
        result[1] = status;

        return result;
    }


    // Method to create result array
    static String[][] calculateDetails(double[][] data) {

        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {

            double weight = data[i][0];
            double height = data[i][1];

            String[] bmiResult = calculateBMI(weight, height);

            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = bmiResult[0];
            result[i][3] = bmiResult[1];
        }

        return result;
    }


    // Method to display result
    static void display(String[][] result) {

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < result.length; i++) {

            System.out.println(
                    result[i][0] + "\t\t" +
                    result[i][1] + "\t\t" +
                    result[i][2] + "\t\t" +
                    result[i][3]
            );
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 10 rows and 2 columns
        double[][] data = new double[10][2];

        // Take input for 10 persons
        for (int i = 0; i < 10; i++) {

            System.out.println("\nEnter details of Person " + (i + 1));

            System.out.print("Enter weight in kg: ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height in cm: ");
            data[i][1] = sc.nextDouble();
        }

        String[][] result = calculateDetails(data);

        display(result);

        sc.close();
    }
}