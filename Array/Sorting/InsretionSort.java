package Array.Sorting;

import java.util.Arrays;

class InsertionSort {
    public static void main(String args[]) {
        int[] a = { 4, 7, 9, 1, 2, 5, 8 };
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j > -1 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }
}