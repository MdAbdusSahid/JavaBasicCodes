import java.util.Scanner;

public class ArmstrongAll {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int total = 0, temp;
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int n = num;
		count = (num + "").length();
		int m = num;
		// System.out.println(count);
		switch (count) {
		case 1:
			while (m > 0) {
				temp = m % 10;
				total = total + temp;
				m /= 10;
			}
			if (num == total)
				System.out.println("Armstrong");
			else
				System.out.println("Not Armstrong");
			break;
		case 2:
			while (m > 0) {

				temp = m % 10;
				total = total + temp * temp;
				m /= 10;
			}
			if (num == total)
				System.out.println("Armstrong");
			else
				System.out.println("Not Armstrong");
			break;
		case 3:
			while (m > 0) {

				temp = m % 10;
				total += temp * temp * temp;
				m /= 10;
			}
			if (num == total)
				System.out.println("Armstrong");
			else
				System.out.println("Not Armstrong");
			break;
		case 4:
			while (m > 0) {

				temp = m % 10;
				total = total + temp * temp * temp * temp;
				m /= 10;
			}
			if (num == total)
				System.out.println("Armstrong");
			else
				System.out.println("Not Armstrong");
			break;
		case 5:
			while (m > 0) {

				temp = m % 10;
				total = total + temp * temp * temp * temp * temp;
				m /= 10;
			}
			if (num == total)
				System.out.println("Armstrong");
			else
				System.out.println("Not Armstrong");
			break;
		case 6:
			while (m > 0) {

				temp = m % 10;
				total = total + temp * temp * temp * temp * temp * temp;
				m /= 10;
			}
			if (num == total)
				System.out.println("Armstrong");
			else
				System.out.println("Not Armstrong");
			break;
		default:
			System.out.println("Enter a valid number");
		}
	}
}