// Class: CS 5040
// Term: Fall 2021
// Name: Sydney Bishop
// Program Number: Assignment 2
// IDE: Eclipse

public class MyLinkedListSydney <T> {
	Node head;
	Node tail;
	int size;

	public class Node{
		T data;
		Node link;
		Node(){
		}
		Node(T element){
			data = element;
			link = null;
		}
	}
	
	MyLinkedListSydney(){
		head = null;
		tail = null;
		size = 0;
	}
	
	public T getFirst() throws RuntimeException{
		// return the first element
		// if you don't have any element, throw RuntimeException with a message
		if(head == null) {
			throw new RuntimeException("in getFirst(): no elements in the list");
		}
		else {
			return head.data;
		}
	}
	
	public T getLast() throws RuntimeException{
		// return the last element
		// if you don't have any element, throw RuntimeException with a message
		if(tail == null) {
			throw new RuntimeException("in getLast(): no elements in the list");
		}
		else {
			return tail.data;
		}
	}
	
	public void addLast(T newElement){
		// add a new Node to be the last element.
		Node temp = new Node();
		temp.data = newElement;
		temp.link = null;
		
		if(size == 0) {
			head = tail = temp;
		}
		else {
			tail.link = temp;
			tail = temp;
		}
		size++;
	}
	
	public void removeLast(){
		// Case 1: if the list is empty --> throw any Exception with a message
		if(size == 0) {
			throw new RuntimeException("in removeLast(): no elements in the list");
		}
		
		else {
			// Case 3: in general case
			if(head != tail) {
				Node current = head;
				while(current.link != tail) {
					current = current.link;
				}
				tail = current;
				tail.link = null;
			}
			// Case 2: if you have only one elements
			else {
				head = tail = null;
			}
		}
	}
	
	public int indexOf(T targetElement){
		// search the targetElement in the list, return the index of given targetElement if it exists.
		// if the list doesn't have targetElement, return -1
		Node temp = head;
		int i = 0;
		
		while(temp.link != null) {
			String targetElement1 = (String)targetElement;
			String tempdata = (String)temp.data;
			
			if(tempdata.equals(targetElement1)) {
				return i;
			}
			else {
				temp = temp.link;
				i++;
			}
		}
		return -1;
	}
	public Iterator iterator(){
		// create a new Iterator object and return it.
		Iterator iter = new Iterator();
		return iter;
	}
	
	// Complete the Iterator class
	class Iterator {
		Node next; // to point [next node] object
		
		Iterator(){
			// next must be the first node of the list
			next = head;
		}
		public T next(){
			// return the data_field of [next node]
			T temp = next.data;
			next = next.link;
			return temp;
		}
		
		public boolean hasNext(){
			// return true when the [next node] exists
			// return false when we don't have the [next node]
			if(next == null){
				return false;
			}
			else {
				return true;
			}
		}
		
	}
	
	public void removeFirst() throws RuntimeException {
		if(head == null) {
			throw new RuntimeException("in removeFirst(): no elements in the list");
		}
		else if(head == tail) { // if(size==1)
			head = tail = null;
			size --;
		}
		else {
			head = head.link;
			size--;
		}
		
	}
	public void remove(int index) {
		if(index == 0) {
			removeFirst();
		}
		else if(head == tail) {
			head = tail = null;
			size--;
		} 
		else {
			Node cur = head;
			while (--index > 0) {
				cur = cur.link;
			}
			Node targetNode = cur.link;
			cur.link = targetNode.link;
			size--;
			if(cur.link == null)
				tail = cur;
		}
	}
	
	public void addFirst(T newElement){
		Node newNode = new Node(newElement);
		newNode.link = head;
		head = newNode;
		if(size==0) {
			tail = newNode;
		}
		size++;
	}
	
	public void add(int index, T newElement) {
		if(index == 0)
			addFirst(newElement);
		else {
			Node temp1 = head;
			while (--index > 0) {
				temp1 = temp1.link;
			}
			Node newNode = new Node(newElement);
			newNode.link = temp1.link;
			temp1.link = newNode;

			if (newNode.link == null) {
				tail = newNode;
			}
			size++;
		}
	}
	
	public String toString() {
		String str = "[";
		Node temp = head;
		
		while(temp != null) {
			str = str + temp.data;
			if(temp != tail) {
				str = str + ", ";
			}
			temp = temp.link;
		}		
		return str = str + "]";
	}
	
}
