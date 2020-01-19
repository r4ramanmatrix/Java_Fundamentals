package practice;

public class SortingName {
	
	public static void main(String[] args) {
		String s="firstname lastname";
		String[] sSplit=s.split(" ");
		
		//System.out.println(sSplit[0]);
		
		char[] ch=sSplit[0].toCharArray();
		char temp=0;
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch.length-1;j++) {
				if(ch[j]>ch[j+1]) {
					temp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
			}
		}		
		char[] ch1=sSplit[1].toCharArray();
		for(int i=0;i<ch1.length;i++) {
			for(int j=0;j<ch1.length-1;j++) {
				if(ch1[j]>ch1[j+1]) {
					temp=ch1[j];
					ch1[j]=ch1[j+1];
					ch1[j+1]=temp;
				}
			}
		}
		String name1=new String(ch);
		String name2=new String(ch1);
		System.out.println(name1 + " " + name2);
		
	}

}
