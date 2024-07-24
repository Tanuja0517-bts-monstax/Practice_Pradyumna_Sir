package exception;

public class SimpeExceptionHandling {
	public static void main(String[] args) {
		SimpeExceptionHandling seh=new SimpeExceptionHandling();
			seh.divide();
			System.out.println("Hiii");
	}
	
	public void divide() {
		int a=100,b=0,c;
		try {
			c=a/b;
			System.out.println(c);
		} catch(ArithmeticException ae) {
			System.out.println("Exception handled");
		}
		System.out.println("Hello");
	}
}

