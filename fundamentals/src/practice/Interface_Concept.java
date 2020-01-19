package practice;

public interface Interface_Concept {
	
	
	public static void m1() {
		System.out.println("This is static method!!");
	}
	
	default void m1(int age) {
		System.out.println(age);
	}
	
	public String m1(String name);
	class TestAnonymous{
		public static void main(String[] args) {
			Interface_Concept ic=new Interface_Concept() {
				public String m1(String ename) {
					System.out.println("My name is: " + ename);
					return "Java";
				}
			};
			ic.m1(50);
			ic.m1("Java");
		}
	}

}
