package operatorinjava;

public class TernaryOperator //conditional operator
{
  
	//( ?:)
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		
		
		int d=(a>b)?a:b;
		System.out.println("Largest value="+d);  
		
		// if we have to find out largest number between two/three numbers,then we use the Ternary Operator
		
		
		int c=30;
		int e=(a>b)?(a>c ? a:c):(b>c ? b:c);
		System.out.println("Largest value="+e);
	}

}
