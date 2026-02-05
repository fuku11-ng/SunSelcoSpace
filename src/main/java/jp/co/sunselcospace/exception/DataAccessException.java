package jp.co.sunselcospace.exception;

/**
 * @author 山下 諒
 */
public class DataAccessException extends Exception {
	public DataAccessException() {
		super();
	}
	
	public DataAccessException(String message) {
		super(message);
	}

	public DataAccessException(String message, Throwable cause) {
		super(message, cause);
	}

	public DataAccessException(Throwable cause) {
		super(cause);
	}
}
