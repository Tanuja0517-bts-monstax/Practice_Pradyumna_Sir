package practice;

public class MethodOverloading {
	public void add(int a,int b) {
		System.out.println("Sum of two integer values:"+(a+b));
	}
	
	public void add(float a,float b) {
		System.out.println("Sum of two float values:"+(a+b));
	}
	
	public void substract(long a,long b) {
		System.out.println("Substraction of two long values:"+(a-b));
	}
	
	public void substract(double a,double b) {
		System.out.println("Substraction of two double values:"+(a-b));
	}
	
	public void multiply(int a,long b) {
		System.out.println("Multiplication of one int one long value:"+(a*b));
	}
	
	public void multiply(float a,double b) {
		System.out.println("Multiplication of one float and one double value:"+(a*b));
	}
	
	public void divide(long a,int b) {
		System.out.println("Division between one long and one int:"+(a/b));
	}
	
	public void divide(double a,float b) {
		System.out.println("Division between one double and one float:"+(a/b));
	}
	
	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		mo.add(12.3f,3.2f);
		mo.substract(1234l,56l);
		mo.multiply(12, 23l);
		mo.divide(1231.342, 12.3f);
	}
}
