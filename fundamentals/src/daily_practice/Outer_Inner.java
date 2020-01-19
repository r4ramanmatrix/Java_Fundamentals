package daily_practice;

public class Outer_Inner {

	int i;

	class Inner {
		int age;

		public int getAge() {
			return age = 30;
		}
	}

	public static void main(String[] args) {
		Outer_Inner oi = new Outer_Inner();
		Outer_Inner.Inner obj = oi.new Inner();
		System.out.println("i value is: " + (oi.i = obj.getAge()));
		Z z=new Z();
		z.getMessage();
		
	}

}

class Z{
	public void getMessage() {
		System.out.println("This is the class x!!");
	}
}
