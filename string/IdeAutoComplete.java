package string;

import java.util.*;

public class IdeAutoComplete {
	
	public static void main(String a[]) {
		search(new String[] {"MouseClick","MouseClickHandler","CatalogSearchController","SampleOutput"},"Mouse");
	}

	private static void search(String[] files, String search) {

		String[] searchSplit = search.split("(?=(\\p{Upper}))");
		List<String> output = new ArrayList<String>();
		for(int i = 0; i<files.length;i++) {
			String[] fileSplit = files[i].split("(?=(\\p{Upper}))");
			if(fileSplit.length < searchSplit.length) {
				continue;
			}
			for(int j = 0; j<searchSplit.length;j++) {
				if(files[i].indexOf(searchSplit[j]) >= 0) {
					if(j==searchSplit.length-1)
						output.add(files[i]);
				} else {
					break;
				}
			}
			
		}
		
		for(String s:output ) {
			System.out.println(s);
		}
		
	}

}
