package encapsulation;

public class Instagram {
	private String username;
	private String password;
	private String bio;
	
	public Instagram(String un,String pass,String bio) {
		username=un;
		password=pass;
		this.bio=bio;
	}
	
	public void setUsername(String oldUn, String newUn) {
		if(oldUn.equals(username)) {
			username=newUn;
			System.out.println("Username has been updated");
		}
		else
			System.out.println("Unauthorised user");
	}
	
	public void setPassword(String oldPw,String newPw) {
		if(oldPw.equals(password)) {
			password=newPw;
			System.out.println("Password has been updated");
		}
		else 
			System.out.println("Unauthorised user");
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword(String password) {
		if(this.password.equals(password))
			return password;
		else
			return "Unauthorised user";
	}
	
	public String getBio() {
		return bio;
	}
}
