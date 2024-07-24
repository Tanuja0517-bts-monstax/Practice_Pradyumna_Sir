package isARelationship;

public class Cat extends Animal{
	String breed;
	public Cat(String aname,String breed) {
		super(aname);
		this.breed=breed;
	}
	
	public void catInfo() {
		displayName();
		System.out.println("Cat Breed:"+breed);
	}
}
