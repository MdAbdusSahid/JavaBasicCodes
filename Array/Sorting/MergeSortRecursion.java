package Array.Sorting;

import java.util.Arrays;

public class MergeSortRecursion {
    public static void main(String[] args) {
        int[] a = { 4, 8, 1, 2, 6, 9, 5, 12, 31, 11 };
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a) {
        if (a.length == 1)
            return;
        int[] left = new int[a.length / 2];
        int[] right = new int[a.length - left.length];
        int i = 0;
        while (i < left.length) {
            left[i] = a[i];
            i++;
        }
        int j = 0;
        while (j < right.length) {
            right[j] = a[i];
            i++;
            j++;
        }
        sort(left);
        sort(right);
        merge(left, right, a);
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
