package interviwprogramms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num = 1234;//1634
		int rev = 0;
		int temp;
		int arm=num;
		
		while(num>0) {
			
			temp= num%10;
			rev = rev+temp*temp*temp*temp;
			num = num/10;
		}
        if(rev==arm)
        {
        	System.out.println("armstrong number");
        }
        else
        {
        	System.out.println("not a armstrong number");
        }
	}

}
