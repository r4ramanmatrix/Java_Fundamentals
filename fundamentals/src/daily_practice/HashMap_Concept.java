package daily_practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_Concept {
	
	public static void main(String[] args) {
		Map<String, String> hashmap=new HashMap<String, String>();
		hashmap.put("First Name: ", "Raman");
		hashmap.put("Last Name: ", "Kumar");
		hashmap.put("City: ", "New Delhi");
		hashmap.put("Country: ", "India");
		
		System.out.println("Iterate hashmap using lambda expression and forEach loop");
		hashmap.forEach((Key, Value)->System.out.println("Key: " + Key + " Value: " + Value));
		
		
		System.out.println("********Iterate hashmap using entrySet**********");
		for (Map.Entry<String, String> entry:hashmap.entrySet()) {
			System.out.println("Key: "+entry.getKey() + " Value: " + entry.getValue());
		}
		
		System.out.println("********Iterate hashmap using Iterator and entrySet**********");
		Iterator itr=hashmap.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, String> entry=(Map.Entry<String, String>)itr.next();
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}
	}

}
