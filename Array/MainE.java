import java.util.Scanner;

class MainE {
    public static void main(String[] args) {
        int[] arr = m1();
        System.out.println("in main()");
        for (int n : arr)
            System.out.print(n + " ");
        System.out.println();
    }

    static int[] m1() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array");
        int size = scn.nextInt();
        int[] a = new int[size];
        System.out.println("enter " + size + " numbers");
        for (int i = 0; i < a.length; i++)
            a[i] = scn.nextInt();
        return a;
    }
}
