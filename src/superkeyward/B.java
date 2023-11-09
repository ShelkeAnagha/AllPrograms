package superkeyward;

public class B extends A{
	
	public static void main (String[]args)
	{
		B b=new B();
		b.input();
		b.display();
		
	}
	public void input()
	{
		super.input();
		System.out.println("Input method of class B");
	}
	public void display() {
		System.out.println("This is method display");
	}
	

}
