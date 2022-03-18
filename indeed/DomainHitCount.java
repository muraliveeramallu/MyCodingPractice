package indeed;

import java.util.*;

/*
 Need to find the hit count per domain. Following is the input need to find the count per domain.
 example google.com -3000, email.google.com -500, wiki.com - 80
 now output would be email.google.com = 500, google.com = 35000, wiki.com = 80, com - 3580
 amd email, google, wiki alone wont consider as sub domains
 
 [
  "3000,google.com",
  "500,mail.google.com",
  "50,yahoo.com",
  "10,sports.yahoo.com",
  "300,email.yahoo.com",
  "150,wiki.com",
  "80,us.wiki.com",
  "5,photos.com",
  "200,drive.google.com",
  "120,indeed.com",
  "60,linkedin.com",   
 ]
 * */

public class DomainHitCount {
	public static void main(String a[]) {
		String[] domains = new String[] { 
		                             "3000,google.com",
		                             "500,mail.google.com",
		                             "50,yahoo.com",
		                             "10,sports.yahoo.com",
		                             "300,email.yahoo.com",
		                             "150,wiki.com",
		                             "80,us.wiki.com",
		                             "5,photos.com",
		                             "200,drive.google.com",
		                             "120,indeed.com",
		                             "60,linkedin.com",   
		                            };
		Map<String, Integer> output = getSubDomainList(domains);
		for(Map.Entry map:output.entrySet()) {
			System.out.println(map.getValue()+":"+map.getKey());
		}
	}

	private static Map<String, Integer> getSubDomainList(String[] domains) {
		Map<String, Integer> domainToCount = new HashMap<String, Integer>();
		Map<String, Integer> output = new HashMap<String, Integer>();
		
		for(int i = 0; i<domains.length;i++) {
			String[] domainCountSplitter = domains[i].split("");
			if(!domainToCount.containsKey(domainCountSplitter[1])) {
				domainToCount.put(domainCountSplitter[1],Integer.parseInt(domainCountSplitter[0]));
			} else {
				domainToCount.put(domainCountSplitter[1], domainToCount.get(domainCountSplitter[1])+Integer.parseInt(domainCountSplitter[0]));
			}
		}
		
		for(Map.Entry<String,Integer> map:domainToCount.entrySet()) {
			String[] splitter = map.getKey().split("\\.");
			String temp = "";
			for(int i = splitter.length-1; i>=0;i--) {
				if(i == splitter.length-1)
					temp = splitter[i];
				else
				    temp = splitter[i] +"."+ temp;
				
				if(!output.containsKey(temp)) {
					output.put(temp,map.getValue());
				} else {
					output.put(temp, output.get(temp) + map.getValue());
				}
			}
			
		}
		
		return output;
	}
	
	private static Map<String, Integer> getSubDomainListOptimal(String[] domains) {
		
		Map<String,Integer> m = new HashMap<String, Integer>();
		
		
		return null;
	
	}


}
