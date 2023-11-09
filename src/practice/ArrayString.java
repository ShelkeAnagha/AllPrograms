package practice;

public class ArrayString {

	public static void main(RevString[] args) 
	{
		// TODO Auto-generated method stub

		String s[]=new String[3];
		
	    s[0]="Welcome";
		s[1]="To";
		s[2]="Training";
		
		System.out.println(s.length); //to find out length of an array
		
		for(String i:s)
		{
			System.out.println(i);
		}
	}

}
