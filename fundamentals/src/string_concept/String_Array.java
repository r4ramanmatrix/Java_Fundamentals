package string_concept;

import java.util.Arrays;
import java.util.List;

public class String_Array {

	public static void main(String[] args) {

		String special = "abcd,efer,gfgf$?"; // dcba,fe$?
		String s = special.replaceAll("[^a-zA-Z,]", "");
		String spec = special.replaceAll("[~\\w,]", ""); // *******\\w to retrieve all special character
		System.out.println(spec);
		System.out.println(s);
		String[] splitS = s.split(",");

		for (int i = 0; i < splitS.length; i++) {
			for (int j = splitS[i].length() - 1; j >= 0; j--) {
				System.out.print(splitS[i].charAt(j));
			}
			if (i < splitS.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println(spec);

		System.out.println("**************************");

		String[] names = { "my name is java oracle" };

		for (String name : names) {
			String[] nameArr = name.split(" ");
			String[] nameMathArr = { "java", "name", "oracle" };
			List<String> nameMtachList = Arrays.asList(nameMathArr);
			for (String nameA : nameArr) {
				if (nameMtachList.contains(nameA)) {
					System.out.print(new StringBuffer(nameA).reverse() + " ");
				} else {
					System.out.print(nameA + " ");
				}
			}
		}

	}

}
