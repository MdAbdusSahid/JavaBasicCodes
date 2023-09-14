import java.util.*;

class QuickSort {
    public static void main(String args[]) {
        int a[] = { 3, 9, 4, 7, 1, 6, 2, 9, 5 };
        sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    static void sort(int[] a, int start, int end) {
        int i = start, j = end;
        int pivot = a[(start + end) / 2];
        while (i <= j) {
            while (a[i] < pivot)
                i++;
            while (a[j] > pivot)
                j--;
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        if (start < j)
            sort(a, start, j);
        if (i < end)
            sort(a, i, end);
    }
}