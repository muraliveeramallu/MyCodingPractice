package array;

import java.util.Stack;

public class ReverseLinkedList {
	
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(5);
		ListNode n4 = new ListNode(10);
		ListNode n5 = new ListNode(12);
		ListNode n6 = new ListNode(18);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		reverse(n1);

	}

	static ListNode reverse(ListNode node) { 
		ListNode prev = null; 
		ListNode current = node; 
		ListNode next = null; 
	        while (current != null) { 
	            next = current.next; 
	            current.next = prev; 
	            prev = current; 
	            current = next; 
	        } 
	        node = prev; 
	        return node; 
	    } 

}


