package string_concept;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_Practice_04 {

	public static String[] str = { "Employee Self Service web portal" };
	static String names = "firstname middlename lastname";

	public static String sortMethod(String sortS) {
		char temp = 0;
		char[] ch = sortS.toCharArray();
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

	public static void main(String[] args) {
		for (String s1 : str) {
			String[] s1Split = s1.split(" ");
			String[] sReverse = { "Self", "portal" };
			List li = Arrays.asList(sReverse);
			for (String ss1 : s1Split) {
				if (li.contains(ss1)) {
					System.out.print(new StringBuffer(ss1).reverse() + " ");
				} else {
					System.out.print(ss1 + " ");
				}
			}
		}

		System.out.println();

		String[] nameSplit = names.split(" ");
		for (String naming : nameSplit) {
			System.out.print(sortMethod(naming) + " ");
		}

		System.out.println();
		String specString = "raman,kumar,sharma,aditya, kumar#$#";
		String stringOnly = specString.replaceAll("[^a-zA-Z,]", "");
		String specialOnly = specString.replaceAll("[~\\w,]", "");
		String[] stringSplit = stringOnly.split(",");
		for (int i = 0; i < stringSplit.length; i++) {
			for (int j = stringSplit[i].length() - 1; j >= 0; j--) {
				System.out.print(stringSplit[i].charAt(j));
			}
			if (i < stringSplit.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println(specialOnly.trim());

		String rbsString = "a.b.c.d.";// c,d,b,a
		String stringReplace = rbsString.replaceAll("\\.", ",");
		System.out.println(stringReplace);
		String ss2 = stringReplace.substring(0, stringReplace.length() / 2);
		String ss3 = stringReplace.substring(stringReplace.length() / 2, stringReplace.length() - 1);
		System.out.print(ss3 + "" + new StringBuffer(ss2).reverse());

		System.out.println("\nmaximum occurring character in a String");
		String charString = "Bhuvana Venkata Sanbbbbbbbbbthosh Kumar";
		Map<Character, Integer> charMap = new LinkedHashMap<>();
		int cont = 0;
		Character value = null;
		for (char ch : charString.toCharArray()) {
			if (charMap.containsKey(ch)) {
				if (cont < charMap.get(ch)) {
					cont = charMap.get(ch) + 1;
					value = ch;
				}
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				if (cont < 1) {
					cont = 1;
					value = ch;
				}
				charMap.put(ch, 1);
			}
		}
		System.out.println(value);
		System.out.println(charMap);

		String s1 = "India is great";
		String s2 = "in";
		String regex = s2.toUpperCase() + "" + s2.toLowerCase();
		String srepl = s1.replaceAll("[" + regex + "]", "");
		System.out.println(srepl);

		String x1 = "XYZ";
		String x2 = "ZXY";
		if (x1.length() != x2.length()) {
			System.out.println(false);
		} else {
			char ch = x1.charAt(0);
			int po = x2.indexOf(ch);

			String x3 = x2.substring(po, x2.length()) + "" + x2.substring(0, po);
			if (x3.equalsIgnoreCase(x1)) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}

			if (po != -1) {
				boolean flag = true;
				for (int i = 1; i < x1.length() && flag; i++) {
					if (x1.charAt(i) != x2.charAt((po + i) % x1.length())) {
						flag = false;
					}
				}
				if (!flag) {
					System.out.println(false);
				} else {
					System.out.println(true);
				}

			} else {
				System.out.println(false);
			}
		}
		
		String regexS="[a-zA-Z]*(i|e|y)";
		Pattern p=Pattern.compile(regexS);
		Matcher m=p.matcher("jyotiyere");
		boolean b=m.matches();
		System.out.println(b);
		
		
	}

}
