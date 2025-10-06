package number;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		System.out.println("Factorial of "+num+" is "+Factorial.factoriall(num));
	}
	
	public static int factoriall(int num) {
		int temp=1;
		for(int i=2;i<=num;i++ ) {
			temp*=i;
		}
		return temp;
	}
}
