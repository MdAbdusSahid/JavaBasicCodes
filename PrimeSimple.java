import java.util.*;

class PrimeSimple {
	public static void main(String ara[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int i;
		for (i = 2; i <= n; i++) {
			if (n % i == 0)
				break;
		}
		if (n == i) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}
}