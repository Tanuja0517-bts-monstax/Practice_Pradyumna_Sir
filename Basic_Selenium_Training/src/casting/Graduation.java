package casting;

public interface Graduation {
	public void deptInfo(String college,String brach,String  yr,double fee,int admissionYear);
	public default void show() {
		System.out.println("Show method");
	}
}
