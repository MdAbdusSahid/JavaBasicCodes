import java.util.*;
class Book
{
	String title;
	double price;
	String author;
	Book(String t, String a,double p)
	{
		this.title=t;
		this.author=a;
		this.price=p;
	}
	void display()
	{
		System.out.println("Tittle="+title+"\tAuthor="+author+"\tPrice="+price);
	}
}
class BookCreator
{
	static Book create()
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Title:");
		String t=scn.nextLine();
		System.out.print("Enter Author:");
		String a=scn.nextLine();
		System.out.print("Enter Price:");
		double p=scn.nextDouble();
		Book b=new Book(t,a,p);
		return b;
	}
}
class MainBook
{
	public static void main(String args[])
	{
		Book b1=BookCreator.create();
		Book b2=BookCreator.create();
		b1.display();
		b2.display();
	}
} 
