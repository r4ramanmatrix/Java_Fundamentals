package basics;

public class Implementing_Intera implements Intera {
	
	public void m() {
		System.out.println("Interface implemented method");
	}
	
	public static void main(String[] args) {
		Implementing_Intera obj2=new Implementing_Intera();
		Intera obj=new Intera() {
			public void m() {
				System.out.println("ANother method of interface!!");
			};
		};
		
		obj.m();
		obj2.m();
	}

}
