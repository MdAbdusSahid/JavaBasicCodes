class Prime
{
	public static void main(String args[])
	{
		int n=47;
		boolean flag=true;
		for( int i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println("Not a prime");
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Is prime");
		}
	}
}