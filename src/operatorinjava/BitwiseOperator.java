package operatorinjava;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// static method called so no need of object
		bitwise();
		
	}
	
	public static void  bitwise()
	{
		//calculating the binary from decimal value
	    //1110-----14--- 0*2^0 + 1*2^1 + 1*2^2 + 1*2^3
		
		int a=8 , b=6;
		
		//if both bits are 1 then only output is 1
		// And operator
		int c = a & b;
		System.out.println("c="+c);
		
		
		//if one of the input is 1 then output is 1
		//OR operator
		c = a | b;
		System.out.println("c="+c);
		
		
		//if both bits are 0 or 1 then output is 0
		//XOR operator
		c = a ^ b;
		System.out.println("c="+c);
	}
}
