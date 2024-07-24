package hasARelationship;

public class EarlyBinding {
	boolean charger;
	
	public EarlyBinding(boolean charger) {
		this.charger=charger;
	}
//	public void isCharger(boolean charger) {
//		this.charger=charger;
//	}
	
	public void display() {
		if(charger==true)
			System.out.println("Mobile is with charger☺☺");
		else
			System.out.println("Mobile is without charger😥😥");
	}
}
