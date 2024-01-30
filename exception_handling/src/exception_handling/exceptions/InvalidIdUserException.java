package exception_handling.exceptions;

/**
 * 시스템 계정으로 회원가입을 하려는 시도를 막아주는 예외
 */

public class InvalidIdUserException extends RuntimeException {
	private static final long serialVersionUID = 2381240728709814173L; // long type 난수

	public InvalidIdUserException(String message) {
		super(message);
	}

	public InvalidIdUserException(String message, Throwable cause) {
		super(message, cause);
	}
}
