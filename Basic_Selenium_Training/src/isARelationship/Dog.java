package isARelationship;

import java.util.Scanner;

public class Dog extends Animal{
	String breed;
	public Dog(String name,String breed) {
		super(name);
		this.breed=breed;
	}
	
	public void dogInfo() {
		System.out.println("Dog Breed:"+breed);
	}
}
