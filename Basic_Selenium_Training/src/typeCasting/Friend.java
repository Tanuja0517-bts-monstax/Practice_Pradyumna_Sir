package typeCasting;

public class Friend implements Aadi,Sup{

	@Override
	public void details(String name, String dob, String designation, int age) {
		System.out.println("Name:"+name);
		System.out.println("Date of birth:"+dob);
		System.out.println("Designation:"+designation);
		System.out.println("Age:"+age);
	}

	@Override
	public void aboutSupClass() {
		System.out.println("Method of Sup Interface");
		
	}

	@Override
	public void about(String name, String dob, String designation, int age) {
		System.out.println("Name:"+name);
		System.out.println("Date of birth:"+dob);
		System.out.println("Designation:"+designation);
		System.out.println("Age:"+age);
	}

	@Override
	public void aboutAadiClass() {
		System.out.println("Method of Aadi Interface");
	}

}
