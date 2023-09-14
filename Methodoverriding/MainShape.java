class Shape
{
	String color;
	Shape(String c){
		color=c;
	}
	void display(){
		System.out.println("Color="+color);
	}
}
class Rectangle extends Shape
{
	int length;
	int breadth;
	Rectangle(String c,int l,int b){
		super(c);
		length=l;
		breadth=b;
	}
		@Override
	void display(){
		System.out.println("Color="+color+"\tLength="+length+"\tBreadth"+breadth);
	}
}
class MainShape 
{
	public static void main(String[] args) 
	{
		Rectangle r1=new Rectangle("Blue",45,40);
		r1.display();
	}
}
