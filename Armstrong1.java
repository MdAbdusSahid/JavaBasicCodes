import java.util.Scanner;

public class Armstrong1 {
    public static void main(String[] args) {
        int c = 0, a, temp, n, m, p;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer you want to check:");
        n = s.nextInt();
        temp = n;
        while (n > 0) {
            a = n % 10;
            n = n / 10;
            m = temp;
            p = 1;
            while (m > 0) {
                p = p * a;
                m = m / 10;
            }
            c = c + p;
        }
        if (temp == c)
            System.out.println("armstrong number");
        else
            System.out.println("Not armstrong number");

    }
}
