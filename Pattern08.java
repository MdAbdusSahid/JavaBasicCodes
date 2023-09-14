import java.util.*;

public class Pattern08 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                k = 5 * (i - 1) + 1;
                for (int j = 1; j <= n; j++) {
                    System.out.print(k++ + " ");
                }
            } else {

                k = i * 5;
                for (int j = 1; j <= n; j++)
                    System.out.print(k-- + " ");
            }
            System.out.println();
        }
    }
}
