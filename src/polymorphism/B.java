package polymorphism;

public class B extends A{
	
	public static void main(String[]args)
	{
		A a=new A();
		a.input();
		A a1=new B();
		a1.input();
	}
	public void input()
	{
		System.out.println("Input method of class B");
	}

}
