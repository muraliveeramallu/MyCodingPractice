package array;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class RemoveNthNodeFromEndOfList {
	
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	static ListNode removeNthFromEnd(ListNode head, int n) {

	    if(head == null)
	        return null;
	 
	    //get length of list
	    ListNode p = head;
	    int len = 0;
	    while(p != null){
	        len++;
	        p = p.next;
	    }
	 
	    //if remove first node
	    int fromStart = len-n+1;
	    if(fromStart==1)
	        return head.next;
	 
	    //remove non-first node    
	    p = head;
	    int i=0;
	    while(p!=null){
	        i++;
	        if(i==fromStart-1){
	            p.next = p.next.next;
	        }
	        p=p.next;
	    }
	 
	    return head;
	}
	
	 static ListNode removeNthFromEnd2(ListNode head, int n) {
	        ListNode dummy = new ListNode(0);
	        dummy.next = head;
	        ListNode fast = dummy, slow = dummy;
	        while (n-- > 0) {
	        	fast = fast.next;
	        }
	        while (fast.next != null) {
	            fast = fast.next;
	            slow = slow.next;
	        }
	        slow.next = slow.next.next;
	        return dummy.next;
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
		removeNthFromEnd(n1, 2);

	}

}

