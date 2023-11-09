package variableinjava;

public class VariableInJava {

	int emp_salary;  //class variable or instance variable
	static String emp_address;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//local variables -- variables declared and initialised in function/method called as local variable
		int emp_id=505;
		String emp_city="pune";
		
		int a=23;
		int b=56;
		double q = 245.78;
		boolean x = true;
		
		System.out.println("Employee ID:"+emp_id);
		System.out.println("Employee city:"+emp_city);
		System.out.println("q="+q);
		System.out.println("a="+a);
		
		System.out.println("a="+a+" b="+b);
		
		System.out.println("Employee ID="+emp_id+"  Employee city="+emp_city);
		
		VariableInJava v=new VariableInJava();  //creating an object
		
		v.emp_salary=78000;
		v.display();
		
		//emp_salary=78000;
		
		emp_address="Mumbai";
		show();
					

	}


       //static function or method

        public static void show()
        {
           
        	System.out.println("In show method");
            
       
        }   
          //non static function or method
        
        public void display()
        
        {
        	System.out.println("In Display Method");
        }
            
    }  
            
            
            
            
            
            
            
            
        