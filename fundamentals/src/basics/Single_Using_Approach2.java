package basics;

public class Single_Using_Approach2 {

	public static void main(String[] args) {
		Singleton_Approach2 obj1=Singleton_Approach2.getSingleton();
		System.out.println(obj1.hashCode());
		
		Singleton_Approach2 obj2=Singleton_Approach2.getSingleton();
		System.out.println(obj2.hashCode());
	}
}
