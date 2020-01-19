package basics;

public class EmployeeDataUsage {
	
	public static void main(String[] args) {
		
		EmployeeData obj1=new EmployeeData("ABC", 30);
		EmployeeData obj2=new EmployeeData("ABC", 31);
		System.out.println(obj1.hashCode() + " " + obj2.hashCode());
		System.out.println(obj1.equals(obj2));
	}

}
