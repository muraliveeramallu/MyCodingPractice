package algorithams;

//https://github.com/eugenp/tutorials/blob/master/core-java/src/main/java/com/baeldung/graph/Graph.java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class Graph {
	private Map<Vertex, List<Vertex>> adjVertices;

	Graph() {
		this.adjVertices = new HashMap<Vertex, List<Vertex>>();
	}

	void addVertex(int data) {
		adjVertices.putIfAbsent(new Vertex(data), new ArrayList<>());
	}

	void removeVertex(int data) {
		Vertex v = new Vertex(data);
		adjVertices.values().stream().map(e -> e.remove(v)).collect(Collectors.toList());
		adjVertices.remove(new Vertex(data));
	}

	void addEdge(int data1, int data2) {
		Vertex v1 = new Vertex(data1);
		Vertex v2 = new Vertex(data2);
		adjVertices.get(v1).add(v2);
		adjVertices.get(v2).add(v1);
	}

	void removeEdge(int data1, int data2) {
		Vertex v1 = new Vertex(data1);
		Vertex v2 = new Vertex(data2);
		List<Vertex> eV1 = adjVertices.get(v1);
		List<Vertex> eV2 = adjVertices.get(v2);
		if (eV1 != null)
			eV1.remove(v2);
		if (eV2 != null)
			eV2.remove(v1);
	}

	List<Vertex> getAdjVertices(int data) {
		return adjVertices.get(new Vertex(data));
	}

	String printGraph() {
		StringBuffer sb = new StringBuffer();
		for (Vertex v : adjVertices.keySet()) {
			sb.append(v);
			sb.append(adjVertices.get(v));
		}
		return sb.toString();
	}

	class Vertex {
		int data;

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		Vertex(int data) {
			this.data = data;
		}

		@Override
		public boolean equals(Object obj) {
			Vertex vertex = (Vertex) obj;
			return vertex.data == data;
		}

		@Override
		public int hashCode() {
			int result = (int) (data ^ (data >>> 32));
			return result;
		}

	}

	public Set<Integer> BFS(Graph graph, int root) {
		
		Set<Integer> visited = new HashSet<Integer>();
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(root);
		while(!q.isEmpty()) {
			int v =  q.poll();
			if(!visited.contains(v)) {
				visited.add(v);
				for(Vertex ver: graph.getAdjVertices(v) ) {
					q.add(ver.data);
				}
			}
		}
		
		return visited;

	}

	public void DFS(Graph g, int root) {
		Set<Integer> visted = new HashSet<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(root);
		while(!stack.isEmpty()) {
			int v = stack.pop();
			if(!visted.contains(v)) {
				visted.add(v);
				for(Vertex ver: g.getAdjVertices(v)) {
					stack.push(ver.data);
				}
			}
		}
		

	}

	public static void main(String a[]) {
		Graph g = new Graph();
		g.addVertex(10);
		g.addVertex(9);
		g.addVertex(8);
		g.addVertex(6);
		g.addVertex(3);
		g.addVertex(4);
		g.addVertex(12);
		g.addVertex(11);
		g.addEdge(10, 9);
		g.addEdge(10, 8);
		g.addEdge(10, 11);
		g.addEdge(9, 8);
		g.addEdge(8, 11);
		g.addEdge(8, 6);
		g.addEdge(6, 12);
		g.addEdge(6, 4);
		g.addEdge(12, 4);
		g.addEdge(12, 3);
		g.addEdge(4, 3);
		System.out.println(g.printGraph());

	}
}
