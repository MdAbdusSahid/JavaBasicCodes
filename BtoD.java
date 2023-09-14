import java.util.*;

public class BtoD {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int bin = scn.nextInt();
        int dec = 0;
        int i = 0;
        while (bin > 0) {
            dec = (bin % 10) * (int) Math.pow(2, i);
            bin /= 10;
            i++;
        }
        System.out.println(dec);
    }
}