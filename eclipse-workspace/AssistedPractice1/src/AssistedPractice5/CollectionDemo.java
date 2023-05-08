package AssistedPractice5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList; 

public class CollectionDemo {


	    public static void main(String[] args) {
	        ArrayList<String> arrayList = new ArrayList<>();
	        arrayList.add("apple");
	        arrayList.add("banana");
	        arrayList.add("cherry");
	        arrayList.add("banana");
	        System.out.println("ArrayList:");
	        System.out.println(arrayList);
	        LinkedList<String> linkedList = new LinkedList<>();
	        linkedList.add("dog");
	        linkedList.add("cat");
	        linkedList.add("hamster");
	        System.out.println("\nLinkedList:");
	        System.out.println(linkedList);
	        HashSet<String> hashSet = new HashSet<>();
	        hashSet.add("red");
	        hashSet.add("green");
	        hashSet.add("blue");
	        hashSet.add("green"); 
	        System.out.println("\nHashSet:");
	        System.out.println(hashSet);
	        HashMap<String, Integer> hashMap = new HashMap<>();
	        hashMap.put("Alice", 25);
	        hashMap.put("Bob", 30);
	        hashMap.put("Charlie", 35);
	        System.out.println("\nHashMap:");
	        System.out.println(hashMap);
	        System.out.println("\nAccessing elements in a collection:");
	        System.out.println("Element at index 2 in the ArrayList: " + arrayList.get(2));
	        System.out.println("Element at index 1 in the LinkedList: " + linkedList.get(1));
	        System.out.println("Is 'green' in the HashSet? " + hashSet.contains("green"));
	        System.out.println("Age of Bob in the HashMap: " + hashMap.get("Bob"));
	    }
	}

