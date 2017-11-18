package Stack;

import java.lang.reflect.Array;
import node.Node;
import java.util.Iterator;

public class stack<T extends Comparable<T>> implements iStack<T>,Iterable<T> {
	private Node<T>start = null, end = null;
	private int tam = 0;
	private int count = 0;
	public int tamañoNodo = 10;
	Node<T> Top = new Node<>();
	
	public stack(){
		start = new Node<T>();
		start.setIndex(-1);
		end = new Node<T>();
		end.setIndex(-1);
		
	}
	
	public stack(int tamañoNodo) {
		// TODO Auto-generated constructor stub
		this.tamañoNodo = tamañoNodo;
		start = new Node<T>();
		start.setIndex(-1);
		end = new Node<T>();
		end.setIndex(-1);
			}


	@Override
	public Iterator<T> iterator() {
		
		return new Iterator<T>() {
			Node<T> tmp = start;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				tmp = tmp.getNext();
				return (tmp != null)?true:false;
			}
			
			@Override
			public T next() {
				// TODO Auto-generated method stub
				return tmp.getValue(); //data[_count--];
			}
			
		};
	}

	@Override
	public T pop() throws stackEmptyException {
		if(isEmpty()) throw new stackEmptyException("Pila vacia pariente!");
		
		T tmp;
		if(isEmpty())
			Top = Top.getBack();
		tmp = Top.getValue();
		end.setBack(end.getBack().getBack());
		count --;
		return tmp;
		//T tmp = data[Top--];
		//Top --;
		
	}

	@Override
	public void push(T value) throws stackFullException {
		if (isFull()) throw new stackFullException("La pila se encuentra llena");
		Node<T> Top = new Node<T>(value);
		if(Top == start){
			Top=Top.getNext();
			Top.setValue(value);
		}else{
			Top.setValue(value);
		}
		count++;
		if(!isFull())
			Top=Top.getNext();
		//data[++Top]=value; 
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (count == 0);
	}

	@Override
	public boolean isFull() {
		
		return (count == tamañoNodo);
	}
	
	@Override
	public T Peek() throws stackEmptyException {
		if(isEmpty()) throw new stackEmptyException("Pila vacia pariente!");
		Node<T> Top = new Node<T>();
		if (isFull()) return Top.getValue();
			return Top.getBack().getValue();
		//return data[Top];
	}
	 
	@Override
	public int size() {
		return count;
	}

	@Override
	public void Clear() {
		Node<T> tmp = start;
		while(tmp != null){
			tmp = tmp.getNext().getNext();
			tmp.setValue(null);
		
		}
		count = 0;
		Top = start;
		
	}
	
	@Override
	public T Search(T value) throws stackEmptyException {
		if(isEmpty()) throw new stackEmptyException("Pila vacia Viejon");
		for (T t : data) {
		if(t.equals(value))
			return t;
		}
		return null;
	}
	
}
