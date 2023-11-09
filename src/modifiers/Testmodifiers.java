package modifiers;

public class Testmodifiers 
{
	public int a=12;
	private float b=94.45f;
	protected boolean x=true;
	char e='r';
	
	public void geta()
	{
		System.out.println("Value of A:"+a);
	}
	
	private void getb()
	{
		System.out.println("Value of B:"+b);
	}
	
	protected void getx()
	{
		System.out.println("Value of X:"+x);
	}
	
	 void gete()
	{
		System.out.println("Value of e:"+e);
	}
	
	public static void main(String[]args)
	{
		Testmodifiers t=new Testmodifiers();
		t.geta();
		t.getb();
		t.getx();
		t.gete();
		
	}
	

}
