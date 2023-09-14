import java.util.*;

public class ArmstrongUsingPow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), temp;
        int n = num, count = 0, total = 0;
        int m = num;
        while (n > 0) {
            n /= 10;
            count++;
        }
        while (m > 0) {
            temp = m % 10;
            total += (int) Math.pow(temp, count);
            m /= 10;
        }
        if (num == total) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
