import java.util.Scanner;

public class FirstLastOccurrence {

    static int findFirst(int[] arr, int target) {

        int left = 0;

        int right = arr.length - 1;

        int result = -1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target) {

                result = mid;

                right = mid - 1;

            }
            else if (arr[mid] < target) {

                left = mid + 1;

            }
            else {

                right = mid - 1;
            }
        }

        return result;
    }


    static int findLast(int[] arr, int target) {

        int left = 0;

        int right = arr.length - 1;

        int result = -1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target) {

                result = mid;

                left = mid + 1;

            }
            else if (arr[mid] < target) {

                left = mid + 1;

            }
            else {

                right = mid - 1;
            }
        }

        return result;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println(
                "Enter sorted elements:");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");

        int target = sc.nextInt();

        int first = findFirst(arr, target);

        int last = findLast(arr, target);

        if (first == -1) {

            System.out.println("Element not found.");

        } else {

            System.out.println(
                    "First Occurrence: " + first);

            System.out.println(
                    "Last Occurrence: " + last);
        }

        sc.close();
    }
}