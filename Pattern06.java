import java.util.*;
public class Pattern06 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == 3 || i == 5) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(j);
                }
            } else if (i == 2 || i == 4) {
                for (int j = n; j >= 1; j--)
                    System.out.print(j);
            }
            System.out.println();
        }
    }
}
