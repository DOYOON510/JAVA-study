package src.week2.array;

import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {7, 5, 6, 27, 59, 25};
        int max = arr[0];
        int min = arr[0];

        for (int i : arr) {
            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }
        }
        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
    }
}
