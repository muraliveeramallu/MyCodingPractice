package algorithams;

import java.util.*;

public class HighestNumberOfAdjusentColors {

	static List<Node> nodes = new ArrayList<>();
			
	static class Node {
		String data;
		boolean visited;
		Node(String data){
			this.data = data;
		}
	}
	
	public static void main(String a[]) {
		HighestNumberOfAdjusentColors h = new HighestNumberOfAdjusentColors();
		Node g = new Node("G");
		Node r = new Node("R");
		Node b = new Node("B");
		nodes.add(g);
		nodes.add(r);
		nodes.add(b);
		
	}
}
