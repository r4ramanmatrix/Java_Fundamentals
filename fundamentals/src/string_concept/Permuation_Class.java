package string_concept;

public class Permuation_Class {
	
	public static void permutation(String prefix, String str) {
		if(str.length()==0) {
			System.out.println(prefix + " ");
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			permutation(prefix+str.charAt(i), str.substring(0,i)+str.substring(i+1, str.length()));
		}
	}
	
	public void printPermutation(String str) {
		permutation("", str);
	}

	public static void main(String[] args) {
		Permuation_Class obj=new Permuation_Class();
		obj.printPermutation("ABC");
	}
}
