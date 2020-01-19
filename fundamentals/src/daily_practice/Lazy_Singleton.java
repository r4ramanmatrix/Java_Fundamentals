package daily_practice;

public class Lazy_Singleton {
	
	public static void main(String[] args) {
		Lazy_Practice obj1=Lazy_Practice.getInstance();
		Lazy_Practice obj2=Lazy_Practice.getInstance();
		Lazy_Practice obj3=Lazy_Practice.getInstance();
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1==obj2);
		obj1.str=(obj1.str).toUpperCase();
		
		System.out.println(obj1.str);
		System.out.println(obj2.str);
		System.out.println(obj3.str);
		
	}

}
