package casting;

public class Student implements Engineering,Graduation{
	public void collegeInfo(String cname,int noDept,String address) {
		System.out.println("College Name:"+cname+" Number of Dept in college:"+noDept+" College address:"+address);
	}
	public void deptInfo(String college,String branch,String  yr,double fee,int admissionYear) {
		System.out.println("College:"+college+" Branch:"+branch+" Year you are:"+yr+" Fee:"+fee+" Year of admission:"+admissionYear);
	}
}
