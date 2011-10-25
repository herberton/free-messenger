package exception;

public class DAOException extends Exception {
	// STATICS...
	private static final long serialVersionUID = -3169715128087357608L;
	
	// CONSTRUCTORS...
	public DAOException() { super(); }
	public DAOException(String message) { super(message); }
	public DAOException(Throwable throwable) { super(throwable); }
	public DAOException(String message, Throwable throwable) { super(message, throwable); }
}
