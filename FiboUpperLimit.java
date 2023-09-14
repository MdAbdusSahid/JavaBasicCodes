import java.util.*;
class FiboUpperLimit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The value");
		int n=sc.nextInt();
		int a=0,b=1,c;
		while(a<=n)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
}