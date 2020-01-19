package basics;

public abstract class AnonymousClass {

	abstract void eat();

}

class TestingAnonymous {
	public static void main(String[] args) {
		AnonymousClass obj = new AnonymousClass() {
			void eat() {
				System.out.println("PLease have some food!!");
			}
		};
		obj.eat();

	}

}