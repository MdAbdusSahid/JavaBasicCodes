class Fact_Rec {
    public static void main(String[] args) {
        int result = fact(4);
        System.out.println(result);
    }

    static int fact(int n) {
        if (n == 0)
            return 1;
        return n * fact(n - 1);
    }
}