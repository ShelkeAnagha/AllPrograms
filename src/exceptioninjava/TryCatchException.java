package exceptioninjava;

public class TryCatchException {

	public static void main(String[] args)
	
	{
		
		try
		{
			
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println("Hello Java");
			System.out.println("Programming");
			System.out.println("Value of c="+c);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			//System.out.println("Arithmetic Exception");
		}
		finally
		{
			System.out.println("Main Method Ended");
		}
	}

}
