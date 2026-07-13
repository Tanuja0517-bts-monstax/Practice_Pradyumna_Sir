package customException;

public class StudentStatus extends RuntimeException {
	public StudentStatus(String msg) {
		super(msg);
	}
}
