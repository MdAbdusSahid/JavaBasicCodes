class A
{
	void m1(){
		System.out.println("m1 in A");
	}
}
class B extends A
{
	void m1(){
		System.out.println("m1 in B");
	}
}
class C extends A
{

}
class MainA
{
	public static void main(String args[]){
		B b1=new B();
		b1.m1();

		C c1=new C();
		c1.m1();
	}
}