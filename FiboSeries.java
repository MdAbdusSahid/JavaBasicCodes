import java.util.*;

class FiboSeries {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Value");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int a = 0, b = 1, c;
		while (a <= n2) {
			if (a >= n1)

				System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;

		}
	}
}