package practice;

public class ArrayObject {

	public static void main(RevString[] args) 
	{
		// TODO Auto-generated method stub

		 // for different datatype we have create object
		 
		Object a[]=new Object[5];
		
		a[0]=10;        //integer
		a[1]=20.5;      //double
		a[2]="Welcome"; //String
		a[3]='G';       //Char
		a[4]=true;      //boolean
		
		for(Object i:a)
		{
			System.out.println(i);
		}
		
		
	}

}
