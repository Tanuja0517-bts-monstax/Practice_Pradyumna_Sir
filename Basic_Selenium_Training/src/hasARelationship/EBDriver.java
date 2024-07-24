package hasARelationship;

import java.util.Scanner;

public class EBDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter comapny name:");
		String  name=sc.nextLine();
		System.out.print("Enter model name:");
		String model=sc.nextLine();
		System.out.print("Enter the price:");
		double price=sc.nextDouble();
		boolean charger=true;
		
		EBMobile ebm=new EBMobile(name,model,price,charger);
		ebm.displayInfo();
	}
}
