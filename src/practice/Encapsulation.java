package practice;

public class Encapsulation {
	
	private int      a=50;
	private float    b=10.23f;
	private boolean  c=true;
	private char     d='A';
	
	public int getA() {
		return a;
	}



	public void setA(int a) {
		this.a = a;
	}



	public float getB() {
		return b;
	}



	public void setB(float b) {
		this.b = b;
	}



	public boolean getC() {
		return c;
	}



	public void setC(boolean c) {
		this.c = c;
	}



	public char getD() {
		return d;
	}



	public void setD(char d) {
		this.d = d;
	}




	

	public static void main(RevString[] args) {
		// TODO Auto-generated method stub

		Encapsulation t1 = new Encapsulation();
		t1.setA(100);
		t1.setB(50.50f);
		t1.setC(true);
		t1.setD('A');
		int n=t1.getA();
		System.out.println("Value of A="+n);
		float m=t1.getB();
		System.out.println("Value of B="+m);
		boolean o=t1.getC();
		System.out.println("Value of C="+o);
		char p=t1.getD();
		System.out.println("Value of D="+p);
		
		
		
	}

}
