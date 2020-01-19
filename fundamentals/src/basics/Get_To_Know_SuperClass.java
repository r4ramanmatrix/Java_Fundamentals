package basics;

public class Get_To_Know_SuperClass {
	
	public static void main(String[] args) {
		
		CreateObj_Clone obj2=new CreateObj_Clone();
		Selection_Sort obj3=new Selection_Sort();
		String str=new String("Raman");
		Object obj4=new Object();
		
		
		System.out.println("Super Class of CreateObj_Clone: " + obj2.getClass().getSuperclass());
		System.out.println("Super Class of Selection_Sort: " + obj3.getClass().getSuperclass());
		System.out.println("Super Class of String: " + str.getClass().getSuperclass());
		System.out.println("Super Class of Object: " + obj4.getClass().getSuperclass());
	}

}
