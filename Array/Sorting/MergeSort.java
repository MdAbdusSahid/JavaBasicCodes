package Array.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a1 = { 1, 4, 7, 9, 14, 15 };
        int[] a2 = { 5, 6, 10, 11, 16, 18 };
        int[] a3 = new int[a1.length + a2.length];
        merge(a1, a2, a3);
        System.out.println(Arrays.toString(a3));
    }

    private static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                k++;
                i++;
            } else {
                c[k] = b[j];
                k++;
                j++;
            }
        }
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            c[k] = b[j];
            k++;
            j++;
        }
    }
}
