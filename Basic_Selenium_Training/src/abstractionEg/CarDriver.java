package abstractionEg;

import java.util.Scanner;

public class CarDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter car name:");
		String cname=sc.nextLine();
		System.out.print("Enter fuel type:");
		String fType=sc.next();
		System.out.print("Enter seating capacity:");
		int sCap=sc.nextInt();
		System.out.print("Enter whether there s air bag in car:");
		boolean aBag=sc.nextBoolean();
		
		CarInformation ci=new CarInformation();
		ci.carDetails(cname, fType, sCap, aBag);
		System.out.println(ci.toString());
		ci.classInfo();
	}
}
