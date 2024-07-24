package abstractionEg;

public abstract class Car {
	public abstract void carDetails(String cName,String fType,int sCapacity,boolean airBag);
	
	public void classInfo() {
		System.out.println("In Car class");
	}
}
