package collection;

import java.util.ArrayList;

public class ArrayListInJava {

	public static void main (String[] args)
	
	{
		ArrayList<Integer> ar=new ArrayList();
		ar.add(null);
		ar.add( (10));
		ar.add( (20));
		ar.add( (10));
		ar.add( (56));
		System.out.println(ar);
		
		ar.remove(0);
		ar.remove(3);
		ar.add(2,new Integer(30));
		System.out.println(ar);
		
		ArrayList<Object> at= new ArrayList();
		at.add(50);
		at.add("Hello");
		at.add(30.50);
		System.out.println(at);
		
		at.addAll(ar);
		System.out.println(at);
		
	}
	
}
