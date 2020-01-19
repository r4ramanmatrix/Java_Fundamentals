package basics;

public class EmployeeData {

	String name;
	int age;

	public EmployeeData(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return name + " " + age;
	}
	
	public int hashCode() {
		return age;
	}
	
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}if(this==obj) {
			return true;
		}if(this.getClass()!=obj.getClass()) {
			return false;
		}
		EmployeeData ED=(EmployeeData)obj;
		if(ED.age!=this.age) {
			return false;
		}
		return true;
	}

}
