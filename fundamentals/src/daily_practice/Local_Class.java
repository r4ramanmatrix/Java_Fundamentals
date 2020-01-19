package daily_practice;

public class Local_Class {

	private void m1() {
		int length = 10;
		int breadth = 5;

		class Locally {

			int result;

			public int getResult() {
				return result = length * breadth;
			}

		}

		Locally lcy = new Locally();
		System.out.println("Area is: " + lcy.getResult());
	}

	public static void main(String[] args) {
		Local_Class lc = new Local_Class();
		lc.m1();
	}

}
