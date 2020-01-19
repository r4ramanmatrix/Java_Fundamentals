package string_concept;

public class Sort_String {

	static String name = "firstname middlename lastname raman anurag";

	public static String sortingMethod(String str) {
		// SString[] naming=name.split(" ");
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

	public static void main(String[] args) {

		String[] naming = name.split(" ");
		for (String name : naming) {
			System.out.print(sortingMethod(name) + " ");
		}
		System.out.println("\n" + sortingMethod("manr"));
		System.out.println(sortingMethod("Raman Kumar").trim());
	}

}
