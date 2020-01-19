package practice;

public class Singleton_Usage {
	
	public static void main(String[] args) {
		Constrc obj1=Constrc.getInstance();
		System.out.println(obj1.id+19);
		Constrc obj2=Constrc.getInstance();
		System.out.println(obj2.id);
		Constrc obj3=Constrc.getInstance();
		
		obj1.id=(obj1.id)+19;
		System.out.println(obj2.id);
		System.out.println(obj3.id);
	}

}
