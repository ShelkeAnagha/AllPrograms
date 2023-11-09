package arrayinjava;

public class OneDimensionalArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]= new int[5];
		a[0]=11;
		a[1]=12;
		a[2]=13;
		a[3]=14;
		a[4]=15;
		
		int sum = 0;
		
		System.out.println(a[0]);
		System.out.println(a[3]);
		
		int l=a.length;
		System.out.println("Length of Array A="+l);
		for(int i=0;i<a.length;i++)
		{
			//System.out.println(a[i]);
			sum=sum+a[i];
			System.out.println("Sum="+sum);
		}
		
		
		int b[]= {21,22,23,24,25,26,27};
		int l1=b.length;
		System.out.println("Length of Array B="+l1);
		for(int i=0;i<b.length;i++)
		{
	
			System.out.println(b[i]);
			//sum=sum+b[i];
			//System.out.println("sum="+sum);
		}
			
	}

}
