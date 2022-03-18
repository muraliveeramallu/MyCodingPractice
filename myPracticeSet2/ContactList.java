package myPracticeSet2;

import java.util.HashSet;

public class ContactList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContactList c = new ContactList();
		HashSet<String> contactList = new HashSet<String>();
		contactList.add("murali");
		contactList.add("murphy");
		contactList.add("murphy");
		contactList.add("mur");
		System.out.println("No of Contacts -> "+c.searchContactList(contactList, "mur"));
		System.out.println("No of Contacts -> "+c.searchContactList(contactList, "mx"));
		System.out.println("No of Contacts -> "+c.searchContactList(contactList, "m"));

	}
	
	public int searchContactList(HashSet<String> contactList, String search) {
		
		int counter = 0;
		
		if(search==null)
			return counter;
		
		for(String s:contactList) {
			if(s!=null && s.substring(0, search.length()).equals(search))
				counter++;
		}
		
		return counter;
	}

}
