package polymorphism;

public class Static_Overloading {
	
	int age;
	/*
	 * public Static_Overloading(int age) { this.age=age; }
	 */
	
	public void m2() {
		System.out.println("Non-static method");
	}
	
	//Cannot make a static reference to the non-static method 
	/*
	 * public void m1() { System.out.println("Non-static method"); }
	 */
	
	public static void m1() {
		System.out.println("Static method");
	}
	
	public static void m1(String name) {
		System.out.println("Static method: " + name );
	}
	
	public static void main(String[] args) {
		Static_Overloading obj=new Static_Overloading();
		//Static_Overloading obj2=new Static_Overloading(30);
		Static_Overloading.m1("Java");
	}

}

