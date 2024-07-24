package upcasting_downcasting;

public class Driver {
	public static void main(String[] args) {
		System.out.println("***************************************************************");
		
		//Parent 
		Parent p=new Parent();
		p.about("Amitabh Bachchan", 81, "Kalki", "Angry Young Man");
		p.behaviour();
		System.out.println("***************************************************************");
		
		//Child
		Child c=new Child();
		c.about("Amitabh Bachchan", 81, "Kalki", "Angry Young Man");
		c.behaviour();
		c.details("Abhishek Bachchan", 48, "Dhoom", "Bhaiyu");
		c.attitude();
		System.out.println("***************************************************************");
		
		//Upcasting
		p=c;
		p.about("Amitabh Bachchan", 81, "Kalki", "Angry Young Man");
		p.behaviour();
		//p.details("Abhishek Bachchan", 48, "Dhoom", "Bhaiyu");	//Compile time exception Undefined for the type parent
		System.out.println("***************************************************************");
		
		//Downcasting
		c=(Child)p;
		c.about("Amitabh Bachchan", 81, "Kalki", "Angry Young Man");
		c.behaviour();
		c.details("Abhishek Bachchan", 48, "Dhoom", "Bhaiyu");
		c.attitude();
		System.out.println("***************************************************************");
	}
}
