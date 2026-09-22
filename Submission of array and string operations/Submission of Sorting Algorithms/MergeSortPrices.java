import java.util.Arrays;

public class MergeSortPrices {

    public static void mergeSort(double[] prices, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(prices, left, mid);
            mergeSort(prices, mid + 1, right);

            merge(prices, left, mid, right);
        }
    }

    public static void merge(double[] prices, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        double[] leftArray = new double[n1];
        double[] rightArray = new double[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = prices[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = prices[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {

            if (leftArray[i] <= rightArray[j]) {
                prices[k] = leftArray[i];
                i++;
            } else {
                prices[k] = rightArray[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            prices[k++] = leftArray[i++];
        }

        while (j < n2) {
            prices[k++] = rightArray[j++];
        }
    }

    public static void main(String[] args) {

        double[] prices = {450.5, 299.0, 599.9, 199.5, 350.0};

        mergeSort(prices, 0, prices.length - 1);

        System.out.println("Sorted Book Prices: "
                + Arrays.toString(prices));
    }
}