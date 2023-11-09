package practice;

public class RevString {

	public static void main(java.lang.String[] args) {
	
		StringBuffer sb= new StringBuffer("Ajay Burute");

	    System.out.println(sb);
	    
	    sb.reverse();
	    System.out.println(sb);
	    
	    sb.reverse();
		System.out.println(sb);
	    
	    System.out.println(sb.length());
	    
	    sb.insert(5,"Tanaji ");
	    System.out.println(sb);
	    
	    sb.delete(5, 11);
	    System.out.println(sb);
	    
	    sb.append(" Jath");
	    System.out.println(sb);
	 
	    

	}

}
