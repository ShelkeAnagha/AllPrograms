package switchstatement;

import java.util.Scanner;

public class SwitchCalculationManualEnterValue {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int a,b,c;
		int choice;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Value of A");
		a=s.nextInt();
		System.out.println("Enter the Value of B");
		b=s.nextInt();
		System.out.println("Enter Your choice");
		choice=s.nextInt();
		
		
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