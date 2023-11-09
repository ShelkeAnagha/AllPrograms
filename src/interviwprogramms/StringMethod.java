package interviwprogramms;

public class StringMethod {

	public static void main(String[] args) {
		
		String str="Ajay";
		String sb ="Sis Global";
		
		System.out.println(str);
		
		String str1=str.toUpperCase();
		System.out.println(str1);
		
		String str2=str.toLowerCase();
		System.out.println(str2);
		
		String str3=sb.replace("Sis","Fis");
		System.out.println(str3);
		
		String str4=sb.concat(str);
		System.out.println(str4);
		
		int str5=sb.indexOf('b');
		System.out.println(str5);
		
		char str6=sb.charAt(8);
		System.out.println(str6);

	}

}
