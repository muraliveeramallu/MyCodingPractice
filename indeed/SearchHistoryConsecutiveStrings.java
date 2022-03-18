package indeed;

import java.util.*;
//https://gist.github.com/h2rashee/419aabf2b655520078c8690e093a916d

/*
We have some click stream data that we gathered on our client's website. Using cookies, we collected snippets of users' anonymized URL histories while they browsed the site. The histories are in chronological order and no URL was visited more than once per person.

Write a function that takes two users' browsing histories as input and returns the longest contiguous sequence of URLs that appears in both.

Sample input:

user0 = ["/start.html", "/pink.php", "/register.asp", "/orange.html", "/red.html"]
user1 = ["/start.html", "/green.html", "/blue.html", "/pink.php", "/register.asp", "/orange.html"]
user2 = ["/red.html", "/green.html", "/blue.html", "/pink.php", "/register.asp"]
user3 = ["/blue.html", "/logout.php"]

Sample output:

findContiguousHistory(user0, user1)
   /pink.php
   /register.asp
   /orange.html

findContiguousHistory(user1, user2)
   /green.html
   /blue.html
   /pink.php
   /register.asp

findContiguousHistory(user0, user3)
   (empty)

findContiguousHistory(user2, user3)
   /blue.html

findContiguousHistory(user3, user3)
   /blue.html
   /logout.php

 */

public class SearchHistoryConsecutiveStrings {

	public static void main(String[] args) {
		String[] user0 = new String[] {"/start.html", "/pink.php", "/register.asp", "/orange.html", "/red.html"};
		String[] user1 = new String[] {"/start.html", "/green.html", "/blue.html", "/pink.php", "/register.asp", "/orange.html"};
		String[] user2= new String[] {"/red.html", "/green.html", "/blue.html", "/pink.php", "/register.asp"};
		String[] user3 = new String[] {"/blue.html", "/logout.php"};
		getConsequitiveSearchHistory(user0,user1);
      
	}

	private static void getConsequitiveSearchHistory(String[] user1, String[] user2) {
		int[] user2num = new int[user2.length];
		int startInd = 0;
		int endIndex = 0;
        List<Integer> output = new LinkedList<Integer>();
        List<Integer> temp = new LinkedList<Integer>();
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		Map<Integer, String> m1 = new LinkedHashMap<Integer, String>();
		int counter = 0;
		for(int i = 0; i<user1.length;i++) {
			if(!m.containsKey(user1[i])) {
				counter = counter+1;
				m.put(user1[i], counter);
				m1.put(counter,user1[i]);
			}
		}
		
		for(int i = 0; i<user2.length;i++) {
			if(m.containsKey(user2[i])) {
				user2num[i] = m.get(user2[i]);
			} else {
				user2num[i] = counter++;
			}
		}
		if(m.containsValue(user2num[0]))
		temp.add(user2num[0]);
		for(int i = 1; i<user2num.length;i++) {
			if(m.containsValue(user2num[i]) && m.containsValue(user2num[i-1]) && user2num[i] == user2num[i-1]+1) {
				temp.add(user2num[i]);
			} else {
				if(temp.size()>output.size()) {
					output = new ArrayList<Integer>(temp);
				}
				temp.clear();
			}
		}
		if(temp.size()>output.size()) {
			output = new ArrayList<Integer>(temp);
		}
		for(int i = 1; i<output.size();i++) {
			System.out.println(m1.get(i));
		}
	
		
	}
	
	//Not working need to do few changes
	private static void getConsequitiveSearchHistoryBetter(String[] user1, String[] user2) {
	        List<String> output = new LinkedList<String>();
	        List<String> temp = new LinkedList<String>();
		for(int i = 0, j = 0; i<user1.length && j<user2.length;) {
			if(user1[i].equals(user2[j])) {
				temp.add(user1[i]);
               i++;
               j++;
			} else {
				if(temp.size() > output.size())
					output = new LinkedList<String>(temp);
				temp.clear();
				j++;
			}
		}
		
		if(temp.size() > output.size())
			output = new LinkedList<String>(temp);
		temp.clear();
		
		for(int i = 0; i<output.size();i++) {
			System.out.println(output.get(i));
		}
	}

}
