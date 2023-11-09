package practice;

import java.util.HashSet;

public class HashSetInJava {

	public static void main(RevString[] args) {
		
		// TODO Auto-generated method stub
		HashSet <Integer> ab = new HashSet();
		
		
		ab.add(null);
		ab.add(new Integer(11));
		ab.add(new Integer(10));// Duplicate value is not allowed
		ab.add(new Integer(15));
		ab.add(new Integer(14));
		
		System.out.println(ab);
		
		ab.remove(1);
		System.out.println(ab);
		
	//  ab.add(1, new Integer(11)); //index not allowed
	//  System.out.println(ab);
		
		HashSet<Object> at = new HashSet();
		at.add("Hello");
		at.add(12.45);
		at.add(15.30f);
		at.add(new Integer(20));
		System.out.println(at);
		
		at.addAll(ab);
		System.out.println(at);

	}

}
