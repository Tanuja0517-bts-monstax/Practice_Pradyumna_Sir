package customException;

import java.util.Scanner;

public class Customer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the review:");
		try {
			FoodOrder fo=new FoodOrder("Biriyani",200.0);
			fo.setStatus(sc.nextLine());
			fo.checkStatus();
		}
		catch(FoodDeliveryReview fdr) {
			System.out.println("Sorry for inconvenience");
		}
		finally {
			System.out.println("Thank you for placing order♥");
		}
	}
}
