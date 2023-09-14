class SecndSmall {
    public static void main(String[] args) {
        int[] a = { 4, 7, 2, 9, 5, 3, 10, 8, 13 };
        int smallest1 = a[0];
        int smallest2 = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < smallest1) {
                smallest2 = smallest1;
                smallest1 = a[i];
            } else if (a[i] < smallest2) {
                smallest2 = a[i];
            }
        }
        System.out.print(smallest2);
    }
}
