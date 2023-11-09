package interviwprogramms;

public class CheckForPrimeNumber {

	public static void main(String[] args) {
				
		int num =13;
		int temp=0;
		
		for (int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
		
        if(temp>0)
        {
        	System.out.println("Not a prime Number");
        }
        else
        {
        	System.out.println("Prime Number");
        }
	}

}
