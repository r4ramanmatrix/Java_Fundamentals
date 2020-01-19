package string_concept;

import java.util.Arrays;
import java.util.List;

public class Reverse_Selected_String {

	public static void main(String[] args) {
		String str = "this is the string statement in the java";
		String[] strSplit = str.split(" ");
		String[] stringToReverse = { "the", "statement" };
		List<String> li = Arrays.asList(stringToReverse);
		for (String strs : strSplit) {
			if (li.contains(strs)) {
				System.out.print(new StringBuffer(strs).reverse() + " ");
			} else {
				System.out.print(strs + " ");
			}
		}

		System.out.println("\n*********************");
		
		

	}
}
