package datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class Stack2Test {

	Stack2 stack= new Stack2();
	
	//@Test
	public void push() {
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println(stack);
	}
//	@Test
	public void pop() {
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		stack.pop();
		stack.pop();
		
		System.out.println(stack);
	}
	
	@Test
	public void stack() {
		
		assertTrue(stack.isEmpty());
		stack.push(2);
		assertFalse(stack.isEmpty());
		stack.push(3);
		stack.push(4);
		assertEquals(4, stack.peek());
		stack.pop();
		assertEquals(3, stack.peek());
		stack.pop();
		assertEquals(2, stack.peek());
		System.out.println(stack);
	}
	
	

}
