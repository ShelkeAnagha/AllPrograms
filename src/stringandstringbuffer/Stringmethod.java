package stringandstringbuffer;

public class Stringmethod {

	public static void main(String[] args) 
	
	{
		String str="Hello";
		System.out.println(str);
		String st="hello";
		
	
		String str1=str.toUpperCase();
		System.out.println(str1);
		
		String str2=str.toLowerCase();
		System.out.println(str2);
		
		String str3="Sis Global";
		System.out.println(str3);
		
		String str4=str3.replace("Sis Global", "Fis Global");
		System.out.println(str4);
		
		String str5="Programming";
		System.out.println(str5);
		
		String str6=str4.concat(str5);
		System.out.println(str6);
	
		int m=str6.indexOf('P');
		System.out.println("Index of P="+m);
		
		int n=str6.indexOf('G');
		System.out.println("Index of G="+n);
		
		char j=str6.charAt(11);
		System.out.println("char at 11 Position="+j);
		
		boolean z = str6.startsWith("Fis");
		System.out.println(z);
		
		boolean w = str6.endsWith("ing");
		System.out.println(w);

		boolean i = str6.contains("ram");
		System.out.println(i);
		
		int u = str.compareTo(st);
		System.out.println(u);
		
		String st1[]=str6.split(" ");
		System.out.println(st1[0]);
		System.out.println(st1[1]);
		
	}
		

}
