package practice;

import java.util.ArrayList;

public class Arraylist {

	public static void main(RevString[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> at = new ArrayList();
		
		at.add(null);
		at.add(new Integer(10));
		at.add(new Integer (12));
		at.add(new Integer(15));
		at.add(new Integer(87));
		at.add(new Integer(93));
		
		System.out.println(at);
		
		at.remove(2);
		at.add(2,new Integer(13));
		System.out.println(at);
		
		ArrayList<Object> ar = new ArrayList();
		
		ar.add("Hello");
		ar.add(new Integer(16));
		ar.add(new Integer(19));
		ar.add(12.24);
		ar.add(13.26f);
		
		
		System.out.println(ar);
		
		ar.addAll(at);
		System.out.println(ar);
	}

}
