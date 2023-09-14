import java.util.*;

class Npr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the String:\t");
        String s1 = scn.nextLine();
        int count = s1.length();
        per(s1, 0, count);
    }

    static void per(String s, int start, int end) {
        if (start == end) {
            System.out.println(s);
            return;
        }
        for (int i = start; i <= end; i++) {
            String s1 = swap(s, start, i);
            per(s1, start + 1, end);
        }
    }

    static String swap(String s, int i, int j) {
        char[] a = s.toCharArray();
        char temp = a[i];
        a[i] = a[i];
        a[j] = temp;
        return new String(a);
    }
}