package exception;

public class SingletonException extends Exception {
	// STATICS...
	private static final long serialVersionUID = 7187068667383282000L;
	
	// CONSTRUCTORS...
	public SingletonException() { super(); }
	public SingletonException(String message) { super(message); }
	public SingletonException(Throwable throwable) { super(throwable); }
	public SingletonException(String message, Throwable throwable) { super(message, throwable); }
}
