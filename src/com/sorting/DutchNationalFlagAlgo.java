package src.com.sorting;

public class DutchNationalFlagAlgo {
    public static void main(String[] args) {
        // Example array now containing 3
        int[] arrWith3 = {0, 1, 3, 2, 0, 3, 2, 0, 1, 3};
        System.out.print("Original (contains 3): ");
        printArray(arrWith3);

        // Use counting sort when values range 0..3
        int[] copyForCount = arrWith3.clone();
        countingSort0to3(copyForCount);
        System.out.print("After countingSort0to3: ");
        printArray(copyForCount);

        // Example array with values only 0..2 (use in-place Dutch National Flag)
        int[] arr012 = {2, 0, 1, 2, 0, 1, 0};
        System.out.print("Original (only 0..2): ");
        printArray(arr012);

        dutchNationalFlagSort(arr012);
        System.out.print("After dutchNationalFlagSort (in-place DNF): ");
        printArray(arr012);
    }

    // In-place Dutch National Flag algorithm for values {0,1,2}
    private static void dutchNationalFlagSort(int[] a) {
        int low = 0, mid = 0, high = a.length - 1;
        while (mid <= high) {
            switch (a[mid]) {
                case 0:
                    swap(a, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(a, mid, high);
                    high--;
                    break;
                default:
                    throw new IllegalArgumentException("Array contains unsupported value for DNF: " + a[mid]);
            }
        }
    }

    // Counting sort for values 0..3 (keeps original code's approach)
    private static void countingSort0to3(int[] arr) {
        int[] counts = new int[4];
        for (int v : arr) {
            if (v < 0 || v > 3) {
                throw new IllegalArgumentException("Array contains unsupported value: " + v);
            }
            counts[v]++;
        }
        int idx = 0;
        for (int value = 0; value <= 3; value++) {
            for (int c = 0; c < counts[value]; c++) {
                arr[idx++] = value;
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void printArray(int[] a) {
        for (int v : a) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
