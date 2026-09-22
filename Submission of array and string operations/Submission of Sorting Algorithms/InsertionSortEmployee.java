import java.util.Arrays;

public class InsertionSortEmployee {
    public static void main(String[] args) {

        int[] employeeId = {105, 101, 109, 103, 102};

        for (int i = 1; i < employeeId.length; i++) {

            int key = employeeId[i];
            int j = i - 1;

            while (j >= 0 && employeeId[j] > key) {

                employeeId[j + 1] = employeeId[j];
                j--;
            }

            employeeId[j + 1] = key;
        }

        System.out.println("Sorted Employee IDs: "
                + Arrays.toString(employeeId));
    }
}