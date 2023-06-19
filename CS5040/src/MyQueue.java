import java.util.ArrayList;

public class MyQueue<T> extends ArrayList<T>{
	final int MAX_SIZE = 10;
	int first;
	int last;
	
	MyQueue(){
		first = 0;
		last = -1;
	}
	public boolean isEmpty(){
		return size() == 0;
	}
	public boolean isFull() {
		return size() == MAX_SIZE;
	}
	
	public T enqueue(T element) throws QueueException{
		if(!isFull()) {
			last++;
			add(last, element);
			return get(last);
		}
		throw new QueueException("enqueue failed: queue is full");
	}
	public T dequeue() throws QueueException{
		if(!isEmpty())
		{
			T temp = get(first);
			remove(first);
			last--;
			return temp;
		}
		throw new QueueException("dequeue() failed: queue is empty");
	}
	public T front() throws QueueException{
		if(!isEmpty())
			return get(first);
		throw new QueueException("front() failed: queue is empty");
	}
}