package customException;

import java.util.Scanner;

public class ReviewDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter product name:");
		String pname=sc.nextLine();
		System.out.print("Enter product quantity:");
		int pquantity=sc.nextInt();
		System.out.print("Enter customer review:");
		sc.nextLine();
		String review=sc.nextLine();
		System.out.print("Enter stars for the product:");
		double stars=sc.nextDouble();
		
		Amazon amazon=new Amazon(pname, pquantity);
		amazon.SetReview(review);
		amazon.setStars(stars);
		try {
			amazon.checkReview(review, stars);
		} catch(BadReviewException bre) {
			System.out.println("Sorry for the inconvenience, We will improve ourselves");
		}
		
		finally {
			System.out.println("Thank you for buying product from us😊😊");
		}
	}
}
