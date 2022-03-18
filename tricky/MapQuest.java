package tricky;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapQuest {
	
	public static void main(String a[]) {
		initMap();
	}
	
	public static void initMap(){
		int i;
		int j;
		i = Integer.parseInt("1");
		Integer i1 = i;//Integer.parseInt();
		j = i1;
		System.out.println(i);
		System.out.println(j);
		System.out.println(i1);
		Map<String, Integer> m = new ConcurrentHashMap<String, Integer>();
		m.put(null, i);
		m.put(" ", null);
		//System.out.println(m.get(" "));
		
	}

}
