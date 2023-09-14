class Rectangle
{
	int leangth;
	int breadth;
	Rectangle()
	{
	}
	Rectangle(int l,int b)
	{
		leangth=l;
		breadth=b;
	}
	Rectangle(Rectangle r)
	{
		leangth=r.leangth;
		breadth=r.breadth;
	}
	void display()
	{
		System.out.println("Leangth="+leangth+"\tBreadth="+breadth);
	}
}
class MianRectangle
{
	public static void main(String args[])
	{
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle(10,20);
		Rectangle r3=new Rectangle(r1);
		Rectangle r4=new Rectangle(r2);
		r1.display();
		r2.display();
		r3.display();
		r4.display();
	}

}