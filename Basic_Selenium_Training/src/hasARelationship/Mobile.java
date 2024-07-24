package hasARelationship;

public class Mobile extends LazyBinding{
	String name,model;
	double price;
	boolean mobileC;
	
	public Mobile(String name,String model,double price,boolean mobileC)	{
		super(mobileC);
		this.name=name;
		this.model=model;
		this.price=price;
		this.mobileC=mobileC;
	}
	
	public void displayInfo() {
		System.out.println("Company name:"+name+" Model:"+model+" Price:"+price+" ");
	}
	
	public void withMobileCover() {
		LazyBinding lb=new LazyBinding(mobileC);
		if(mobileC==true) 
			System.out.println("Is with mobile cover❤❤");
		else
			System.out.println("Is without mobile cover😥😥");
	}
 }
