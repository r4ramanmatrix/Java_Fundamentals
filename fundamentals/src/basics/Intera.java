package basics;

public interface Intera {

	void m();

}

class InteraAnonymous {

	public static void main(String[] args) {
		Intera obj = new Intera() {
			public void m() {
				System.out.println("this is interface implemented methd!!");
			}
		};
		obj.m();
	}
}
