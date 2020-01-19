package daily_practice;

public abstract class Anonymous_Abstract {
	
	static int age=30;
	String name;
	abstract public String getName();

}

class Test_Anonymous{
	
	public static void main(String[] args) {
		Anonymous_Abstract refV=new Anonymous_Abstract() {
			public String getName() {
				return name="Raman";
			}
		};
		
		System.out.println("Name is: " + refV.getName() + " and Age is: " + Anonymous_Abstract.age);
	}
}
