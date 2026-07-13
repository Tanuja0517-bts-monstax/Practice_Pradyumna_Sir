package compileTimePolymorphism;

public class Main {
	public static void main(String[] args) {
		//Upcasting
		Animal a = new Dog();
		a.sound();
		
		//Downcasting
		Dog d = (Dog) a;
		d.sound();
	}
}
