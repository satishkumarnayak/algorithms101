package algorithms.graphs.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

public class Graph1 {
	
	public int V;     // size of the Graph
	public LinkedList<Integer> vertices[];   // vertices
	private Queue<Integer> queue;
	
	public Graph1(int v) {
		this.V= v;
		vertices = new LinkedList[V];
		for(int i=0; i<V;++i) {
			vertices[i]= new LinkedList<>();  // adj list
		}
	}
	
	 

	public void addEdge(int i, int j) {
		vertices[i].add(j);
	}
	
	public void BFS(int ele) {
		
		queue = new LinkedList<Integer>();
		List<Integer> path = new ArrayList<Integer>();
	//	Boolean[] visited = new Boolean[V];
		boolean visited[] = new boolean[V];
		 for (Boolean bool : visited) {
		   bool = false;	
		}
		
		queue.add(ele);
		visited[ele]= true;
	
		
		path.add(ele);
		
		
		while(!queue.isEmpty()) {
			ele = queue.poll();
			LinkedList<Integer> adjList = vertices[ele];
			ListIterator<Integer> itr = adjList.listIterator();
			while(itr.hasNext()) {
				Integer n = itr.next();
				if(visited[n] == false) {
					queue.add(n);
					path.add(n);
					visited[n]=true;
				}
			}
		}
		
		for(Integer n : path) {
			System.out.println(n+" ");
		}
		
		/*LinkedList<Integer> adjList = vertices[ele];
		while(!adjList.isEmpty()) {
			for (Integer n : adjList) {
				queue.add(n);
				visited[n] = true;
				Integer v = queue.peek();
				LinkedList<Integer> adjList2 = vertices[v];
				for (Integer n1 : adjList2) {
				  if(visited[n1] == true) {
					  
				  } else {
					  queue.poll();
				  }
				}
			}
		}*/
		
		
		
		
		
		
		
	}
}
