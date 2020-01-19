package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_Concept {

	public static void main(String[] args) {
		Map<String, String> mapping = new HashMap<>();
		mapping.put("First Name", "Java");
		mapping.put("Last Name", "Selenium");
		mapping.put("City", "California");
		mapping.put("Country", "USA");

		System.out.println("******Iterate HashMap using Lambda expression*******");

		mapping.forEach((key, value) -> System.out.println("[Key]: " + key + ": [Values]: " + value));

		System.out.println("******Iterate HashMap using entrySet*******");
		for (Map.Entry<String, String> entry : mapping.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}

		System.out.println("******Iterate HashMap using Iterator*******");
		Iterator itr = mapping.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) itr.next();
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}
	}

}
