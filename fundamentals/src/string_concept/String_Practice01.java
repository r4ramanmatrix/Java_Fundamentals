package string_concept;

import java.util.Arrays;
import java.util.List;

public class String_Practice01 {

	public static void printPermutation(String prefix, String str) {
		if (str.length() == 0) {
			System.out.println(prefix + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			printPermutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(1 + i, str.length()));
		}
	}

	public void permuatation(String str) {
		printPermutation("", str);
	}

	public static void main(String[] args) {
		String_Practice01 obj1 = new String_Practice01();
		obj1.permuatation("ABC");

		System.out.println("String statement reverse: ");
		String str1 = "this is the string statement";
		String[] str1Split = str1.split(" ");
		for (int i = 0; i < str1Split.length; i++) {
			for (int j = str1Split[i].length() - 1; j >= 0; j--) {
				System.out.print(str1Split[i].charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println("\nSelected word reverse in a string array: ");
		String[] str2 = { "my name is java" };
		for (String s : str2) {
			String[] sSplit = s.split(" ");
			String[] sReverse = { "name", "java" };
			List li = Arrays.asList(sReverse);
			for (String s1 : sSplit) {
				if (li.contains(s1)) {
					System.out.print(new StringBuffer(s1).reverse() + " ");
				} else {
					System.out.print(s1 + " ");
				}
			}
		}
		System.out.println("\nString reverse on their position with special characters: ");
		String str3 = "Raman,Kumar,Sharma,,Ji$?";
		String stringOnly = str3.replaceAll("[^a-zA-Z,]", "");
		String special = str3.replaceAll("[~\\w,]", "");
		String[] stringSplit = stringOnly.split(",");
		for (int i = 0; i < stringSplit.length; i++) {
			for (int j = stringSplit[i].length() - 1; j >= 0; j--) {
				System.out.print(stringSplit[i].charAt(j));
			}
			if (i < stringSplit.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println(special);

		String names = "firstname lastname";
		String[] namings = names.split(" ");
		char[] ch1 = namings[0].toCharArray();
		char[] ch2 = namings[1].toCharArray();
		char temp = 0;
		for (int i = 0; i < ch1.length; i++) {
			for (int j = 0; j < ch1.length - 1; j++) {
				if (ch1[j] > ch1[j + 1]) {
					temp = ch1[j];
					ch1[j]=ch1[j+1];
					ch1[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < ch2.length; i++) {
			for (int j = 0; j < ch2.length - 1; j++) {
				if (ch2[j] > ch2[j + 1]) {
					temp = ch2[j];
					ch2[j]=ch2[j+1];
					ch2[j+1]=temp;
				}
			}
		}
		System.out.print(new String(ch1) + " " + new String(ch2));
		
		

	}

}
