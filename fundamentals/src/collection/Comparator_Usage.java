package collection;

public class Comparator_Usage {
	
	private int age;
	private String name;
	
	public Comparator_Usage(int age, String name) {
		this.age=age;
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String toString() {
		return age + " " + name;
	}

}
