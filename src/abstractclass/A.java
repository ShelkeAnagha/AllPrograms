package abstractclass;

public abstract class A 

{
	public abstract void show();     // Abstract method
	
	public void display()            // Non-abstract method
	{
		
		System.out.println("Inside method display");
	}
	
	public A()                      // constructor
	{
		
		System.out.println("Inside default constructor of abstract class A");
	}

}

