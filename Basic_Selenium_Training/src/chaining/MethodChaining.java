package chaining;

public class MethodChaining {
	public void display() {
		System.out.println("Big Boss");
	}
	
	public void show() {
		this.display();
		System.out.println("Splitsvilla");
	}
	
	public void present() {
		this.show();
		System.out.println("Kahtro ke Khiladi");
	}
}
