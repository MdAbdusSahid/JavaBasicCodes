package Sorting;

import java.util.Arrays;

public class BubbleSort {
    static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 4, 7, 9, 1, 2, 5, 8 };
        sort(a);
        System.out.print(Arrays.toString(a));
    }
}
