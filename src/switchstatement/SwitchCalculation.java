package switchstatement;

public class SwitchCalculation {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int a=20,b=12,c;
		int choice=1;
		
		switch(choice)
		
		{
		case 1: c=a+b;
		       System.out.println("addition="+c);
		       break;
		case 2: c=a-b;
	           System.out.println("Subtraction="+c);
	           break;
		case 3: c=a*b;
	           System.out.println("Multiplication="+c);
	           break;
		case 4: c=a/b;
	           System.out.println("Division="+c);
	           break;   
		default:
	           System.out.println("Wrong choice");
	             
	          
	       
	   	
		}
		
	}

}
