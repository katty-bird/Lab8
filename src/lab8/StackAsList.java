package lab8;

import java.util.EmptyStackException;

public class StackAsList<T> implements Stack<T> {
	private Node first;
	private long size = 0;
	private Integer maxSize; // to check overflow
	
	// Constructor
	public StackAsList() {
		first = null;
		maxSize = 5; // maximum number of nodes
	}

	private class Node {
		public T data;
		public Node next;
	}

	@Override
	public long getSize() {
		return size;
	}
	
	@Override
	public String toString() {
		if (isEmpty()) {
			return "Empty stack";
		}
		return String.format("Stack size %s: top value %s", size, this.first.data);
	}
	
	
	@Override
	public void push(T e){
		Node newNode = new Node();
		newNode.data = e;
		newNode.next = first;
		first = newNode;
		
		size += 1;
		if (size > maxSize) throw new StackOverflowError();	
	}
	
	@Override
	public boolean isEmpty(){
		return (first == null);
	}
	
	@Override
	public T pop() {
		if (isEmpty()) throw new EmptyStackException();
		T data = first.data;
		first = first.next;
		size -= 1;
		return data;
	}
	
	@Override
	public T peek() {
		if (isEmpty()) return null;

		return first.data;
	}
}