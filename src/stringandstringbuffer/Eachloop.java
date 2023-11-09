package stringandstringbuffer;

public class Eachloop 
{
	
	public static void main(String[]args)
	{
		
	int a[]= {1,2,3,4,5};
	
	
	
	//1.using for loop
	
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}

	System.out.println("Using For Each loop");
	for (int i:a)
		
	{
		System.out.println(i);
	}
	


}
 
}

