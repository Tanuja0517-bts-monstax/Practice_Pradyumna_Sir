package chaining;

public class ConstructorChaining {
	public ConstructorChaining() {
		this(3.14f);
		System.out.println("no argument constructor");
	}
	
	public ConstructorChaining(int num) {
		System.out.println("Integer constructor "+num);
	}
	
	public ConstructorChaining(String str) {
		this(4);
		System.out.println("String constructor "+str);
	}
	
	public ConstructorChaining(float temp) {
		this("Hello");
		System.out.println("Float constructor "+temp);
	}
	
	public static void main(String[] args) {
		ConstructorChaining cc=new ConstructorChaining();
	}
}