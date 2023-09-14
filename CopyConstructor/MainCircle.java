class Circle
{
	int radious;
	Circle(int r)
	{
		radious=r;
	}
}
class Utility
{
	static double getArea(Circle c)
	{
		return 3.14*Math.pow(c.radious,2);
	}
}
class MainCircle
{
	public static void main(String args[])
	{
		Circle c1=new Circle(10);
		Circle c2=new Circle(20);
		Circle c3=new Circle(30);
		System.out.println(Utility.getArea(c1));
		System.out.println(Utility.getArea(c2));
		System.out.println(Utility.getArea(c3));
	}
}