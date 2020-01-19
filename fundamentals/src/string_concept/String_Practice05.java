package string_concept;

import java.util.LinkedHashSet;
import java.util.Set;

public class String_Practice05 {
	
	static String str1="my name is java oracle";
	
	public static void printPermutation(String prefix, String str) {
		if(str.length()==0) {
			System.out.println(prefix+ " ");
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			printPermutation(prefix+str.charAt(i), str.substring(0, i)+str.substring(1+i, str.length()));
		}
	}
	
	public void permutation(String str) {
		printPermutation("", str);
	}
	
	public static String sortMethod(String str) {
		char[] ch=str.toCharArray();
		char temp=0;
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch.length-1;j++) {
				if(ch[j]>ch[j+1]) {
					temp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
			}
		}
		return new String(ch);
	}
	
	public static void main(String[] args) {
		String_Practice05 obj=new String_Practice05();
		System.out.println("Permutation of a String: ");
		obj.permutation("ABC");
		String[] str1Split=str1.split(" ");
		System.out.println("Sorting of String on their position: ");
		for(String s:str1Split) {
			System.out.print(sortMethod(s) + " ");
		}
		System.out.println("\nOnly unique characters or remove all duplicates from a string");
		Set<Character> charSet=new LinkedHashSet<>();
		for(char ch:str1.toCharArray()) {
			charSet.add(ch);
		}
		StringBuilder sb=new StringBuilder();
		for(char ch1:charSet) {
			sb.append(ch1);
		}
		System.out.println(sb.toString().trim());
		System.out.println("\nDuplicate characters from the String");
		Set<Character> charSet2=new LinkedHashSet<>();
		for(char ch:str1.toCharArray()) {
			if(charSet2.add(ch)==false) {
				System.out.print(ch);
			}
		}
		
	}

}
