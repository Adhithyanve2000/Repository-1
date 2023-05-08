package AssistedPractice6;

import java.util.HashMap;
import java.util.Map;

public class Hashmapsverification {


	    public static void main(String[] args) {

	        Map<String, Integer> map = new HashMap<>();

	        map.put("Alice", 25);
	        map.put("Bob", 30);
	        map.put("Charlie", 35);

	        System.out.println("Map: " + map);

	        int aliceAge = map.get("Alice");
	        System.out.println("Alice's age: " + aliceAge);

	        boolean bobExists = map.containsKey("Bob");
	        System.out.println("Bob exists in the map: " + bobExists);
	        map.remove("Charlie");
	        System.out.println("Map after removing Charlie: " + map);
	        System.out.println("Keys in the map:");
	        for (String key : map.keySet()) {
	            System.out.println(key);
	        }
	        System.out.println("Values in the map:");
	        for (int value : map.values()) {
	            System.out.println(value);
	        }
	    }
	}

