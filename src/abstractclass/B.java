package abstractclass;

public class B extends A {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		B b=new B();
		  b.show();
		  b.display();

	}

	@Override
	public void show() 
	{
		System.out.println("Inside abstract method of class A");
		
	}
	
	public void display()
	{
		System.out.println("Inside display method of class B");
	}

}
