public class InfinitLoop {
    public static void main(String[] args) {
        int i = 0, j = 5;
        for (;;) {
            for (;;)
                break;
        }
        System.out.println(i);
        System.out.println(j);
    }
}
