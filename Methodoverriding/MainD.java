class D
{
	void m1(){
		System.out.println("m1 in D");
	}
	void m2(){
		System.out.println("m2 in D");
	}
}
class E extends D
{
	void m1(){
		System.out.println("m1 in E");
	}
}
class F extends E
{
	void m2(){
		System.out.println("m2 in F");
	}
}
class MainD
{
	public static void main(String args[]){
		E e1=new E();
		e1.m1();
		e1.m2();

		F f1=new F();
		f1.m1();
		f1.m2();
	}
}