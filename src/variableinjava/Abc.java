package variableinjava;

public class Abc {

	public static void main(String[] args) {
		
		String str= "my name is Mr. kiran mohan deshmukh";
		
		char a= 'a';
		
        int count=  0;
		
		for(int i=0;i<str.length()-1;i++)
		{
			if(a==str.charAt(i))
			{
				count++;
			}
		}
		System.out.println("Frequency of char = " +count);
		
		
		
	}

}
