package practice;

public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str= "ajay Tanaji burute";
		  char a = 'a';
		  int Counter = 0;
		for(int i=0;i<str.length()-1;i++)
		{
		  if (a==str.charAt(i))
		{
		   Counter++;
		}
		}
		System.out.println(" Count Of Character " +a+ " ="+Counter);
		}
		
		


	}


