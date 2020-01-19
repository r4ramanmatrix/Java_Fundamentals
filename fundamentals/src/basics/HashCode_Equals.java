package basics;

import java.util.HashMap;
import java.util.Map;

public class HashCode_Equals {

	public static void main(String[] args) {
		Employee emp1 = new Employee(201);
		Employee emp2 = new Employee(201);

		Map<Employee, String> mapping = new HashMap<>();
		mapping.put(emp1, "Raman");
		mapping.put(emp2, "Raman");

		System.out.println("Size of Map: " + mapping.size());
		// Size 2 because equals() and HashCode() method are not present in Employee
		// class
		// But as we implement the equals() and HashCode() method in Employee class the
		// size become 1

		Integer i = new Integer(1);
		Integer i1 = new Integer(1);

		Map<Integer, String> mapp = new HashMap<>();
		mapp.put(i, "Raman");
		mapp.put(i1, "Raman");

		System.out.println("Size of Mapp: " + mapp.size());
		// Size 1 because equals() and HashCode() method are already present in Integer
		// wrapper class

	}

}

class Employee {

	int eid;

	public Employee(int eid) {
		this.eid = eid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (eid != other.eid)
			return false;
		return true;
	}

}
