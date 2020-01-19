package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set_To_Array_Conversion {
	
	public static void main(String[] args) {
		Set s=new HashSet<>();
		s.add("F");
		s.add("R");
		s.add("S");
		s.add("I");
		s.add("T");
		
		String[] str=Arrays.copyOf(s.toArray(), s.size(), String[].class);
		for(String s1:str) {
			System.out.println(s1);
		}
	}

}
