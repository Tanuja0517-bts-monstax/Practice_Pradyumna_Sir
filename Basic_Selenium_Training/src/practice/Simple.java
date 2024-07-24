      package practice;

public class Simple {
	String ch="a";
	public static void main(String[] args) {
		Simple s1=new Simple();
		//s1.ch='l';
		System.out.println(s1.ch);
		s1.display();
	}
	public static void display() {
		Simple s1=new Simple();
		//s1.ch='p';
		String str=s1.ch;
		s1.ch="Hi";
		System.out.println(s1.ch);
	}
}
