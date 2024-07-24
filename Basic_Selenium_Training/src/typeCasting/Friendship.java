package typeCasting;

public class Friendship {
	public static void main(String[] args) {
		Aadi aadi=new Friend();
		aadi.about("Aadithya", "16-11-2000", "Research Scientest", 23);
		aadi.aboutAadiClass();
		System.out.println("**************************Type Casting****************************");
		Sup sup=(Sup)aadi;
		sup.details("Supriya Koli", "26-08-2000", "Software Engineer", 23);
		sup.aboutSupClass();
	}
}
