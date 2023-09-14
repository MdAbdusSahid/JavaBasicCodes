import java.util.*;
class DtoBUsingScanner
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int str=sc.nextInt();
		System.out.println(Integer.toBinaryString(str));
	}
}