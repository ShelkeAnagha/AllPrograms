package interviwprogramms;

public class PalindromeNumberOrNot {

	public static void main(String[] args) {
		
		int num=1551;
		int rev=0;
		int temp;
		int pal=num;
		
		while(num>0)
		{
			temp=num%10;
			rev =rev*10+temp;
			num =num/10;
			
		}
        
        if(rev==pal) {
        	System.out.println("The given number is Palindrome");
        }
        else
        {
        	System.out.println("The given number is not Palindrome");
        }
	}

}
