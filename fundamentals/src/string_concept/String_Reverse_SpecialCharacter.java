package string_concept;

public class String_Reverse_SpecialCharacter {

	public static void main(String[] args) {
		String str = "abcdef,gh,hallo,java$?";
		String stringOnly = str.replaceAll("[^a-zA-Z,]", "");
		String specialOnly = str.replaceAll("[~\\w,]", "");

		String[] stringSplit = stringOnly.split(",");
		for (int i = 0; i < stringSplit.length; i++) {
			for (int j = stringSplit[i].length() - 1; j >= 0; j--) {
				System.out.print(stringSplit[i].charAt(j));
			}
			if (i < stringSplit.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println(specialOnly);

	}

}
