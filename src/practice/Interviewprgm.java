package practice;

public class Interviewprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1 = "10010001";
		  String str2 = "11000011";
		  String str3 = "";
		for(int i=0;i<str1.length();i++)
		 {
		if (str1.charAt(i)=='1'|| str2.charAt(i)=='1')
		 {
		  str3= str3 +"1";
		 }
		else
		 {
		 str3=str3 +"0";
		 }
		 }
		System.out.println(str3);
		}
		

	}

