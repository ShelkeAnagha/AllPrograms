package practice;

import java.util.LinkedList;

public class Linkedlist {
	
	public static void main(RevString[] args) {
	LinkedList<Integer> ab = new LinkedList();
	
	ab.add(new Integer(10));
	ab.add(new Integer(11));
	ab.add(new Integer(12));
	ab.add(new Integer(13));
	ab.add(new Integer(14));
	
	System.out.println(ab);
	
	ab.remove(1);
	System.out.println(ab);
	
	ab.add(1, new Integer(11));
	System.out.println(ab);
	
	LinkedList<Object> at = new LinkedList();
	at.add("Hello");
	at.add(12.45);
	at.add(15.30f);
	at.add(new Integer(20));
	System.out.println(at);
	
	at.addAll(ab);
	System.out.println(at);
	
	
	
	
	
	
	
	
	
	}
}
