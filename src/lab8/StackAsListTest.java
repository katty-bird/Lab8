package lab8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.io.IOException;
import java.lang.StackOverflowError;

class StackAsListTest {

	private Stack<Integer> stack;
	
	@BeforeEach
	void setUp() throws Exception {
		stack = new StackAsList<Integer>();
	}

	@Test
	void getSizeTest() {
		stack.push(5);
		stack.push(3);
		assertEquals(2, stack.getSize());
	}
	
	@Test
	void isEmptyTest() {
		assertEquals(true, stack.isEmpty());
	}
	
	@Test
	void peekTest() {
		stack.push(8);
		stack.push(4);
		assertEquals(4, stack.peek());
	}
	
	@Test
	void popTest() {
		stack.push(2);
		assertEquals(2, stack.pop());
		assertEquals(0, stack.getSize());
	}
	
	@Test
	void throwsExceptionOnUnderflow() {
		assertThrows(EmptyStackException.class, () -> {
			stack.pop();
	    });
	}
		
}
