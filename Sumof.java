class Sumof
{
	public static void main(String args[])
	{
		int num=1458,sum=0,temp;
		int n=num;
		while(n!=0)
		{
			temp=n%10;
			sum=sum+temp;
			n/=10;
		}
		System.out.println(sum);
		int a=sum,b=0,c=0;
		while(a!=0)
		{
			b=a%10;
			c=c+b;
			a/=10;
		}
		System.out.println(c);
	}
}