package basics;

import java.io.Serializable;

public class CreateObj_Deserial1 implements Serializable {

	String name;

	public CreateObj_Deserial1(String name) {
		this.name = name;
	}

	public void m1() {
		System.out.println("Name is: " + name);
	}

}
