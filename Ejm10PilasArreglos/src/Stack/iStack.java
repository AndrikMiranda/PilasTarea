package Stack;

public interface iStack<T> {
	public T pop() throws stackEmptyException;
	public void push(T value) throws stackFullException;
	public boolean isEmpty();
	public boolean isFull();
	public T Peek() throws stackEmptyException;
	public int size();
	public void Clear();
	public T Search( T value) throws stackEmptyException;
}
