package abstractionEg;

public class CarInformation extends Car{
	String name;
	String fType;
	int sCap;
	boolean abag;
	public void carDetails(String cName,String fType,int sCapacity,boolean airBag) {
		name=cName;
		this.fType=fType;
		sCap=sCapacity;
		abag=airBag;
	}
	
	public String toString() {
		return "Car name:"+name+" fuel type:"+fType+" seating ccapacity:"+sCap+" Air Bag:"+abag;
	}
}
