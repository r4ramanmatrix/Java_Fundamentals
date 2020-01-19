package string_concept;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;

public class STring_Practice02 {

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

	public static void main(String[] args) {
		STring_Practice02 obj = new STring_Practice02();
		obj.permutation("ABC");

		System.out.println("String reverse: ");
		String str = "this is the java";
		String[] strSplit = str.split(" ");
		for (int i = 0; i < strSplit.length; i++) {
			for (int j = strSplit[i].length() - 1; j >= 0; j--) {
				System.out.print(strSplit[i].charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println("\nOnly selected text reverse: ");

		String[] selectedText = { "the", "java" };
		List li = Arrays.asList(selectedText);
		for (String s1 : strSplit) {
			if (li.contains(s1)) {
				System.out.print(new StringBuffer(s1).reverse() + " ");
			} else {
				System.out.print(s1 + " ");
			}
		}
		System.out.println();
		String orderNumber = "xzxa,ydef,zasd$#?";
		String stringOnly = orderNumber.replaceAll("[^a-zA-Z,]", "");
		String specialOnly = orderNumber.replaceAll("[~\\w,]", "");
		String[] stringOnlySplit = stringOnly.split(",");
		for (int i = 0; i < stringOnlySplit.length; i++) {
			for (int j = stringOnlySplit[i].length() - 1; j >= 0; j--) {
				System.out.print(stringOnlySplit[i].charAt(j));
			}
			if (i < stringOnlySplit.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println(specialOnly);

		String[] stringArray = { "my name is java oracle" };
		for (String s : stringArray) {
			String[] sSplit = s.split(" ");
			String[] sReverse = { "name", "oracle" };
			List li1 = Arrays.asList(sReverse);
			for (String s1 : sSplit) {
				if (li1.contains(s1)) {
					System.out.print(new StringBuffer(s1).reverse() + " ");
				} else {
					System.out.print(s1 + " ");
				}

			}
		}

		System.out.println();
		FileReader file = null;
		FileWriter fw = null;
		try {

			file = new FileReader("File_Data/HashMap.txt");
			StringBuilder sb = new StringBuilder();
			int i;
			while ((i = file.read()) != -1) {
				// System.out.print((char)i);
				sb.append(String.valueOf((char) i));

			}
			String line = sb.toString();

			System.out.println(line);
			String[] lineSplit = line.split(" ");
			String[] reverseWords = { "HashMap", "the", "and", "you", "data", "one", "is", "in" };
			List li2 = Arrays.asList(reverseWords);
			String s2 = "";
			for (String ss : lineSplit) {
				if (li2.contains(ss)) {
					System.out.print(new StringBuffer(ss).reverse() + " ");
					s2 += " " + new StringBuffer(ss).reverse().toString();
				} else {
					System.out.print(ss + " ");
					s2 += " " + ss;
				}
			}

			fw = new FileWriter("File_Data/HashMap2.txt");
			fw.write(s2);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		} finally {
			try {
				file.close();
				fw.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
