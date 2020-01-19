package basics;

public class Singleton_Using_Approach1 {
	
	public static void main(String[] args) {
		Singleton_Approach1 obj1=Singleton_Approach1.getSingletonPractice();
		System.out.println(obj1);
		Singleton_Approach1 obj2=Singleton_Approach1.getSingletonPractice();
		System.out.println(obj2);
		Singleton_Approach1 obj3=Singleton_Approach1.getSingletonPractice();
		System.out.println(obj3);
	}

}
