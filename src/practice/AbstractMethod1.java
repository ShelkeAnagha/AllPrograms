package practice;

public class AbstractMethod1 extends AbstractMethod {

	public static void main(RevString[] args) {
		// TODO Auto-generated method stub
		
		AbstractMethod1 A = new AbstractMethod1();
	
		A.show();
		A.display();
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("inside in child class");
	}

	public void display() {
		super.display();
		System.out.println("inside child display method");
	}
}
