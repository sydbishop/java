import java.util.ArrayList;

public class MyStack<T> extends ArrayList<T>{
	private static final long serialVersionUID = 1L;

	final int MAX_SIZE = 10;
	int top;
	
	MyStack(){
		top = -1;
	}
	
	public boolean isFull() {
		return size() == MAX_SIZE;
	}
	public boolean isEmpty() {
		return size() == 0;
	}
	public boolean push(T newElement) throws StackException{
		if(!isFull()) {
			top++;
			add(top, newElement);
			return true;
		}
		throw new StackException("PUSH failed: Stack is full");
	}
	
	public T pop(){
		if(!isEmpty()) {
			T temp = get(top);
			this.remove(top);
			top--;			
			return temp;
		}
		throw new StackException("POP failed: Stack is empty");
	}
	
	public T top() {
		if(!isEmpty()) {
			return get(top);
		}
		throw new StackException("TOP failed: Stack is empty");
	}
	
}
