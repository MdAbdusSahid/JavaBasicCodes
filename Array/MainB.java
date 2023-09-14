class MainB {
    public static void main(String[] args) {
        int[] a = new int[2];
        a[0] = 10;
        a[1] = 20;
        int[] b = a;
        System.out.println(b[0]);
        System.out.println(b[1]);
        a[0]++;
        a[1]++;
        System.out.println(b[0]);
        System.out.println(b[1]);
    }
}
