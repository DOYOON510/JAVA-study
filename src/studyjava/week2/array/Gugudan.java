package src.studyjava.week2.array;

import java.util.Arrays;

public class Gugudan {
    public static void main(String[] args) {
        int[][] arr = new int[8][9];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = (i + 2) * (j + 1);
            }

        }
        for (int i = 0; i < 8; i++) {
            System.out.printf("%d단 : " + Arrays.toString(arr[i]), i + 2);
            System.out.println();
        }

    }
}
