class Phone
{
	void call(){
		System.out.println("2G Implemention");
	}
}
class SmartPhone extends Phone
{
	@Override
	void call(){
		System.out.println("4G Implemention");
	}
}
class MainPhone
{
	public static void main(String args[])
	{
		SmartPhone s=new SmartPhone();
		s.call();
	}
}