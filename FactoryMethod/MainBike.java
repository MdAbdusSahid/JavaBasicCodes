class Bike
{
	String color;
	Bike(String c)
	{
		color=c;
	}
}
class MainBike
{
	public static void main(String args[])
	{
		Bike b1=m1();
		System.out.println(b1.color);
	}
	static Bike m1()
	{
		Bike b=new Bike("red");
		return b;
	}
}