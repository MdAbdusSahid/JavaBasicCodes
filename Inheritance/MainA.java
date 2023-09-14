class A
{
	A(){
	System.out.println("a");
	}
}
class B extends A
{
	B(){
	System.out.println("B");
	}
}
class MainA
{
	public static void main(String args[])
	{
		B b=new B();
	}
}
