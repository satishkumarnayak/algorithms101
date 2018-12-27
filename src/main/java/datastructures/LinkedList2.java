package datastructures;

public class LinkedList2 {

	private static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}

	}

	private Node head;
	
	public void addFront(int data) {
	
		//Create a new node
		Node newNode = new Node(data);
		
		//if first node
		if(head == null) {
		    head = newNode;	
		    return;
		}
		
		// new node point to head
		newNode.next = head;
		
		// newNode becomes head node
		head = newNode;
	}

	public Object getFirst() {	
		return head.data;
	}

	public Object getLast() {		
		
		Node current = head;
		while(current.next != null) {
			current = current.next; 
		}
		return current.data;
	}

	public void addBack(int data) {

		// create a node

		Node newNode = new Node(data);
		
		// if now elements
		if(head == null) {
			head = newNode;
			return;
		}

		// traverse to the end
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		// last node to point to new last node
		current.next = newNode;

		// last node point to null

		newNode.next = null;

	}

	public Object size() {
	 int size = 1; 
		
	//	if no elements/only head
		
		if(head == null) {
			return 0;
		}
		
	// traverse till end and with loop keep incrementing size
		Node current = head;	
		if(current.next == null) {
			return size;
		}
		while(current.next!=null) {
			current = current.next;
			size++;
		}
		return size;
	}

	public void clear() {		
		
		 head = null;
		/*if(head == null) {
			return;
		}
		
		if(head != null) {
			head.next=null;
		}*/
	}

	public void deleteValue(int data) {
		
		if(head == null) {
			return;
		}
		
		if(head != null) {
			if(head.data == data) {
				head = head.next;
			}					
		}
		
		Node current = head;
		while(current.next != null) {
			if(current.next.data == data) {
				current.next=current.next.next;
				return;
			}
			
			current =current.next; 
		}
		
		
	/*	if(head != null) {
			Node previousNode = head;
			Node current = head;
			Node nextNode = head.next;
			while(current.next != null) {														
				if(current.data == data) {					
					current.next=null;
					previousNode.next=nextNode;
					return;
				}
				current = current.next;
				nextNode = current.next.next;
				previousNode = current;	
			}
		}*/
		
	}
	
	

}
