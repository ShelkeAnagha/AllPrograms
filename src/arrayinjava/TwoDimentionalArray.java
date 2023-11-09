package arrayinjava;

public class TwoDimentionalArray 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       
		int a[][]=new int[2][2];
		a[0][0]=11;
		a[0][1]=12;
		a[1][0]=14;
		a[1][1]=15;
		//System.out.println(a[0][0]);
		//System.out.println(a[0][1]);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.println(a[i][j]);
				//System.out.println("Array index:"+ i +"-"+ j + ":" +a[i][j]);
			}
		}
			
		
	

	}	
}