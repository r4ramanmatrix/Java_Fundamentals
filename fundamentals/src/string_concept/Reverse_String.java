package string_concept;

public class Reverse_String {
	
	public static void main(String[] args) {
		String str="this is the string";
		String[] strSplit=str.split(" ");
		
		for(int i=0;i<strSplit.length;i++) {
			for(int j=strSplit[i].length()-1;j>=0;j--) {
				System.out.print(strSplit[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

}
