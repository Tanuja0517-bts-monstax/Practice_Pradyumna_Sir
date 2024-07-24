package encapsulation;

public class InstaDriver {
	public static void main(String[] args) {
		Instagram insta=new Instagram("tanuja","tanuja@123","hii tanuja here");
		
		String un=insta.getUsername();
		String pass=insta.getPassword("tanuja@123");
		String bio=insta.getBio();
		
		System.out.println("Un:"+insta.getUsername()+" Password:"+insta.getPassword("tanuja@123")+" bio:"+insta.getBio());
		
		insta.setUsername(un, "sujata");
		
		System.out.println("Un:"+insta.getUsername()+" Password:"+insta.getPassword("tanuja@123")+" bio:"+insta.getBio());
		insta.setPassword(pass, "Tanuja");
		
	}
}
