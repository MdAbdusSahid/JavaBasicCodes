class MainC {
    public static void main(String[] args) {
        int[] a1 = { 1, 2, 3, 4, 5, 6 };
        m1(a1);
        int[] a2 = { 9, 8, 7, 6, 5, 4 };
        m1(a2);
    }

    static void m1(int[] a) {
        for (int n : a)
            System.out.print(n + " ");
        System.out.println();
    }
}
