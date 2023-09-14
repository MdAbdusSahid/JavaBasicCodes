class SmallestNum {
    public static void main(String[] args) {
        int[] a = { 4, 7, 1, 2, 9, 5 };
        int smallest = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < smallest)
                smallest = a[i];
        }
        System.out.print("Smallest Num=" + smallest);
    }
}
