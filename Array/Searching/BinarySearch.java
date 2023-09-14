class BinarySearch {
    public static void main(String args[]) {
        int[] a = { 3, 5, 7, 9, 12, 23, 35, 56 };
        System.out.println(search(a, 23));
        System.out.println(search(a, 3));
        System.out.println(search(a, 56));
        System.out.println(search(a, 8));
    }

    static int search(int[] a, int e) {
        int start = 0, end = a.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (e == a[mid])
                return mid;
            else if (e > a[mid])
                start = mid + 1;
            else if (e < a[mid])
                end = mid - 1;
        }
        return -1;
    }
}