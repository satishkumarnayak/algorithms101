package datastructures;

public class Queue2 {

	
	private class Node{
		int data;
		Node next;		
		
		private Node(int data) {
			data = data;			
		}
	}
	
	Node head;
	Node tail;
	int size;
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(tail == null) {
			tail = newNode;
			head = newNode;
			size++;
			return;
		}
		//tail.next = head;
		tail.next = newNode;	
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public void remove() {
		
		head = head.next;
		
		 if (head == null) {
	            tail = null;
	        }
		 size--;
		return ;
		 
		 
		
	}

	
	
}
