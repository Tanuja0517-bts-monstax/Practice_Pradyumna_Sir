package upcasting_downcasting;

public class Parent {
	public void about(String name,int age,String famousMovie,String stageName) {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Famous movie:"+famousMovie);
		System.out.println("Stage Name:"+stageName);
	}
	
	public void behaviour() {
		System.out.println("Is fun loving, is not that strict, is not very famous");
	}
}
