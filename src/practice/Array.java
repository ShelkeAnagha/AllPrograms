package practice;

public class Array {

	public static void main(RevString[] args)
	{
		// TODO Auto-generated method stub

		
		int a[]= new int[6];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
		
		//Array by using for loop
		
		for(int i=0;i<=5;i++)
		{
			
		System.out.println(a[i]);
		
		}
		
		//for using for each loop
		for (int i:a)
		 
		{
			System.out.println(i);
		}
		
		
		
		
	}

}
