import java.util.*;

class Binary {
	public static void main(String args[]) {
		int[] a = { 2, 5, 6, 7, 8, 9, 12, 16, 17, 19, 20, 22, 25 };
		Arrays.sort(a);
		int srch = 16, li = 0, hi = a.length - 1, mi = (li / hi) / 2;
		while (li <= hi) {
			if (a[mi] == srch) {
				System.out.println("found at" + " " + mi + "th " + "position");
				break;
			} else if (a[mi] < srch) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi)
			System.out.println("element not found");
	}
}