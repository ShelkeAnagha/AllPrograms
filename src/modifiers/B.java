package modifiers;

public class B 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Testmodifiers t=new Testmodifiers();
		
		t.geta();    //public
		t.getx();    //protected same package and inherited class
		t.gete();    //default same package
	}

}
