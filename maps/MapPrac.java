package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();	
		SortedMap<Integer, String> sortedMap = new TreeMap<Integer, String>();
		
		treeMap.put(1, null);
		//treeMap.put(null, null);
		//treeMap.put(null, "a");
		treeMap.put(3, "b");
		treeMap.put(2, "c");
		treeMap.put(2, "c");
		
		hashMap.put(1, null);
		hashMap.put(null, null);
		hashMap.put(null, "a");
		hashMap.put(3, "b");
		hashMap.put(2, "c");
		hashMap.put(2, "c");
		
		linkedHashMap.put(1, null);
		linkedHashMap.put(null, null);
		linkedHashMap.put(null, "a");
		linkedHashMap.put(3, "b");
		linkedHashMap.put(2, "c");
		linkedHashMap.put(2, "c");
		
		sortedMap.put(1, null);
		//sortedMap.put(null, null);
		//sortedMap.put(null, "a");
		sortedMap.put(3, "b");
		sortedMap.put(2, "c");
		sortedMap.put(2, "c");
		
		System.out.println("Tree MAP:");
		for(Entry<Integer, String> e: treeMap.entrySet() ) {
			System.out.println(e.getKey()+" => "+e.getValue());
		}
		
		System.out.println("\nHash MAP:");
		for(Entry<Integer, String> e: hashMap.entrySet() ) {
			System.out.println(e.getKey()+"=>"+e.getValue());
		}
		
		System.out.println("\nLinked Hash MAP:");
		for(Entry<Integer, String> e: linkedHashMap.entrySet() ) {
			System.out.println(e.getKey()+"=>"+e.getValue());
		}
		
		System.out.println("\nSorted MAP:");
		for(Entry<Integer, String> e: sortedMap.entrySet() ) {
			System.out.println(e.getKey()+"=>"+e.getValue());
		}
		

	}

}
