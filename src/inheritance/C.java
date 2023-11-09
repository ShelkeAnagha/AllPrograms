package inheritance;

public class C extends B 
{
	int p=20,q=23;
	public void at()

	{
		System.out.println("Value of p="+p);
		System.out.println("Value of q="+q);
	}
	
	public static void main(String[]args)
	{
		C c=new C();
		c.at();
		c.Display();
		c.get();
	}
}
