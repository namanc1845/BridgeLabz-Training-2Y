import java.util.Scanner;

public class FirstNegative {

    static int findNegative(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = findNegative(arr);

        if (index == -1) {

            System.out.println("No negative number found.");

        } else {

            System.out.println(
                    "First negative number: "
                    + arr[index]);

            System.out.println(
                    "Index: " + index);
        }

        sc.close();
    }
}