class Num_Palindrome
{
	public static void main(String args[])
	{
		int n=121,rev=0,rem,temp;
		temp=n;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp==rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not");
	}
}