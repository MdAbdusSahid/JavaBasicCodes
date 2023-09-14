class EvenOdd {
    public static void main(String[] args) {
        int[] a = { 4, 6, 7, 8, 12, 13 };
        int even = 0;
        int odd = 0;
        for (int n : a) {
            if (n % 2 == 0)
                even += n;
            else
                odd += n;
            System.out.println("Even number=" + even);
            System.out.println("Odd number=" + odd);
        }
    }
}
