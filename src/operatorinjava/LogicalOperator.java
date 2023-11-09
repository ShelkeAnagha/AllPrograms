package operatorinjava;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=90;
		int b=22;
		int c=22;
		
		// logical and (&&)
	    boolean d = (a>b)&&(a>c);
	    System.out.println("logical && d="+d);
	    
	    boolean g=(a>b) && (b>a);
	    System.out.println("logical && g="+g);
	    
	    // logical or (||)
	    boolean e = (a>b) || (b>c);
	    System.out.println("logical || e="+e);
	  
	    //logical not (!)
	    boolean f = (c!=b);
	    System.out.println("logical ! f="+f);

	}

}
