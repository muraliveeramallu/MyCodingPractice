package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*given a list of strings, return all the strings with the nth longest length in that list for 
example: list – Yuri, Ron, Interview, Longest, List, Contain and nth = 1 will 
return just “Interview” whereas nth = 2 will return both “Longest” and “Contain”.*/

public class StringWithNthLongestLength {
	
	public static void main(String a[]) {
		String[] val = new String[]{"Yuri","Ron","Interview","Longest","List","Contain"};
		FindNthLongestStrings(val,2);
	}

	private static String[] FindNthLongestStrings(String[] val, int n) {
		Map<Integer, List<String>> m = new TreeMap<>((Collections.reverseOrder()));
		int reqkey = 0;
		
		for(int i = 0; i<val.length;i++) {
			if(m.containsKey(val[i].length())) {
				List<String> strArray = m.get(val[i].length());
				strArray.add(val[i]);
				m.put(val[i].length(), strArray);
			} else {
				List<String> strArray = new ArrayList<String>();
				strArray.add(val[i]);
				m.put(val[i].length(), strArray);
			}
		}
		int i = 0;
		for(Integer key:m.keySet()) {
			i++;
			if(i == n) {
				reqkey = key;
				break;
			}
		}
		//String[] answer = m.get(reqkey).toArray(new String[ m.get(reqkey).size()]);
		String[] answer = m.get(reqkey).stream().toArray(String[]::new);
		
		System.out.println(answer);
		return answer;
		
	}
	
	   private static List<String> findNthLongestElement(List<String> list, int n)
	    {
	        if(n < 1) {
	            return null; //Handle invalid case
	        }
	          
	        TreeMap<Integer, List<String>> map = new TreeMap<>();
	          
	        for(String str : list)
	        {
	            Integer length = str.length();
	            List<String> tempList = map.get(length) != null ? map.get(length) : new ArrayList<String>();
	            tempList.add(str);
	            map.put(length, tempList);
	        }
	        return map.get( map.descendingKeySet().toArray()[n-1] );
	    }

}
