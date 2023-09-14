class Add {
    public static void main(String[] args) {
        int[] a = { 4, 6, 8, 12, 3 };
        int sum = 0;
        for (int n : a)
            sum += n;
        System.out.println(sum);
    }
}