package customException;

public class FoodOrder {
	String dish;
	double price;
	private String status;
	public FoodOrder(String dish,double price) {
		this.dish=dish;
		this.price=price;
	}
	
	public void setStatus(String status) {
		this.status=status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void checkStatus() throws FoodDeliveryReview {
		if(this.status==null)
			System.out.println("Neutral reaction");
		else if(this.status.equalsIgnoreCase("Spoil")) 
			throw new FoodDeliveryReview("Food is Spoilt");
		else
			System.out.println("Thank you");
	}
}
