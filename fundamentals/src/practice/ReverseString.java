package practice;

public class ReverseString {
	
	public static void main(String[] args) {
		String str="Abcd,ef$?";  //fe,dcbA$?
		String specialStr=str.replaceAll("[^a-zA-Z,]", "");
		System.out.println(specialStr);
		
		String strReverse="";
		for(int i=specialStr.length()-1;i>=0;i--) {
			strReverse=strReverse+specialStr.charAt(i);
		}
		System.out.println(strReverse);
		
	}

}
