package hasARelationship;

public class EBMobile extends EarlyBinding{
	String name,model;
	double price;
	boolean mobileC;
	EarlyBinding eb;
	public EBMobile(String name,String model,double price,boolean mobileC)	{
		super(mobileC);
		this.name=name;
		this.model=model;
		this.price=price;
		this.mobileC=mobileC;
//		eb=new EarlyBinding();
//		eb.isCharger(mobileC);
	}
	
	public void displayInfo() {
		System.out.println("Company name:"+name+" Model:"+model+" Price:"+price+" ");
		display();
	}
}
