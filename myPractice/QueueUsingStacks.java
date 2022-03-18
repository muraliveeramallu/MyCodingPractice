package myPractice;
//https://www.geeksforgeeks.org/queue-using-stacks/
import java.util.Stack;

public class QueueUsingStacks {
	static Stack<Integer> q1 = new Stack<Integer>();
	static Stack<Integer> q2 = new Stack<Integer>();
	
	public static void main(String a[]) {
	
		
		enqueue(12);
		enqueue(21);
		enqueue(22);
		enqueue(23);
		enqueue(24);
		enqueue(25);
		System.out.println("->"+dequeue());
		enqueue(21);
		enqueue(32);
		enqueue(24);
		System.out.println("->"+dequeue());
		
		while(q1.empty()){
			System.out.println(q2.pop());
		}
	}
	
   public static void enqueue(int ele) {
	   while(!q1.isEmpty()){
		q2.push(q1.pop());
	   }
	   
	   q1.push(ele);
	   
	   while(!q2.isEmpty()){
			q1.push(q2.pop());
		   }
	   
	}

	private static int dequeue() {
		int x = q1.peek();  
        q1.pop();  
        return x;  
	}

	
	

}
