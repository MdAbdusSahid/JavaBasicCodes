package Sorting;

import java.util.Arrays;

public class SelectionSort {
    static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int m = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[m])
                    m = j;
            }
            if (i != m) {
                int temp = a[i];
                a[i] = a[m];
                a[m] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 4, 7, 9, 1, 2, 5, 8 };
        sort(a);
        System.out.print(Arrays.toString(a));
    }
}
