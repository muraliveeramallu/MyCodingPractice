package myPractice;

public class LinkedList {

	Node head;
	int count;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

		public int getData() {
			return data;
		}

		public Node getNext() {
			return next;
		}

		public void setData(int data) {
			this.data = data;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}

	LinkedList() {
		this.head = null;
		this.count = 0;
	}

	LinkedList(Node head) {
		this.head = head;
		this.count = 1;
	}

	public static void main(String[] args) {
		// Adding Nodes to LinkedList
		LinkedList llist = new LinkedList();
		llist.addNode(11);
		llist.addNode(23);
		llist.addNode(31);
		llist.addNode(5);
		llist.addNode(6);
		llist.addNode(90);
		llist.removeNode(90);
		llist.addNodeAt(40, 2);
		llist.removeNodeAt(3);
		System.out.println("List Count:" + llist.getCount());
		llist.get(1);
		
		for(int i=1; i<=llist.getCount();i++) {
			System.out.println("->"+llist.get(i));
		}
	}

	public void addNode(int data) {

		Node current = head;
		Node temp = new Node(data);
		if (current == null) {
			head = temp;
			count++;
			return;
		}

		while (current.getNext() != null) {
			current = current.getNext();
		}

		current.setNext(temp);
		count++;
	}
	
	public void addNodeAt(int data, int index) {
	   Node current = head;
	   Node pre = null;
	   Node next = null;
	   Node newNode = new Node(data);
	   
	   if(index>count) {
		   return;
	   }
	   
	   for(int i=1;i<=count;i++) {
		   pre = current;
	       current = current.getNext();
	       next = current;
		   if(index == i+1) {
			  current = pre;
			  newNode.setNext(next);
			  current.setNext(newNode);
			  count++;
			  return;
		   }
	   }
	
	}

	public void removeNode() {
		Node current = head;
		if(getCount() == 0) {
			System.out.println("Linked List is Empty");
			return;
		}
		
		if(getCount()==1) {
			System.out.println("Linked List Have only One element Deleting the same");
			head = null;
			count--;
			return;
		}
		
		while(current.getNext().getNext() != null) {
	        current = current.getNext();
	    }
	    current.setNext(null);
	    count--;
			
	}
	
	public void removeNode(int nodeNum) {
		Node current = head;
		Node pre = null;
		if(getCount() == 0) {
			System.out.println("Linked List is Empty");
			return;
		}
		
		if(head!=null && head.getData() == nodeNum) {
			head = head.getNext();
			count--;
			return;
		}
		
		while(current.getNext()!=null && current.getData() != nodeNum )
		{
			pre = current;
			current = current.getNext();
			
		}
		
		if(pre==null)
			return;
		
		pre.setNext(current.getNext());
		 count--;	
	}
	
	public void removeNodeAt(int nodeNum) {
		Node current = head;
		Node pre = null;
		if(nodeNum>count)
			return;
		if(head.getNext()==null) {
			head = head.getNext();
			count--;
		}
		
		for(int i=1;i<=count;i++) {
			pre = current;
			current = current.getNext();
			if(nodeNum == (i+1)) {
				pre.setNext(current.getNext());
				count--;
				return;
			}
		}
	}

	public int getCount() {
		return count;
	}

	 public Boolean isEmpty() {
		 return getCount() == 0;
	 }

	 public int get(int nodeNum) {
		 if(nodeNum<=0)
			 return -1;
		 Node current = head;
		 for(int i=1; i<nodeNum;i++)
		 {
			 current = current.getNext();
		 }	 
		 
		return current.getData();
	 }

}
