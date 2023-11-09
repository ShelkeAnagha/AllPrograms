package stringandstringbuffer;

public class StringBufferMethod {

	public static void main(String[] args) 
	
	// String Buffer methods
	// 1.length
	// 2.append
	// 3.reverse
	// 4.delete
	// 5.insert
	
	
	{
		StringBuffer sb=new StringBuffer ("Pandharpur");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		//To find length
		System.out.println("String length="+sb.length());
		
		//Append method
		sb.append(" Solapur");
		System.out.println("String after Append method="+sb);
		
		//insert
		sb.insert(0, "Vittal temple at");
		System.out.println("String after insert method="+sb);
		
		//Reverse
		sb.reverse();
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		//delete
		sb.delete(7, 14);
		System.out.println(sb);
		

	}

}
