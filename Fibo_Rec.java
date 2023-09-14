public class Fibo_Rec {
    public static void main(String[] args) {
        System.out.println(fibo(10));
    }

    static int fibo(int pos) {
        if (pos <= 1)
            return pos;
        return fibo(pos - 1) + fibo(pos - 2);
    }
}
