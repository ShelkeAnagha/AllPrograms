package practice;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashset {
		
		public static void main(RevString[] args) {
			LinkedHashSet<Integer> ab = new LinkedHashSet();
			
			ab.add(null);            //null is allowed
			ab.add(new Integer(10));
			ab.add(new Integer(11));
			ab.add(new Integer(10)); //Duplicate not Allow
			ab.add(new Integer(15));
			ab.add(new Integer(14));
			
			System.out.println(ab);
			
			ab.remove(1);
			System.out.println(ab);
			
			//ab.add(1, new Integer(11));
			System.out.println(ab);
			
			LinkedHashSet<Object> at = new LinkedHashSet();
			at.add("Hello");
			at.add(12.45);
			at.add(15.30f);
			at.add(new Integer(20));
			System.out.println(at);
			
			at.addAll(ab);
			System.out.println(at);
			

	}

}
