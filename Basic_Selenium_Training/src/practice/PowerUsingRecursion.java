package practice;

import java.util.Scanner;

public class PowerUsingRecursion {
	public static int power(int num,int pow) {
		int temp=num;
	
		return power(num*temp,pow-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=sc.nextInt();
		System.out.print("Enter power:");
		int pow=sc.nextInt();
		System.out.print(power(num,pow));
	}
}
