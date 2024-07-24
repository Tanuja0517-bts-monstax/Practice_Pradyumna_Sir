package customException;

public class Amazon {
	String pname;
	double pquantity;
	private double stars;
	private String review;
	public Amazon(String pname,double pquantity) {
		this.pname=pname;
		this.pquantity=pquantity;
	}
	
	public void setStars(double stars) {
		this.stars=stars;
	}
	
	public void SetReview(String review) {
		this.review=review;
	}
	
	public void display() {
		System.out.println("Product name:"+pname);
		System.out.println("Product quantity:"+pquantity);
		System.out.println("Product Review"+review);
		System.out.println("Product Stars:"+stars);
	}
	
	public void checkReview(String review,double star) throws BadReviewException {
		if(review.equalsIgnoreCase("Bad")||star<2.5) {
			throw new BadReviewException("Need to improve product quality");
		}
		else
			System.out.println("Thank you for your positive review");
	}
}
