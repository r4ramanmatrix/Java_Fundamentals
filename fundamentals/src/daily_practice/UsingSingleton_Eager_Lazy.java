package daily_practice;

public class UsingSingleton_Eager_Lazy {

	public static void main(String[] args) {
		Eager_Approach obj1 = Eager_Approach.getInstance();
		Eager_Approach obj2 = Eager_Approach.getInstance();
		Eager_Approach obj3 = Eager_Approach.getInstance();

		System.out.println(obj1.str);

		System.out.println(obj1.hashCode() == obj2.hashCode());
		System.out.println(obj1.hashCode() == obj3.hashCode());
		System.out.println(obj2.hashCode() == obj3.hashCode());

		obj1.str = (obj1.str).toUpperCase();
		System.out.println(obj1.str);
		System.out.println(obj2.str);
		System.out.println(obj3.str);
		
		System.out.println("**************************************");
		
		Lazy_Approach lobj1 = Lazy_Approach.getInstance();
		Lazy_Approach lobj2 = Lazy_Approach.getInstance();
		Lazy_Approach lobj3 = Lazy_Approach.getInstance();

		System.out.println(obj1.str);

		System.out.println(lobj1.hashCode() == lobj2.hashCode());
		System.out.println(lobj1.hashCode() == lobj3.hashCode());
		System.out.println(lobj2.hashCode() == lobj3.hashCode());

		lobj1.str = (lobj1.str).toLowerCase();
		System.out.println(lobj1.str);
		System.out.println(lobj2.str);
		System.out.println(lobj3.str);

	}

}
