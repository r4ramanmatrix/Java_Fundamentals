package daily_practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Read_HashMap {
	
	public static void main(String[] args) {
		Map<Character, Integer> charMap=new HashMap<>();
		charMap.put('A', 1007);
		charMap.put('B', 1075);
		charMap.put('E', 1207);
		charMap.put('D', 1999);
		
		System.out.println("*****Traverse map using lambda expressions********");
		charMap.forEach((key,value)->System.out.println("Key: " + key + " Value: " + value));
		
		System.out.println("*****Traverse map using iterator********");
		Iterator itr=charMap.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Character, Integer> entry=(Map.Entry<Character, Integer>)itr.next();
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue() );
		}
		System.out.println("*****Traverse map using entrySet********");
		for(Map.Entry<Character, Integer> entry:charMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}
	}

}
