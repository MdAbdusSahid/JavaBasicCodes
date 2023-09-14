class MainD {
    public static void main(String[] args) {
        int[] arr = { 40, 50, 60, 70, 80 };
        m1(arr);
        for (int n : arr)
            System.out.print(n + " ");
        System.out.println();
    }

    static void m1(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i]++;
            System.out.println();
        }
    }
}
