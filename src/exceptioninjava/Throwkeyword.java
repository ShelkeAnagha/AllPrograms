package exceptioninjava;

public class Throwkeyword{

	public static void main(String[] args) 
	
	{
		int a=-9;
		if(a<0)
		{
			try
			{
				throw new ArithmeticException();
			}
			catch(ArithmeticException e)
			{
      			e.printStackTrace();
				System.out.println("Number is Negative");
			}
		}
		else
		{
			System.out.println("Number is Positive");
		}
	}
	

}
