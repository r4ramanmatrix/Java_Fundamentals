package daily_practice;

public class Static_Outer_Inner {
	
	static String name;
	
	static class Inner{
		static String ename;
		
		public static String getEname() {
			return ename="Java";
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Name is: " + (Static_Outer_Inner.name=Inner.getEname()));
	}

}
