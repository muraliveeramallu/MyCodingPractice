package goldMan;

import java.util.*;

public class StackAndQueueUsingLinkedList {
	static List<Integer>  stack = new LinkedList<Integer>();
	static List<Integer>  queue = new LinkedList<Integer>();
	
	public static void main(String a[]) {
		Queue q = new Queue();
		q.enqueue(new Node(10));
		q.enqueue(new Node(11));
		q.enqueue(new Node(12));
		q.enqueue(new Node(13));
		q.enqueue(new Node(14));
		q.dequeue();
		q.dequeue();
		q.dequeue();
		
	}

}

class Node {
    int val;
    Node next;
  
    Node(int x) {
        val = x;
        next = null;
    }
}


class Stack{
    Node top;
    
    public Stack() {
    	top = null;
    }
  
    public Node peek(){
        if(top != null){
            return top;
        }
  
        return null;
    }
  
    public Node pop(){
        if(top == null){
            return null;
        }else{
            Node temp = new Node(top.val);
            top = top.next;
            return temp;   
        }
    }
  
    public void push(Node n){
        if(n != null){
            n.next = top;
            top = n;
        }
    }
}


class Queue{
    Node first, last;
    
    public Queue() {
    	first = last = null;
    }
  
    public void enqueue(Node n){
        if(first == null){
            first = n;
            last = first;
        }else{
           last.next = n;
            last = n;
        }
    }
  
    public Node dequeue(){
        if(first == null){
            return null;
        }else{
            Node temp = new Node(first.val);
            first = first.next;
            return temp;
        }   
    }
    
    class Queue1 { 
    	Node front, rear; 
      
        public Queue1() 
        { 
            this.front = this.rear = null; 
        } 
      
        // Method to add an key to the queue. 
        void enqueue(int key) 
        { 
      
            // Create a new LL node 
        	Node temp = new Node(key); 
      
            // If queue is empty, then new node is front and rear both 
            if (this.rear == null) { 
                this.front = this.rear = temp; 
                return; 
            } 
      
            // Add the new node at the end of queue and change rear 
            this.rear.next = temp; 
            this.rear = temp; 
        } 
      
        // Method to remove an key from queue. 
        Node dequeue() 
        { 
            // If queue is empty, return NULL. 
            if (this.front == null) 
                return null; 
      
            // Store previous front and move front one node ahead 
            Node temp = this.front; 
            this.front = this.front.next; 
      
            // If front becomes NULL, then change rear also as NULL 
            if (this.front == null) 
                this.rear = null; 
            return temp; 
        } 
    } 
}
