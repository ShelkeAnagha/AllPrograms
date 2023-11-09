package interfacedemo;

public class B implements A,C{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		B b=new B();
		b.show();
		b.display();
		
		A a=new B();// interface reference of A
		a.show();
		
		C c=new B();
		c.display();
		
	}
	public void show()
	{
		System.out.println("Value of n="+n);
		System.out.println("Good Mornig");
	}

	public void display()
	{
		System.out.println("Demo of interface");
	}
}
