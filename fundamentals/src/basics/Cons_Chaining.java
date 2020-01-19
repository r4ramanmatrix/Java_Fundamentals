package basics;

public class Cons_Chaining {
	
	public Cons_Chaining() {
		System.out.println("Non Parameterized constructor");
	}
	
	public Cons_Chaining(String name) {
		this();
		System.out.println("Parameterized constructor with String value: " + name);
	}
	
	public Cons_Chaining(int age) {
		this("Raman");
		System.out.println("Parameterized constructor with int value: " + age);
	}
	
	public static void main(String[] args) {
		
		Cons_Chaining o2=new Cons_Chaining(8068731);
		
		
	}

}
