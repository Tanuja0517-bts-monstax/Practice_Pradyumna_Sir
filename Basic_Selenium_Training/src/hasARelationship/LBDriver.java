package hasARelationship;

import java.util.Scanner;

public class LBDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter company name:");
		String name=sc.nextLine();
		System.out.print("Enter model name:");
		String model=sc.nextLine();
		System.out.print("Enter price of mobile:");
		double price=sc.nextDouble();
		boolean cover=true;
		
		Mobile mb=new Mobile(name,model,price,cover);
		mb.displayInfo();
		mb.withMobileCover();
		
//		Mobile m=null;	/*NullPointerException*/
//		m.displayInfo();
	}
}
