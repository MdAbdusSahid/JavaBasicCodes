class Reverse {
    public static void main(String[] args) {
        int[] a = { 4, 6, 9, 8, 7, 12, 13 };
        int i = 0, j = a.length - 1;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        for (int n : a)
            System.out.print(n + " ");
    }
}
