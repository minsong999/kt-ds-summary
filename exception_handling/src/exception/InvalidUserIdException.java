package exception;

//사용자 예외는 항상 RuntimeException을 상속받아 사용한다.
public class InvalidUserIdException extends RuntimeException {
	public InvalidUserIdException() {
		super();
	}

	public InvalidUserIdException(String message) {
		super(message);
	}

	public InvalidUserIdException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidUserIdException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidUserIdException(Throwable cause) {
		super(cause);
	}
}
