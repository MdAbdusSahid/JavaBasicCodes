class Prime1 {
	public static void main(String args[])
	{
		int n=47;
		boolean flag=true;
		if(n<=1)
		{
			System.out.println(("Not a prime");
			return;
		}
		for( int i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println("Not a prime");
				return;
			}
		}
		if(flag)
		{
			System.out.println("Is prime");
		}
	}
}