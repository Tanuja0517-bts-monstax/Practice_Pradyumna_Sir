package abstractionEg;

public abstract class Car {
	public abstract void carDetails(String cName,String fType,int sCapacity,boolean airBag);
	
	public Car() {
		System.out.println("constructor");
	}
	public void classInfo() {
		System.out.println("In Car class");
	}
	
	public static void display() {
		System.out.println("static method");
	}
}
