package Array.Searching;

class LinearSearch {
    public static void main(String args[]) {
        int[] a = { 4, 7, 1, 3, 5, 6, 8 };
        System.out.println(search(a, 5));
        System.out.println(search(a, 50));
    }

    static int search(int[] a, int e) {
        for (int i = 0; i < a.length; i++) {
            if (e == a[i])
                return i;
        }
        return -1;
    }
}
