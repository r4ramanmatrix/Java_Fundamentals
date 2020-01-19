package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator_Usage_Lists {

	public static void main(String[] args) {
		List li = new ArrayList();
		li.add(new Comparator_Usage(60, "ABC"));
		li.add(new Comparator_Usage(66, "BCA"));
		li.add(new Comparator_Usage(50, "ABCA"));
		li.add(new Comparator_Usage(40, "DABC"));
		li.add(new Comparator_Usage(77, "ABC"));
		
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		
		System.out.println("******************");
		
		Collections.sort(li, new Comparator_Usage_SortAge());
		
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		
		
		
	}

}
