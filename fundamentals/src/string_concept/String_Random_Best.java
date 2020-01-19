package string_concept;

public class String_Random_Best {

	static String str = "a.b.c.d."; // c,d,b,a

	public static void main(String[] args) {
		String s1 = str.replaceAll("[\\.]", ",");
		// String[] ss1=s1.split(",");
		String s2 = s1.substring(0, s1.length() / 2);
		System.out.println(s2);
		String s3 = s1.substring(s1.length() / 2, s1.length() - 1);
		System.out.println(s3);
		System.out.println(s3 + "" + new StringBuffer(s2).reverse());

	}

}
