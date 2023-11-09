
package encapsulation;

public class TestEncapsulation {
	
	private int     a=45;
	public int getA() 
	{
		return a;
	}

	public void setA(int a) 
	{
		this.a = a;
	}

	public float getX() 
	{
		return x;
	}

	public void setX(float x) 
	{
		this.x = x;
	}

	public boolean isY() 
	{
		return y;
	}

	public void setY(boolean y) 
	{
		this.y = y;
	}

	public char getZ() 
	{
		return z;
	}

	public void setZ(char z) 
	{
		this.z = z;
	}

	private float   x=78.4f;
	private boolean y=false;
	private char    z='q';

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		TestEncapsulation t1=new TestEncapsulation();
		
		t1.setA(100);
		t1.setX(85.98f);
		t1.setY(true);
		t1.setZ('k');
		
		int n=t1.getA();
		System.out.println("Value of A="+n);
		float m=t1.getX();
		System.out.println("Value of X="+m);
		boolean o=t1.isY();
		System.out.println("Value of Y="+o);
		char  p=t1.getZ();
		System.out.println("Value of Z="+p);
		
	}
}
