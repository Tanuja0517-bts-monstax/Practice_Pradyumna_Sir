package exception;

import java.util.Scanner;

public class RuntimeExceptionEg2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st element:");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd element:");
		int num2=sc.nextInt();
		int result;
		if(num2==0) {
			//result=num1/num2;
			//System.out.println("Result:"+result);
			throw new ArithmeticException("issue with denominater");
		}
	}
}
