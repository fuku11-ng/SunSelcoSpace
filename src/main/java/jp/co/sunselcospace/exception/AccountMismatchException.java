package jp.co.sunselcospace.exception;

/**
 * @author 山下 諒
 */
public class AccountMismatchException extends Exception {
	public AccountMismatchException() {
		super();
	}
	
	public AccountMismatchException(String message) {
		super(message);
	}

	public AccountMismatchException(String message, Throwable cause) {
		super(message, cause);
	}

	public AccountMismatchException(Throwable cause) {
		super(cause);
	}
}
