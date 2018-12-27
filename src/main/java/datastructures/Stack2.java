package datastructures;

public class Stack2 {
	
	private static class Node {
		int data;
		Node next;
	}	
	Node head;
	public void push(int data) {
		Node newNode = new Node();
		 newNode.data = data;
	     if(head == null) {	    
	    	 head = newNode;
	    	 return;
	     } 
	     newNode.next = head;
	     head = newNode;	     
	}
	
	public void pop() {
		if(head == null) {
			return;
		}
		
		head = head.next;		
	}
	
	public int peek() {
		return head.data;
	}
	
	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}

}
