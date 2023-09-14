import java.util.*;

class Switch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("For + Enter 1\nFor - Enter 2\nFor / Enter 3\nFor * Enter 4\n");
		int num = sc.nextInt();
		System.out.println("Enter Two Value:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println(a + b);
			break;
		case 2:
			System.out.println(a - b);
			break;
		case 3:
			System.out.println(a / b);
			break;
		case 4:
			System.out.println(a * b);
			break;
		default:
			System.out.println("Wrong Input");
		}
	}
}