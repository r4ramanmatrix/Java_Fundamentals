package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayList_Concept {
	
	public static void main(String[] args) {
		List li=new ArrayList<>();
		li.add(2019);
		li.add(2019);
		li.add(2019);
		li.add(2019);
		li.add(2019);
		li.add(2019);
		li.add(2019);
		li.add(2019);
		li.add(2019);
		li.add(2019);
		ListIterator ltr=li.listIterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		System.out.println(li.size());
		li.add(2020);
		System.out.println(li.size());
		
	}

}
