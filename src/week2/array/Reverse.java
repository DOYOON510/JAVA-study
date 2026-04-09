package src.week2.array;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] orig = {1, 2, 3, 4, 5};
        System.out.println("원본:" + Arrays.toString(orig));
        for (int i = 0; i < orig.length / 2; i++) {
            int temp = orig[i];
            orig[i] = orig[orig.length - 1 - i];
            orig[orig.length - 1 - i] = temp;
        }

        System.out.println("뒤집기:" + Arrays.toString(orig));
    }
}
