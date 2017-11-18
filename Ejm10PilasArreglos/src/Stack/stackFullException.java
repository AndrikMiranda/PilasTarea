package Stack;

public class stackFullException extends Exception {
	public stackFullException(){}
	public stackFullException(String causa){
		super (causa);
	}
	public stackFullException(Throwable causa){
		super (causa);
	}
}
