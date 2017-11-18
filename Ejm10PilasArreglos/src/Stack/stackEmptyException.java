package Stack;

public class stackEmptyException extends Exception {
		public stackEmptyException(){}
		public stackEmptyException(String causa){
			super (causa);
		}
		public stackEmptyException(Throwable causa){
			super (causa);
		}
	}