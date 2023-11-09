package operatorinjava;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArithmeticOperator ao = new ArithmeticOperator();
		ao.addition();
        ao.substraction();
        ao.multiplication();
        ao.division();
        ao.modulus();
        
	}
     
	public void addition()
	{
		int a=55,b=67;
		int add=a+b;
		System.out.println("addition="+add);
		
	}
	
	public void substraction()
	
	{
	    double a= 35.67,b=89.22,sub;
	    sub=a-b;
	    System.out.println("substraction="+sub);
	
	}
	
	public void multiplication()
	
	{
		float a=39.45f,b=2.5f,mul;
		mul=a*b;
		System.out.println("multiplicatin="+mul);
		
	}
	
	public void division()
	
	{
	    int a=55,b=2,div;
	    div=a/b;
	    System.out.println("division="+div);
	
	}

	public void modulus()
	
	{
	int a=102,b=4,mod;
	mod=a%b;
	System.out.println("modulus="+mod);
}
	
}
