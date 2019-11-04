package tdt.duan2.exception;

public class NotFound extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotFound(String message,Throwable err) {
		super(message, err);
	}
}
