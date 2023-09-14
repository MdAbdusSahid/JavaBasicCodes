class ArrangeOddEven {
    public static void main(String[] args) {
        int[] a = { 4, 9, 1, 3, 7, 2, 6 };
        for (int n : a)
            System.out.print(n + " ");
        int i = 0, j = a.length - 1;
        while (i <= j) {
            while (a[i] % 2 == 1)
                i++;
            while (a[j] % 2 == 0)
                j--;
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j++;
            }

        }
        for (int n : a)
            System.out.print(n + " ");
    }
}
