import java.util.*;

public class NumRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int total = 0, temp, n = num;
        while (n > 0) {
            temp = n % 10;
            total = total * 10 + temp;
            n /= 10;
        }
        System.out.println(total);
    }
}
