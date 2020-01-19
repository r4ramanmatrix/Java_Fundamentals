package daily_practice;

public interface Anonymous_Class {

	int mNumber=965097550;

	public int m1();

}

class TestAnonymous_Class {

	public static void main(String[] args) {
		Anonymous_Class refV = new Anonymous_Class() {

			public int m1() {
				return mNumber;
			}
		};

		System.out.println("Number is: " + refV.m1());
	}
}
