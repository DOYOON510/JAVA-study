package src.studyJava.week2.array;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int num : arr) {
            if (num %2==0) {
                System.out.print(num + " ");
            }
        }
    }
}
