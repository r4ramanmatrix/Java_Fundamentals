package practice;

public class Practice_06 {

	public static void permutation(String prefix, String str) {
		if (str.length() == 0) {
			System.out.println(prefix + " ");
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, str.length()));
		}
	}

	public void printPermutation(String str) {
		permutation(" ", str);
	}
	
	public void m1(int[] num, int lengths) {
		
	}
	
	public static void main(String[] args) {
		Practice_06 obj=new Practice_06();
	}

}
