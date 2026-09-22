import java.util.Arrays;
import java.util.Scanner;

public class SearchChallenge {

    // Find first missing positive integer
    static int firstMissingPositive(int[] arr) {

        int n = arr.length;

        boolean[] present =
                new boolean[n + 2];

        for (int i = 0; i < n; i++) {

            if (arr[i] > 0 &&
                    arr[i] <= n + 1) {

                present[arr[i]] = true;
            }
        }

        for (int i = 1; i <= n + 1; i++) {

            if (!present[i]) {

                return i;
            }
        }

        return -1;
    }


    // Binary Search
    static int binarySearch(
            int[] arr, int target) {

        int left = 0;

        int right = arr.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target) {

                return mid;

            }
            else if (arr[mid] < target) {

                left = mid + 1;

            }
            else {

                right = mid - 1;
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

        int missing =
                firstMissingPositive(arr);

        System.out.println(
                "First Missing Positive: "
                + missing);

        // Sort array before binary search
        Arrays.sort(arr);

        System.out.print(
                "Enter target to search: ");

        int target = sc.nextInt();

        int index =
                binarySearch(arr, target);

        if (index == -1) {

            System.out.println(
                    "Target not found.");

        } else {

            System.out.println(
                    "Target found at index: "
                    + index);
        }

        sc.close();
    }
}