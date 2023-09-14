import java.util.*;

public class Armstorng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int num = sc.nextInt();
        int temp, total = 0;
        int n = num;
        while (n > 0) {
            temp = n % 10;
            total += temp * temp * temp * temp;
            n /= 10;
        }
        if (num == total) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
