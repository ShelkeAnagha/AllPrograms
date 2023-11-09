package operatorinjava;

public class ShiftOperator {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int a=32;
		int t;
		
		//Right Operator
		
		t=a>>1;
		System.out.println("Right Shift Value="+t);
		
		t=a>>2;
		System.out.println("Right Shift Value="+t);
		
		//Left Shift value
		
		t=a<<1;
		System.out.println("Left Shift Value="+t);
		
		t=a<<2;
		System.out.println("Left Shift Value="+t);

	}

}
