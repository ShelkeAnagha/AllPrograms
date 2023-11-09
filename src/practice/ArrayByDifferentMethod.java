package practice;

public class ArrayByDifferentMethod {

	public static void main(RevString[] args) 
	
	{
		// TODO Auto-generated method stub

		
		int a[]= {100,200,300,400,500};
		
		//for printing array
		for(int i:a)
		
		{
			System.out.println(i);
			
		}
		
		System.out.println(a.length);
		
		
		//for Sum of all array
		int sum=0;
		
		for(int i:a)
		{
			System.out.println(i);
			sum=sum+i;
			
		}
		    System.out.println(sum); 
		
	}

}
