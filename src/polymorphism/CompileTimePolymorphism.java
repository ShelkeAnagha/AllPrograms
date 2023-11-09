package polymorphism;

public class CompileTimePolymorphism {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		CompileTimePolymorphism c =new CompileTimePolymorphism();
		c.get();
		c.get(78);
		c.get(25,35);
		c.get(12.2f);
	}
    public void get()
    {
    	System.out.println("Method without parameter");
    }
    public void get(int a)
    {
    	System.out.println("Method with 1 parameter");
    	System.out.println("Method with parameter a="+a);
    }
    public void get(int a,int b)
    {
    	System.out.println("Method with 2 parameter");
    	System.out.println("Method with 2 parameter a="+a);
    	System.out.println("Method with 2 parameter b="+b);
    }
    public void get(float a)
    {
    	System.out.println("Method with 1 float parameter");
    	System.out.println("Method with 1 float parameter a="+a);
    }
    
    
}
