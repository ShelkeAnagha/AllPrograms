package collection;

import java.util.TreeSet;

public class TreeSetInJava {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	TreeSet <Integer> ar= new TreeSet<Integer>();
		
		//ar.add(null);
		ar.add(new Integer(10));
		ar.add(new Integer(23));
		ar.add(new Integer(10));
		ar.add(new Integer(56));
		ar.add(45);
		System.out.println(ar);
		
		ar.remove(new Integer(45));
		System.out.println(ar);
	
       // ar.add(2,46);
	  //System.out.println(ar);
	
		TreeSet<Object> ar1=new TreeSet();
		
		//ar1.add(10);
	    ar1.add("Hello");
	   //ar1.add("78.76");
		System.out.println(ar1);
	}
	}


