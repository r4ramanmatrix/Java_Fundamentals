package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Concept {

	public static void main(String[] args) {
		Set sets = new HashSet();
		sets.add(20);
		sets.add('X');
		sets.add("Java");
		sets.add("X: String");
		
		System.out.println("*******Iterate Set using for*******");
		for(Object s:sets) {
			System.out.println(s);
		}
		
		System.out.println("*******Iterate Set using iterator*******");
		Iterator itr=sets.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
