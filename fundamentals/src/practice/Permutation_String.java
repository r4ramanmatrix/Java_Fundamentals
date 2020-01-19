package practice;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Permutation_String {
	
	public static void printPermuatation(String prefix, String str) {
		
		if(str.length()==0) {
			System.out.println(prefix + " ");
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			printPermuatation(prefix+str.charAt(i), str.substring(0,i)+str.substring(i+1, str.length()));
		}
	}
	
	public void permutation(String str) {
		printPermuatation("", str);
	}
	public static void main(String[] args) {
		Permutation_String obj=new Permutation_String();
		obj.permutation("ABC");
		
		String duplicateString="ab c de fa f c hd i";
		System.out.println("Duplicate words: ");
		Set<Character> charSet=new HashSet<>();
		for(char ch:duplicateString.toCharArray()) {
			if(charSet.add(ch)==false) {
				System.out.println(ch);
			}
		}
		
		Map<String, Integer> stringMap=new LinkedHashMap<String, Integer>();
		String[] spliting=duplicateString.split(" ");
		for(String s:spliting) {
			if(stringMap.containsKey(s)) {
				stringMap.put(s, stringMap.get(s)+1);
			}else {
				stringMap.put(s, 1);
				}
			}
		System.out.println("Count: \n"+ stringMap);
	}

}
