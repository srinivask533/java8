package src.com.logical;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class SeparateZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        separateZeros(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        usingStreams(arr);
    }

    private static void usingStreams(int[] arr) {
        // Convert primitive int[] to a List<Integer>
        List<Integer> list = IntStream.of(arr).boxed().toList();

        // Create a list with non-zeros first, then zeros
        List<Integer> result = Stream.concat(
                list.stream().filter(n -> n != 0),
                list.stream().filter(n -> n == 0)
        ).toList();

        // Print the result
        System.out.println();
        result.forEach(n -> System.out.print(n + " "));
    }

    public static void separateZeros(int[] arr) {
        int nonZeroIndex = 0; // Index to place the next non-zero element

        // Move non-zero elements to the front
        for (int num : arr) {
            if (num != 0) {
                arr[nonZeroIndex++] = num;
            }
        }

        // Fill the remaining positions with zeros
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
    }
}
