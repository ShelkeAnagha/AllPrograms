package practice;

public class Employee 
{

	

		int empid=101;
	    String empname="Raj";
		int salary=10000;
		int deptno=10;
		
	 
		void display()
		
		{
			System.out.println(empid);
			System.out.println(empname);		
			System.out.println(salary);
			System.out.println(deptno);
		}
		 	

  public static void main(RevString[] args) 
  {
	// TODO Auto-generated method stub

    Employee emp1 = new Employee();
    emp1.display();
  }
  
  
}