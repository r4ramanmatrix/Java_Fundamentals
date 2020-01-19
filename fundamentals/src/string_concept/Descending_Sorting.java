package string_concept;

public class Descending_Sorting implements Comparable<Descending_Sorting>{

	private int age;
	private String name;
	
	public Descending_Sorting(int age, String name) {
		this.name=name;
		this.age=age;
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
		this.name = name;
	}
	
	public String toString() {
		return age +" "+ name;
	}
	public int compareTo(Descending_Sorting obj) {
		if(this.age>obj.age) {
			return -1;
		}else if(this.age<obj.age)
			return 1;
		return 0;
	}

	
}
