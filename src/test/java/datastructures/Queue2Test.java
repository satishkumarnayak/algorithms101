package datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class Queue2Test {

	@Test
	public void add() {
		Queue2 queue = new Queue2();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		
		assertEquals(3,queue.size());
		
		queue.remove();
		assertEquals(2,queue.size());
	}

}
