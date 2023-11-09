package inheritance;

public class B extends A {
	
	int x=25,y=100;
	
	public void get()
	
	{
		System.out.println("Child class method");
		
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
		
		System.out.println("Value of x="+x);
		System.out.println("Value of y="+y);
		
	}

	public static void main(String[]args)
	{
		B b=new B();
		b.Display();
		b.get();
	}
}
