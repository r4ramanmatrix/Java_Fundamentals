package basics;

public class ObjectCreation {
	
	public void m1() {
		System.out.println("calling m1");
	}
	
	public static void main(String[] args) {
		ObjectCreation obj1=new ObjectCreation();
		try {
		ObjectCreation obj2=(ObjectCreation)Class.forName(args[0]).newInstance();
		obj2.m1();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		obj1.m1();
		
	}

}
