package basics;

public class Singleton_Approach1 {
	
	private static Singleton_Approach1 SP=new Singleton_Approach1();
	private Singleton_Approach1() {
		
	}

	public static Singleton_Approach1 getSingletonPractice() {
		return SP;
	} 
}
