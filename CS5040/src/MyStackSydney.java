// Class: CS 5040
// Term: Fall 2021
// Name: Sydney Bishop
// Program Number: Assignment 3 Program 1
// IDE: Eclipse

import java.util.LinkedList;

public class MyStackSydney<E> extends LinkedList<E> {
	private static final long serialVersionUID = 1L;
	
	Node top;//create top element of stack
	
	MyStackSydney(){
		this.top = null;
	}
	
	class Node{ //define each node of stack
		E value;
		Node next;
		
		public Node(E value) {//initialize the stack
			this.value = value;
			next = null;
		}
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public int size() {
		   int size = 1;
		   for(Node n = top; n.next != null; n = n.next) {
			   size++;  
		   }
		   return size;
		}
	
	public E peek() {		
		return top.value;
	}
	
	public E pop() {
		
		E value = null;
		if(!isEmpty()) {
			top = top.next;
			value = top.value;
		}
		return value;
	}
	
	public void push(E value) {
		Node current = new Node(value);
		if(isEmpty()) {
			top = current;
		}
		else {
			current.next = top;
			top = current;
		}
	}
	
	public String toString() {
		String str = "";
		Node current = top;
		while (current != null) {
			str += current.value;
			current = current.next;
		}
		return str;
	}
}
