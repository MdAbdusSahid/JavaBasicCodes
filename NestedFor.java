/**
 * NestedFor
 */
public class NestedFor {

    public static void main(String[] args) {
        abc: for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.println(i + " " + j);
                if (i == 3)
                    break abc;
            }
        }
    }
}