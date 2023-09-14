import java.util.*;

public class DtoB {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int bin = 0, i = 1;
        while (n > 0) {
            int rem = n % 2;
            bin = rem * i + bin;
            n /= 2;
            i *= 10;
        }
        System.out.print(bin);

    }
}
