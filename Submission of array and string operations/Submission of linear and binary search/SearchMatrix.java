import java.util.Scanner;

public class SearchMatrix {

    static boolean search(
            int[][] matrix, int target) {

        int rows = matrix.length;

        int columns = matrix[0].length;

        int left = 0;

        int right = rows * columns - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            int row = mid / columns;

            int column = mid % columns;

            int value = matrix[row][column];

            if (value == target) {

                return true;

            }
            else if (target < value) {

                right = mid - 1;

            }
            else {

                left = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int columns = sc.nextInt();

        int[][] matrix =
                new int[rows][columns];

        System.out.println(
                "Enter sorted matrix:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter target: ");

        int target = sc.nextInt();

        if (search(matrix, target)) {

            System.out.println("Target Found.");

        } else {

            System.out.println("Target Not Found.");
        }

        sc.close();
    }
}

