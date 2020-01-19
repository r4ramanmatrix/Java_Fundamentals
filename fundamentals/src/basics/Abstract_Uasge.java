package basics;

public class Abstract_Uasge extends Abstract_Class {

	public static void main(String[] args) {
		Abstract_Uasge au = new Abstract_Uasge();
		au.setAge(30);
		au.setName("Java");
		System.out.println(au.DisplayName());
		System.out.println(au.DisplayAge());
	}

	@Override
	public String DisplayName() {
		return getName();

	}
	
	@Override
	public int DisplayAge() {
		return getAge();
	}

}
