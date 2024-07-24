package isARelationship;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter animal name:");
		String aname=sc.next();
		String breed;
		switch(aname) {
			case "Dog":
				System.out.print("Enter the breed:");
				sc.nextLine();
				breed=sc.next();
				Dog d=new Dog(aname,breed);
				d.displayName();
				d.dogInfo();
			break;
			
			case "Cat":
				System.out.print("Enter the breed:");
				sc.nextLine();
				breed=sc.nextLine();
				Cat c=new Cat(aname,breed);
				c.catInfo();
			break;
			
			default:
				System.out.println("Sorry we don't have that animal");
			break;
		}
	}
}
