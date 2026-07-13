package customException;

public class StudentResult {
	public static void main(String[] args) {
		String name="asda";
		double percent=34.20;
		
		if(percent<35)
			throw new StudentStatus("Fail");
		else
			System.out.println("U r pass");
	}
}
