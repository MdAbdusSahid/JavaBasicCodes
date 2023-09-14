import java.util.*;

public class Pattern04 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
