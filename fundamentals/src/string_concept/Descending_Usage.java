package string_concept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Descending_Usage {
	
	public static void main(String[] args) {		
		List al=new ArrayList<>();
		al.add(new Descending_Sorting(30, "java1"));
		al.add(new Descending_Sorting(29, "java0"));
		al.add(new Descending_Sorting(31, "java20"));
		al.add(new Descending_Sorting(33, "java10"));
		
		for(Object ds:al) {
			System.out.println(ds);
		}
		
		Collections.sort(al);
		System.out.println("After sorting");
		for(Object ds:al) {
			System.out.println(ds);
		}
	}

}
