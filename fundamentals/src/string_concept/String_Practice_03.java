package string_concept;

import java.io.FileReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class String_Practice_03 {

	static String names = "my name is raman";
	static String[] city = { "delhi gurgaon noida pune mumbai" };
	static String randomString = "madam,sir,read$#?";

	public static void printPermutation(String prefix, String str) {
		if (str.length() == 0) {
			System.out.println(prefix + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			printPermutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(1 + i, str.length()));
		}
	}

	public void permutation(String str) {
		printPermutation("", str);
	}

	public static String sortMethod(String str) {
		char temp = 0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length - 1; j++) {
				if (ch[j] > ch[j + 1]) {
					temp = ch[j];
					ch[j] = ch[j + 1];
					ch[j + 1] = temp;
				}
			}
		}
		return new String(ch);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String_Practice_03 obj = new String_Practice_03();
		obj.permutation("ABC");

		String[] sSplit = names.split(" ");
		for (String name : sSplit) {
			System.out.print(sortMethod(name) + " ");
		}
		System.out.println("*****Reverse selected words in a string array*******");
		for (String cities : city) {
			String[] cSplit = cities.split(" ");
			String[] cityReverse = { "gurgaon", "noida", "mumbai" };
			List li = Arrays.asList(cityReverse);
			for (String s1 : cSplit) {
				if (li.contains(s1)) {
					System.out.print(new StringBuffer(s1).reverse() + " ");
				} else {
					System.out.print(s1 + " ");
				}
			}
		}

		System.out.println("\n****************");
		String statement = "this is the string statement";
		String[] stateSplit = statement.split(" ");
		for (int i = 0; i < stateSplit.length; i++) {
			for (int j = stateSplit[i].length() - 1; j >= 0; j--) {
				System.out.print(stateSplit[i].charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println("\n******************");
		String stringOnly = randomString.replaceAll("[^a-zA-Z,]", "");
		String specialOnly = randomString.replaceAll("[~\\w,]", "");
		String[] onlySplit = stringOnly.split(",");
		for (int i = 0; i < onlySplit.length; i++) {
			for (int j = onlySplit[i].length() - 1; j >= 0; j--) {
				System.out.print(onlySplit[i].charAt(j));
			}
			if (i < onlySplit.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println(specialOnly);

		FileReader file = null;
		StringBuilder sb = null;
		try {
			file = new FileReader("File_Data/HashMap.txt");
			sb = new StringBuilder();
			int i;
			while ((i = file.read()) != -1) {
				sb.append(String.valueOf((char) i));
				System.out.print((char) i);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				file.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		Set<Character> charSet = new LinkedHashSet<>();
		for (char ch1 : names.toCharArray()) {
			charSet.add(ch1);
		}
		StringBuilder sb3 = new StringBuilder();
		for (char ch : charSet) {
			sb3.append(ch);
		}
		System.out.println("\nOnly unique character from a string: " + sb3.toString());

		Map<Character, Integer> charMap = new LinkedHashMap<>();
		for (char ch : names.toCharArray()) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}
		System.out.println("Count of occurence of character in a string: \n" + charMap);

		String name1 = "java";
		String name2 = "selenium";

		System.out.println("Name1 Before swapping: " + name1);
		System.out.println("Name2 Before swapping: " + name2);

		name1 = name1 + name2;
		name2 = name1.substring(0, name1.length() - name2.length());
		name1 = name1.substring(name2.length());

		System.out.println("Name1 after swapping: " + name1);
		System.out.println("Name2 after swapping: " + name2);

		int a = 10;
		int b = 95;
		int c = 20;

		if (a > b && a > c) {
			System.out.println("A is greater");
		} else if (b > a && b > c) {
			System.out.println("B is greater");
		} else {
			System.out.println("c is greater");
		}

		int[] arr = { a, b, c };
		System.out.println("Second highest number: " + arr[arr.length - 1]);

	}

}
