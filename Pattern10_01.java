import java.util.*;

public class Pattern10_01 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
