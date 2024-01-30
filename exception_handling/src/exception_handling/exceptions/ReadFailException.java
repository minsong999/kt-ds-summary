package exception_handling.exceptions;

public class ReadFailException extends RuntimeException {

	private static final long serialVersionUID = 2588425091797741407L;

	public ReadFailException(String message) {
		super(message);
	}

	public ReadFailException(String message, Throwable cause) {
		super(message, cause);
	}
}
