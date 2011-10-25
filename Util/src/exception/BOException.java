package exception;

public class BOException extends Exception {
	
	// STATICS...
	private static final long serialVersionUID = 4624695391063782846L;
	
	// CONSTRUCTORS...
	public BOException() { super(); }
	public BOException(String message) { super(message); }
	public BOException(Throwable throwable) { super(throwable); }
	public BOException(String message, Throwable throwable) { super(message, throwable); }
}
