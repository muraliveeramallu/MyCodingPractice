package algorithams;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class GrapWithAdjusentMatrix {

	static List<Node> nodes = new ArrayList<Node>();

	static class Node {
		int data;

		Node(int data) {
			this.data = data;
		}

		@Override
		public boolean equals(Object obj) {
			Node v = (Node) obj;
			return v.data == data;
		}

		@Override
		public int hashCode() {
			int result = (int) (data ^ (data >>> 32));
			return result;
		}

	}

	public static void main(String a[]) {

		Node node40 = new Node(40);
		Node node10 = new Node(10);
		Node node20 = new Node(20);
		Node node30 = new Node(30);
		Node node60 = new Node(60);
		Node node50 = new Node(50);
		Node node70 = new Node(70);

		nodes.add(node40);
		nodes.add(node10);
		nodes.add(node20);
		nodes.add(node30);
		nodes.add(node60);
		nodes.add(node50);
		nodes.add(node70);

		int[][] adjacentMAtrix = new int[][] { { 0, 1, 1, 0, 0, 0, 0 }, // Node 1: 40
				{ 0, 0, 0, 1, 0, 0, 0 }, // Node 2 :10
				{ 0, 1, 0, 1, 1, 1, 0 }, // Node 3: 20
				{ 0, 0, 0, 0, 1, 0, 0 }, // Node 4: 30
				{ 0, 0, 0, 0, 0, 0, 1 }, // Node 5: 60
				{ 0, 0, 0, 0, 0, 0, 1 }, // Node 6: 50
				{ 0, 0, 0, 0, 0, 0, 0 }, // Node 7: 70
		};

		GrapWithAdjusentMatrix graph = new GrapWithAdjusentMatrix();
		graph.traverseUSingBFS(node40, adjacentMAtrix);
		graph.traverseUSingDFS(node40, adjacentMAtrix);
		graph.traverseUsingDFSRecursion(node40, adjacentMAtrix);
		graph.traverseUsingBFSRecursion(node40, adjacentMAtrix);

	}

	private void traverseUsingBFSRecursion(Node node40, int[][] adjacentMAtrix) {
		
		
	}

	private void traverseUsingDFSRecursion(Node node40, int[][] adjacentMAtrix) {
		List<Integer> visited = new ArrayList<>();
		List<Node> adjNodes = getAdjNodes(node40, adjacentMAtrix);
		for (Node n : adjNodes) {
			if (n != null && !visited.contains(n.data)) {
				traverseUsingDFSRecursion(n,adjacentMAtrix);
			}
		}
	}

	private void traverseUSingDFS(Node node, int[][] adjacentMAtrix) {
		Stack<Node> stack = new Stack<Node>();
		List<Integer> visited = new ArrayList<>();
		stack.push(node);
		visited.add(node.data);
		while (!stack.isEmpty()) {
			Node vnode = stack.pop();
			visited.add(vnode.data);
			List<Node> adjNodes = getAdjNodes(vnode, adjacentMAtrix);
			for (Node n : adjNodes) {
				if (n != null && !visited.contains(n.data)) {
					stack.push(n);
					visited.add(n.data);
				}
			}
		}
	}
	
	private void traverseUSingBFS(Node node, int[][] adjacentMAtrix) {
		Queue<Node> queue = new LinkedList<Node>();
		List<Integer> visited = new ArrayList<>();
		queue.add(node);
		visited.add(node.data);
		while (!queue.isEmpty()) {
			Node vnode = queue.poll();
			visited.add(vnode.data);
			List<Node> adjNodes = getAdjNodes(vnode, adjacentMAtrix);
			for (Node n : adjNodes) {
				if (n != null && !visited.contains(n.data)) {
					queue.add(n);
					visited.add(n.data);
				}
			}
		}
	}

	private List<Node> getAdjNodes(Node node, int[][] adjacentMAtrix) {
		int nodeIndex = -1;
		List<Node> adjNodesList = new ArrayList<>();
		for (int i = 0; i <= nodes.size(); i++) {
			if (nodes.get(i).data == node.data) {
				nodeIndex = i;
				break;
			}
		}
		if (nodeIndex != -1) {
			for (int i = 0; i <= adjacentMAtrix[nodeIndex].length; i++) {
				if (adjacentMAtrix[nodeIndex][i] == 1) {
					adjNodesList.add(nodes.get(i));
				}
			}
		}

		return adjNodesList;
	}
}
