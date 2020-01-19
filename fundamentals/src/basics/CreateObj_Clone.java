package basics;

public class CreateObj_Clone implements Cloneable{
	
		
	public String m1(String name) {
		return name; 
	}
	
	public int m1(int age) {
		return age;
	}
	
	public static void main(String[] args) throws Exception {
		CreateObj_Clone obj1=new CreateObj_Clone();
		CreateObj_Clone obj2=(CreateObj_Clone)obj1.clone();
		
		System.out.println(obj2.m1(30));
		System.out.println(obj2.m1("Raman"));
	}

}
