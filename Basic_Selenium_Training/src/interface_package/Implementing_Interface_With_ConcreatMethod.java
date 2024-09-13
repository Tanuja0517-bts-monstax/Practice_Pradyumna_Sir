package interface_package;

public class Implementing_Interface_With_ConcreatMethod implements Interface_With_Concreat_Method{
	public void method1() {
		System.out.println("Providing both to abstract method of Interface_With_Concreat_Method interface");
	}
	
	public static void main(String[] args) {
		Implementing_Interface_With_ConcreatMethod obj=new Implementing_Interface_With_ConcreatMethod();
		obj.method1();
		obj.method2();
		Interface_With_Concreat_Method.method3();
	}
}
