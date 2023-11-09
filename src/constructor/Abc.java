package constructor;

public class Abc {
 
	        int a,b;
	        
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       
		Abc a1=new Abc();
		    a1.display();
		    a1.calculate();
		    
		    
		Abc a2=new Abc(5,7);
		    a2.display();
		    a2.calculate();
		    
		
		
		
	}
    Abc()
    {
    	a=20;
    	b=25;
    	
    }
    public void display()
    
    {
    	System.out.println("Value of A="+a);
        System.out.println("Value of B="+b);
    }
    public void calculate()
    {
    
    System.out.println("mul="+(a*b));
    }
    Abc (int x, int y)
    {
    	a=x;
    	b=y;
    }
}
