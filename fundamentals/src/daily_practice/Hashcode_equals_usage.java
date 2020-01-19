package daily_practice;

public class Hashcode_equals_usage {

	public static void main(String[] args) {
		Hashcode_equals obj1 = new Hashcode_equals("Raman", 8068731);
		Hashcode_equals obj2 = new Hashcode_equals("Raman", 8068731);
		Hashcode_equals obj3 = new Hashcode_equals("Raman", 806873);
		Hashcode_equals obj4 = new Hashcode_equals("Random", 8068731);
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj4));
		System.out.println("Hashcode: ");
		System.out.println("Hashcode1: " + obj1.hashCode());
		System.out.println("Hashcode2: " + obj2.hashCode());
		System.out.println("Hashcode3: " + obj3.hashCode());
		System.out.println("Hashcode4: " + obj4.hashCode());
		
		System.out.println(obj1.getEid()==obj2.getEid());
		System.out.println(obj1.hashCode()==obj2.hashCode());
	}

}
