import java.util.Scanner;

public class PeakElement {

    static int findPeak(int[] arr) {

        int left = 0;

        int right = arr.length - 1;

        while (left < right) {

            int mid = (left + right) / 2;

            if (arr[mid] < arr[mid + 1]) {

                left = mid + 1;

            } else {

                right = mid;
            }
        }

        return left;
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

        int index = findPeak(arr);

        System.out.println(
                "Peak Element: " + arr[index]);

        System.out.println(
                "Peak Index: " + index);

        sc.close();
    }
}
