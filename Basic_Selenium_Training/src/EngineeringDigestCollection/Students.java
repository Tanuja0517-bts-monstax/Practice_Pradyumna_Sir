package EngineeringDigestCollection;

public class Students {
		private String name;
		private double gpa;
		private int rollNo;
		
		public Students(String name, double gpa, int rollN0) {
			this.name=name;
			this.gpa=gpa;
			this.rollNo=rollN0;
		}
		
		public String getName() {
			return name;
		}
		
		public double getGpa() {
			return gpa;
		}
		
		public int getRollNo() {
			return rollNo;
		}
}
