package customException;

public class BadReviewException extends Exception{
	public BadReviewException(String msg) {
		super(msg);
	}
}
