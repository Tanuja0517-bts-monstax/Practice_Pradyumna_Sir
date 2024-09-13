package interface_package;

public class Implementing_Interface_Without_ConcreatMethod implements Interface_Without_Concreat_Method{
	
	public void display() {
		System.out.println("Overrided display method of Interface_Without_Concreat_Method interface");
	}
	
	public void show() {
		System.out.println("Overrided show method of Interface_Without_Concreat_Method interface");
	}
	
	public static void main(String[] args) {
		Implementing_Interface_Without_ConcreatMethod obj=new Implementing_Interface_Without_ConcreatMethod();
		obj.display();
		obj.show();
	}
}
