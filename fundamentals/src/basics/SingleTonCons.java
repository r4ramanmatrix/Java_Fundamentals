package basics;

public class SingleTonCons {

	private static SingleTonCons singleObj = null;

	private SingleTonCons() {
		// TODO Auto-generated constructor stub
	}

	public void m1() {
		System.out.println("Singleton class method!!");
	}

	public static SingleTonCons getSingleObj() {
		if (singleObj == null) {
			singleObj = new SingleTonCons();
		}
		return singleObj;
	}

	public static void main(String[] args) {

	}

}
