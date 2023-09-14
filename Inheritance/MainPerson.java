class Person
{
	String name;
	Person(String n){
		name=n;
	}
}
class Doctor extends Person
{
	String spec;
	Doctor(String n,String s){
		super(n);
		spec=s;
	}
}
class MainPerson
{
	public static void main(String args[])
	{
		Doctor d=new Doctor("Raju","Sam");
		System.out.println(d.name);
		System.out.println(d.spec);
	}
}