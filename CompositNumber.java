class CompositNumber
{
	public static void main(String a[])
	{
		int n=24,i,c=0;
		for(i=2;i<=n;i++)
		{
			if(n%i==0)
			c++;
		}
		if(c>2)
		
			System.out.println(n+" "+"is composit number");
		
		else
		
			System.out.println(n+" "+"is not not composit number");
		
	}
}