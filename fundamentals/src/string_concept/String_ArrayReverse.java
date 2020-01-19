package string_concept;

import java.util.Arrays;
import java.util.List;

public class String_ArrayReverse {
	
	public static void main(String[] args) {
		String[] names= {"this is java and the selenium"};
		for(String name:names) {
			String[] nameSplit=name.split(" ");
			String[] strReverse= {"java", "the"};
			List li=Arrays.asList(strReverse);
				for(String s:nameSplit) {
					if(li.contains(s)) {
						System.out.print(new StringBuffer(s).reverse() + " ");
					}else {
						System.out.print(s + " ");
					}
				}
			}
		}
	}


