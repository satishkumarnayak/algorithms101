package algorithms.graphs.DFS;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class Graph1 {
	
	public int V ;
	public LinkedList<Integer> ajList[] ;
	
	public Graph1(int size) {
		this.V=size;
		ajList = new LinkedList[V];
		for(int i=0;i<V;i++) {
			ajList[i]= new LinkedList();
		}
	}
	
	public void addEdge(int i, int j) {
		ajList[i].add(j);
	}
	
	public void DFS(int i) {
		boolean[] visited = new boolean[V];
		Stack<Integer> stack = new Stack<Integer>();
		
		
		stack.push(i);
		visited[i]=true;
		
		while(!stack.isEmpty()) {
			
			Integer ele = (Integer) stack.pop();
			System.out.print(ele + " ");
			LinkedList<Integer> neighbours = ajList[ele];
			ListIterator<Integer> listIterator = neighbours.listIterator();
			while(listIterator.hasNext()) {
				Integer n = listIterator.next();
				if(visited[n]==false) {
					stack.push(n);
					visited[n]=true;
				//	System.out.println(n);
				}
			}
			
		}
	}

}
