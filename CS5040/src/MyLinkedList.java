public class MyLinkedList <T> {
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
	
	MyLinkedList(){
		head = null;
		tail = null;
		size = 0;
	}
	public T getFirst() throws RuntimeException{
		// return the first element
		// if you don't have any element, throw RuntimeException with a message
		// Write code here
	}
	public T getLast() throws RuntimeException{
		// return the last element
		// if you don't have any element, throw RuntimeException with a message
		// Write code here
	}
	public void addLast(T newElement){
		// add a new Node to be the last element.
		// Write code here
	}
	public void removeLast(){
		// Case 1: if the list is empty --> throw any Exception with a message
		// Case 2: if you have only one elements
		// Case 3: in general case
		// Caution: you must care about the [tail] after removal
		// Write code here
		
	}
	
	public int indexOf(T targetElement){
		// search the targetElement in the list, return the index of given targetElement if it exists.
		// if the list doesn't have targetElement, return -1
		// Caution: index starts with 0  (the first element's index is 0)
		// Caution: to return index, you must check the index of node while you searching
		// Write code here
	}
	public Iterator iterator(){
		// Write code here
		// create a new Iterator object and return it.
	}
	
	// Complete the Iterator class
	class Iterator {
		Node next; // to point [next node] object
		
		Iterator(){
			// In this constructor, you must set next, current, prev variables
			// next must be the first node of the list
			// current and prev must be null when the Iterator is created
			// Write code here
		}
		public T next(){
			// return the data_field of [next node]
			// caution: update prev, current, next correctly
			// Write code here		
		}
		public boolean hasNext(){
			// return true when the [next node] exists
			// return false when we don't have the [next node]
			// Write code here
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
