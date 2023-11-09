package practice;

public class ThrowkeywordException {

	public static void main(RevString[] args) {
		// TODO Auto-generated method stub

		int a=-10;
		if(a<0) {
			
			try {
				 throw  new ArithmeticException();
			    }
	        catch(ArithmeticException e)
	        {
	        	e.printStackTrace();
	        	System.out.println("Number is negative");
	        }
		}
		else
		{
			System.out.println("Number is positive");
		}
			
	}

}
