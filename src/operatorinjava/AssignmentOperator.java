package operatorinjava;

public class AssignmentOperator 
{
	//(=, +=, -=, *=, /=, %=)

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// = assignment operator
		int n=60;
		int m=10;
		
		//+=
		n+=10; //n=n+10 60+10=70
		System.out.println("value of n="+n);
		n+=m;  //n=n+m 70+10=80 
		System.out.println("value of n="+n);
		
		//-=
		n-=10; //n=n-10 80-10=70
		System.out.println("value of n="+n);
		
		//*=
		n*=m; //n=n*m 70*10=700
		System.out.println("value of n="+n);
		
		// /=
		n/=m; //n=n/m 700/10=70
		System.out.println("value of n="+n);
		
		// %=
		n%=m; //n=n%m 70%10
		System.out.println("value of n="+n);
		
		

	}

}
