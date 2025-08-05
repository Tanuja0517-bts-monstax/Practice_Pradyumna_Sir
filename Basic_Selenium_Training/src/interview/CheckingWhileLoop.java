package interview;

public class CheckingWhileLoop {
	public void m1() {
		System.out.println("m1");
		m2();
	}
	public static void m2() {
		System.out.println("m2");
	}
	public static void main(String[] args) {
		CheckingWhileLoop obj = new CheckingWhileLoop();
		obj.m1();
		String s=new String("hi");
	}
}
