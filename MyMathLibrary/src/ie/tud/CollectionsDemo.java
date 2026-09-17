package ie.tud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CollectionsDemo {
	public static void main(String[] args) {
	
		String s1 = "Apple";
		String s2 = "Banana";
		String s3 = "Cherry";
		String s4 = "Apple";
		
		//ArrayList
		ArrayList<String> list = new ArrayList<>();
		//add
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
	
		System.out.println("ArrayList: " + list);
		
		// one other method
		System.out.println("List contains Banana: " + list.contains("Banana"));
		
		
		//Queue
		Queue<String> queue = new LinkedList<>();
		//add
		queue.offer(s1);
		queue.offer(s2);
		queue.offer(s3);
		queue.offer(s4);

		System.out.println("\nQueue: " + queue);
		
		//one other method
		System.out.println("Poll: " + queue.poll());
	
		
		//Map
		Map<Integer, String> map = new HashMap<>();
		
		//add
		map.put(1,s1);
		map.put(2,s2);
		map.put(3,s3);
		map.put(4,s4);
		
		
		System.out.println("\nMap (key → value):");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
		System.out.println("Key " + entry.getKey() + ": " +
		entry.getValue());
		}
		
		//one other method
		System.out.println("Map contains Key 1: " + map.containsKey(1));
		
		//Set
		Set<String> set = new HashSet<>();
		
		//add
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4); // duplicate ignored

		System.out.println("\nSet (no duplicates):");
		for (String item : set) {
		System.out.println(item);
		}
		
		//one other method
		System.out.println("Size of set: " + set.size());

	}
	
}
