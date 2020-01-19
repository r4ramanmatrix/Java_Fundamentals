package basics;

public class First {

	private static int a;

	private static int m1(int a) {

		return a;
	}

	public static void main(String[] args) {
		// Command_Line_Arguments obj=new Command_Line_Arguments();
		System.out.println(First.m1(22));
	}

	static class exc {
		public static void main(String[] args) {

			System.out.println(m1(100));
		}
	}

	public class Childing {
	}

	private void m1() {
		Childing childObj = new Childing();
	}
}
